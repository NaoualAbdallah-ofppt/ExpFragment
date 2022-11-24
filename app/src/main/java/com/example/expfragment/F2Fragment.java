package com.example.expfragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class F2Fragment extends Fragment {
    TextView txt1,txt2;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
View V =inflater.inflate(R.layout.fragment_f2, container, false);
     txt1=(TextView) V.findViewById(R.id.txtProduit);
        txt2=(TextView) V.findViewById(R.id.txtPrix);
    return  V;
    }
    public void afficher(String Produit, Float Prix)
    {
        Log.i("bb",Prix.toString());
        txt1.setText(Produit);
        txt2.setText(String.valueOf(Prix));
    }

}