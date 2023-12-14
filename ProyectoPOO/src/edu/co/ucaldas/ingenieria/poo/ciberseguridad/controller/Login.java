package edu.co.ucaldas.ingenieria.poo.ciberseguridad.controller;

public class Login {

    private String cedula;
    private String password;

    public Login(String cedula, String password) {
        super();
        this.cedula = cedula;
        this.password = password;
    }

    public Login() {
    }

    public String getCedula() {
        return cedula;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

}
