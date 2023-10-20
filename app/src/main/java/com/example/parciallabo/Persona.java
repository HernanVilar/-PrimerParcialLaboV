package com.example.parciallabo;

import java.io.Serializable;

public class Persona implements Serializable {
    private String nombreUsuario;
    private String tipoUsuario;

    private String contrasenia;

    public String getNombrePersona() {
        return nombreUsuario;
    }

    public Persona(String nombreUsuario, String tipoUsuario,String contrasenia) {
        this.nombreUsuario = nombreUsuario;
        this.tipoUsuario = tipoUsuario;
        this.contrasenia = contrasenia;
    }
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
}
