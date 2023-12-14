package edu.co.ucaldas.ingenieria.poo.ciberseguridad.controller;

public class Usuario extends Persona{

    private String idUsuario;
    public Usuario(String cedula, String nombre, String correoElectronico, String area, String cargo, String direccion, String telefono) {
        super(cedula, nombre, correoElectronico, area, cargo, direccion, telefono);
    }
    public Usuario(String cedula, String nombre, String email, String departamento) {
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }
}
