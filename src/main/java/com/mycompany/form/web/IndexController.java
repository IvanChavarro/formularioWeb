/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.form.web;

import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author Iván
 */
@Named
@ViewScoped
public class IndexController{

    /**
     * Creates a new instance of IndexController
     */
    private String nombre, seleccion;

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
