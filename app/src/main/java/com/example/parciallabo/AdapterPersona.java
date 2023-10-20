package com.example.parciallabo;

import android.app.Activity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterPersona extends RecyclerView.Adapter<ViewHolderPersona> {
    List<Persona> usuarios;
    private MainActivity mainAct;
    public AdapterPersona(List<Persona> usuarios,MainActivity mainActRecibida) {
        this.usuarios = usuarios;
        this.mainAct = mainActRecibida;
    }

    @NonNull
    @Override
    public ViewHolderPersona onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = null;
        v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_persona,parent,false);
        return new ViewHolderPersona(v,this.mainAct);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderPersona holder, int position) {
        Persona p = this.usuarios.get(position);
        holder.tvNombreUsuario.setText(p.getNombreUsuario());
        holder.tvTipoUsuario.setText(p.getTipoUsuario());
    }



    @Override
    public int getItemCount() {
        return this.usuarios.size();
    }
}
