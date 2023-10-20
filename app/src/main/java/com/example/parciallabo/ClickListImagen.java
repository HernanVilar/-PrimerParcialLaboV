package com.example.parciallabo;

import android.view.View;

public class ClickListImagen implements View.OnClickListener  {
    MainActivity main;
    int posicion;
    public ClickListImagen(MainActivity refMain, int posicion) {
        this.main = refMain;
        this.posicion = posicion;
    }


    public void onClick(View v) {
        main.abrirFormularioEdicionPersona(posicion);
    }
}
