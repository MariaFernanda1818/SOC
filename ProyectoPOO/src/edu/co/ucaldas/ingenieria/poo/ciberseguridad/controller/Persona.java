package edu.co.ucaldas.ingenieria.poo.ciberseguridad.controller;

public class Persona {

    private String cedula;
    private String nombre;
    private String correoElectronico;
    private String area;

    private String cargo;
    private String direccion;
    private String telefono;

    public Persona() {
    }

    public Persona(String cedula, String nombre, String correoElectronico, String area, String cargo, String direccion, String telefono) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.area = area;
        this.cargo = cargo;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
