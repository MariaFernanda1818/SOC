package edu.co.ucaldas.ingenieria.poo.ciberseguridad.controller;

import java.time.LocalDate;

public class Amenaza {

    private String idAmenaza;
    private String nombreAmenaza;
    private String descripcionAmenaza;
    private int numeroAtaques;
    private LocalDate fechaDeteccion;
    private String nivelRiesgo;
    private String fuente;

    public Amenaza(String idAmenaza, String nombreAmenaza, String descripcionAmenaza, int numeroAtaques, LocalDate fechaDeteccion, String nivelRiesgo, String fuente) {
        this.idAmenaza = idAmenaza;
        this.nombreAmenaza = nombreAmenaza;
        this.descripcionAmenaza = descripcionAmenaza;
        this.numeroAtaques = numeroAtaques;
        this.fechaDeteccion = fechaDeteccion;
        this.nivelRiesgo = nivelRiesgo;
        this.fuente = fuente;
    }
    public Amenaza() {
    }

    public String getIdAmenaza() {
        return idAmenaza;
    }

    public void setIdAmenaza(String idAmenaza) {
        this.idAmenaza = idAmenaza;
    }

    public String getNombreAmenaza() {
        return nombreAmenaza;
    }

    public void setNombreAmenaza(String nombreAmenaza) {
        this.nombreAmenaza = nombreAmenaza;
    }

    public String getDescripcionAmenaza() {
        return descripcionAmenaza;
    }

    public void setDescripcionAmenaza(String descripcionAmenaza) {
        this.descripcionAmenaza = descripcionAmenaza;
    }

    public int getNumeroAtaques() {
        return numeroAtaques;
    }

    public void setNumeroAtaques(int numeroAtaques) {
        this.numeroAtaques = numeroAtaques;
    }

    public LocalDate getFechaDeteccion() {
        return fechaDeteccion;
    }

    public void setFechaDeteccion(LocalDate fechaDeteccion) {
        this.fechaDeteccion = fechaDeteccion;
    }

    public String getNivelRiesgo() {
        return nivelRiesgo;
    }

    public void setNivelRiesgo(String nivelRiesgo) {
        this.nivelRiesgo = nivelRiesgo;
    }

    public String getFuente() {
        return fuente;
    }

    public void setFuente(String fuente) {
        this.fuente = fuente;
    }
}
