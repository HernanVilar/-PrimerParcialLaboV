package com.example.parciallabo;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class FormularioPersona extends AppCompatActivity {
    EditText nombreUsuario;

    EditText Contrasenia;
    EditText NuevaContraseniUsuario;

    RadioButton input_tipo_administrador;
    RadioButton input_tipo_usuario;
    Button button_guardar;

    int posicionPersonaClickeada;

    Persona ObjectoActual;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intencion = getIntent();
        setContentView(R.layout.activity_formulario_persona);
        Log.d("cl","TipoActual"+"llegoooo");
        ActionBar actionBar = super.getSupportActionBar();
        actionBar.setTitle("Editar usuario");
        actionBar.setDisplayHomeAsUpEnabled(true);
        Bundle bundle = super.getIntent().getExtras();
        this.ObjectoActual =(Persona) bundle.getSerializable("Usuario");
        this.nombreUsuario = findViewById(R.id.edUsuario);
        this.Contrasenia = findViewById(R.id.edContrasenia);
        this.NuevaContraseniUsuario = findViewById(R.id.edNuevaContrasenia);

        this.input_tipo_administrador = findViewById(R.id.radioButtonOption1);
        this.input_tipo_usuario = findViewById(R.id.radioButtonOption2);
        this.button_guardar = findViewById(R.id.boton);
        this.nombreUsuario.setText(this.ObjectoActual.getNombrePersona());
        this.Contrasenia.setText(this.ObjectoActual.getContrasenia());
        this.NuevaContraseniUsuario.setText(this.ObjectoActual.getContrasenia());
        Log.d("dasda","TipoActual"+this.ObjectoActual.getTipoUsuario());
        this.posicionPersonaClickeada = (int) intencion.getExtras().get("posicionPersonaClickeada");

        if ("Administrador".equals(this.ObjectoActual.getTipoUsuario()))
        {
            Log.d("asda","Entro, error");
            this.input_tipo_administrador.setChecked(true);
            this.input_tipo_usuario.setChecked(false);
        }
        else
        {
            this.input_tipo_administrador.setChecked(false);
            this.input_tipo_usuario.setChecked(true);
        }
        //Log.d("das", "El valor entero es: " + Integer.toString(posicionPersonaClickeada));
        ClickListPersona clickLstnForm = new ClickListPersona(this.posicionPersonaClickeada, this.nombreUsuario, this.Contrasenia, this.NuevaContraseniUsuario ,  this.input_tipo_administrador, this.input_tipo_usuario,this);
        this.button_guardar.setOnClickListener(clickLstnForm);

    }
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==android.R.id.home)
        {
            super.finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
