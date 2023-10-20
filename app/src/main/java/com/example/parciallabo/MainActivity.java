package com.example.parciallabo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public static List<Persona> listaUsuarios;
    AdapterPersona adapterPersona;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.listaUsuarios = new ArrayList<>();
        listaUsuarios.add(new Persona("nombre1","Administrador","123"));
        listaUsuarios.add(new Persona("nombre2","Usuario","1234"));
        listaUsuarios.add(new Persona("nombre3","Administrador","12345"));
        listaUsuarios.add(new Persona("nombre4","Usuario","123456"));
        listaUsuarios.add(new Persona("nombre5","Administrador","nombre5Ad"));
        listaUsuarios.add(new Persona("nombre6","Usuario","Nombre6Us"));
        listaUsuarios.add(new Persona("nombre7","Administrador","Nombre7Ad"));
        listaUsuarios.add(new Persona("nombre8","Usuario","Nombre8Us"));
        listaUsuarios.add(new Persona("nombre9","Administrador","Nombre9Ad"));
        listaUsuarios.add(new Persona("nombre10","Usuario","Nombre10Us"));
        listaUsuarios.add(new Persona("nombre11","Administrador","Nombre11Ad"));
        listaUsuarios.add(new Persona("nombre12","Usuario","Nombre12Us"));
        listaUsuarios.add(new Persona("nombre13","Administrador","Nombre13Ad"));
        listaUsuarios.add(new Persona("nombre14","Usuario","Nombre14Us"));
        listaUsuarios.add(new Persona("nombre15","Administrador","Nombre15Ad"));
        listaUsuarios.add(new Persona("nombre16","Usuario","Nombre16Us"));
        listaUsuarios.add(new Persona("nombre17","Administrador","Nombre17Ad"));
        listaUsuarios.add(new Persona("nombre18","Usuario","Nombre18Us"));
        listaUsuarios.add(new Persona("nombre19","Administrador","Nombre19Ad"));
        listaUsuarios.add(new Persona("nombre20","Usuario","Nombre20Us"));



        this.adapterPersona = new AdapterPersona(listaUsuarios,this);
        RecyclerView recyclerView = findViewById(R.id.rvPersona);
        recyclerView.setAdapter(adapterPersona);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
    }
    public void abrirFormularioEdicionPersona(int posicionPersonaClickeada)
    {
        Intent i = new Intent(this,FormularioPersona.class);
        i.putExtra("posicionPersonaClickeada", posicionPersonaClickeada);
        Persona u = new Persona(listaUsuarios.get(posicionPersonaClickeada).getNombrePersona(),listaUsuarios.get(posicionPersonaClickeada).getTipoUsuario(),listaUsuarios.get(posicionPersonaClickeada).getContrasenia());
        i.putExtra("Usuario",u);
        this.startActivity(i);
    }
    protected void onResume() {
        super.onResume();
        Log.d("click","SISISISISIISISIS");
        this.adapterPersona.notifyDataSetChanged();

    }
}