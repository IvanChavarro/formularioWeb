/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.form.web;

import javax.enterprise.context.RequestScoped;

import javax.inject.Named;

/**
 *
 * @author Iván
 */
@Named
@RequestScoped
public class IndexController{

    /**
     * Creates a new instance of IndexController
     */
   private String nombre, seleccion, cedula, apellido, nivEducativo, idiomas, diasTrabajados;

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNivEducativo() {
        return nivEducativo;
    }

    public void setNivEducativo(String nivEducativo) {
        this.nivEducativo = nivEducativo;
    }

    public String getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(String idiomas) {
        this.idiomas = idiomas;
    }

    public String getDiasTrabajados() {
        return diasTrabajados;
    }

    public void setDiasTrabajados(String diasTrabajados) {
        this.diasTrabajados = diasTrabajados;
    }

    public String getSeleccion() {
        return seleccion;
    }

    public void setSeleccion(String seleccion) {
        this.seleccion = seleccion;
    }

    private String[] nivelEducativo = {"Bachiller", "Tecnico", "Tecnologo", "Profesional"};

    public String[] getNivelEducativo() {
        return nivelEducativo;
    }

    public void setNivelEducativo(String[] nivelEducativo) {
        this.nivelEducativo = nivelEducativo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarDatos() {
        System.out.println(this.nombre);
    }

}
