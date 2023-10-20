package com.example.parciallabo;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class ClickListPersona implements View.OnClickListener  {
    EditText Nombre;
    EditText Contraseña;

    EditText ConfirmarContrasenia;

    RadioButton Administrador;
    RadioButton Usuario;

    int posicionPersonaClickeada;

    Activity actividadFormulario;


    public ClickListPersona(int posicionPersonaClickeada,EditText input_nombreRecibido, EditText password, EditText ConfirmarContrasenia, RadioButton Administrador, RadioButton Usuario, Activity actividadFormularioRecibida)
    {
        this.posicionPersonaClickeada = posicionPersonaClickeada;
        this.Nombre = input_nombreRecibido;
        this.Contraseña = password;
        this.ConfirmarContrasenia = ConfirmarContrasenia;
        this.Administrador = Administrador;
        this.Usuario = Usuario;
        this.actividadFormulario = actividadFormularioRecibida;
    }

    @Override
    public void onClick(View v) {
        if(this.Administrador.isChecked())
        {
            Log.d("ESA123", "ESADMINISTRADOR: ");
        }
        else
        {
            Log.d("ESA123", "ESUSUARIO: ");
        }

        if(!this.Contraseña.getText().toString().equals(this.ConfirmarContrasenia.getText().toString()))
        {
            Toast.makeText(actividadFormulario, "Las contraseñas no coinciden", Toast.LENGTH_SHORT).show();
        }
        else if(this.Contraseña.getText().toString().length() <3)
        {
            Toast.makeText(actividadFormulario, "La contraseña es menor de 3 digitos", Toast.LENGTH_SHORT).show();
        }
        else
        {
            MainActivity.listaUsuarios.get(this.posicionPersonaClickeada).setNombreUsuario(this.Nombre.getText().toString());
            MainActivity.listaUsuarios.get(this.posicionPersonaClickeada).setContrasenia(this.Contraseña.getText().toString());
            if(this.Usuario.isChecked())
            {
                MainActivity.listaUsuarios.get(this.posicionPersonaClickeada).setTipoUsuario(this.Usuario.getText().toString());
            }
            else
            {
                MainActivity.listaUsuarios.get(this.posicionPersonaClickeada).setTipoUsuario(this.Administrador.getText().toString());
            }

            this.actividadFormulario.finish();
        }
    }
}
