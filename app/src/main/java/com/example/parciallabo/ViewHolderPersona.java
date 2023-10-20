package com.example.parciallabo;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class ViewHolderPersona extends RecyclerView.ViewHolder implements View.OnClickListener  {
    TextView tvNombreUsuario;
    TextView tvTipoUsuario;
    private ImageView tuImageView;
    int posicionElemSiendoLlamado;
    MainActivity mainAct;

    private ImageView imagen;

    public ViewHolderPersona(View itemView, MainActivity mainActRecibida) {
        super(itemView);
        this.mainAct = mainActRecibida;
        itemView.setOnClickListener(this);
        this.tvNombreUsuario = this.itemView.findViewById(R.id.tvNombreUsuario);
        this.tvTipoUsuario = this.itemView.findViewById(R.id.tvTipoUsuario);
    }

    @Override
    public void onClick(View v) {
        Log.d("click","Se hizo click en" + super.getAbsoluteAdapterPosition());
        //En el caso que lo haga con fila funciona bien.
        //posicionElemSiendoLlamado = super.getAbsoluteAdapterPosition();
        //mainAct.abrirFormularioEdicionPersona(super.getAbsoluteAdapterPosition());
        this.imagen = this.itemView.findViewById(R.id.imagen);
        ClickListImagen CI = new ClickListImagen(this.mainAct,super.getAbsoluteAdapterPosition());
        this.imagen.setOnClickListener(CI);

    }
}
