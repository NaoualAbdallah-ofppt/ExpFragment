package com.example.expfragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.Set;
import java.util.TreeMap;
public class F1Fragment extends Fragment {
TreeMap<String,Float> MP = new TreeMap<String,Float>();
  ListView LV;

   @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       MP.put("Stylo",1.5f);
       MP.put("Gomme",3f);
       MP.put("crayon",5f);
       MP.put("Règle",8f);
      Set <String> A = MP.keySet();

      ArrayAdapter AA = new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1,A.toArray());

       View V =inflater.inflate(R.layout.fragment_f1, container, false);
    LV=(ListView) V.findViewById(R.id.LV);
LV.setAdapter(AA);

LV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Log.i("bb","OK");
        F2Fragment F = (F2Fragment) getParentFragmentManager().findFragmentById(R.id.fragment2);
        Log.i("bb","OKK");
        String nomP=LV.getItemAtPosition(i).toString();
        Log.i("bb","OKKK");
        Float  prixP=MP.get(nomP);
        Log.i("bb","OKKKK");

        F.afficher(nomP,prixP);
    }
});


        return V;
    }
}