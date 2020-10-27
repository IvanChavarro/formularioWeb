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
    /**
     * Variables de carga desde el view
     */
    private String nombre;
    private String seleccion;
    private String cedula;
    private String apellido;
    private String nivEducativo;
    private String idiomas;
    private String diasTrabajados;
    private String sueldoBase;
    private String[] nivelEducativo = {"Bachiller", "Tecnico", "Tecnologo", "Profesional", "Magister"};
    private List<String> seleccionIdiomas;
    private List<String> guardarIdiomas;
    private String mensajeResultado;

    public String getMensajeResultado() {
        return mensajeResultado;
    }

    public void setMensajeResultado(String mensajeResultado) {
        this.mensajeResultado = mensajeResultado;
    }

    private int pagoFinal, aux;

    public IndexController() {
        seleccionIdiomas = new ArrayList<String>();
        seleccionIdiomas.add("Mandarín");
        seleccionIdiomas.add("Ruso");
        seleccionIdiomas.add("Inglés");
        seleccionIdiomas.add("Portugues");
        seleccionIdiomas.add("Vientoñol");

    }

    public void click() {
        pagoFinal = Integer.parseInt(diasTrabajados) * Integer.parseInt(sueldoBase);
        estudios();
        idiomas();
        mensajeResultado = "Señor "+this.nombre+" "
                +this.apellido+", identificado con C.C "+this.cedula+
                ", su salario será de "+pagoFinal;
    }

    private void estudios() {
        switch (this.nivEducativo) {
            case "Tecnico":
                pagoFinal += 5000;
                break;
            case "Tecnologo":
                pagoFinal += 15000;
                break;
            case "Profesional":
                pagoFinal += 30000;
                break;
            case "Magister":
                pagoFinal += 40000;
                break;
        }
    }

    private void idiomas() {
        aux =  guardarIdiomas.size()*10000;
        pagoFinal += aux;
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

    public String getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(String sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

}
