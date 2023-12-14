package edu.co.ucaldas.ingenieria.poo.ciberseguridad.controller;

public class Administrador extends Persona{

    private String idAdministrador;

    private String departamento;

    public Administrador(String cedula, String nombre, String correoElectronico, String area, String cargo, String direccion, String telefono, String idAdministrador, String departamento) {
        super(cedula, nombre, correoElectronico, area, cargo, direccion, telefono);
    }

    public Administrador(String cedula, String nombre, String departamento, String esAdministrador) {
    }

    public String getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(String idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
