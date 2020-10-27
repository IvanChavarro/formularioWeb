/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.form.web;

import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;

import javax.inject.Named;

/**
 *
 * @author Iván
 */
@Named
@RequestScoped
public class IndexController {

    /**
     * Creates a new instance of IndexController
     */
    private String nombre;
    private String seleccion;
    private String cedula;
    private String apellido;
    private String nivEducativo;
    private String idiomas;
    private String diasTrabajados;
    private String[] nivelEducativo = {"Bachiller", "Tecnico", "Tecnologo", "Profesional"};
    private List<String> seleccionIdiomas;
    private List<String> guardarIdiomas;

    public IndexController() {
        seleccionIdiomas = new ArrayList<String>();
        seleccionIdiomas.add("Mandarín");
        seleccionIdiomas.add("Ruso");
        seleccionIdiomas.add("Inglés");
        seleccionIdiomas.add("Portugues");
        seleccionIdiomas.add("Vientoñol");

    }

    public void click() {
       /* System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + this.apellido);
        System.out.println("Cedula: " + this.cedula);
        System.out.println("Nivel educativo: " + this.nivEducativo);
        System.out.println("Idioma " + this.guardarIdiomas);
        System.out.println("Dias trabajados: " + this.diasTrabajados);
*/
        
    }

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

    public List<String> getSeleccionIdiomas() {
        return seleccionIdiomas;
    }

    public void setSeleccionIdiomas(List<String> seleccionIdiomas) {
        this.seleccionIdiomas = seleccionIdiomas;
    }

    public List<String> getGuardarIdiomas() {
        return guardarIdiomas;
    }

    public void setGuardarIdiomas(List<String> guardarIdiomas) {
        this.guardarIdiomas = guardarIdiomas;
    }

}
