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
 * @since 27/10/2020
 * @author Ivan chavarro
 * @author Karen Tibaquira
 */
@Named
@RequestScoped
public class IndexController {

    /**
     * Variable privada que guarda el nombre
     */
    private String nombre;
    /**
     * Variable privada que guarda la seleccion
     */
    private String seleccion;
    /**
     * Variable privada que guarda la cedula
     */
    private String cedula;
    /**
     * Variable privada que guarda el apellido
     */
    private String apellido;
    /**
     * Variable privada que guarda nivel educativo
     */
    private String nivEducativo;
    /**
     * Variable privada que guarda los idiomas
     */
    private String idiomas;
    /**
     * Variable privada que guarda los dias trabajados
     */
    private String diasTrabajados;
    /**
     * Variable privada que guarda el sueldo base
     */
    private String sueldoBase;
    /**
     * Variable privada que guarda los niveles educativos
     */
    private String[] nivelEducativo = {"Bachiller", "Tecnico", "Tecnologo", "Profesional", "Magister"};
    /**
     * Arreglo privado que guarda la seleccion de idiomas
     */
    private List<String> seleccionIdiomas;
    /**
     * Arreglo privado que guarda los idiomas
     */
    private List<String> guardarIdiomas;
    /**
     * Variable privada que guarda el mensaje del resultado
     */
    private String mensajeResultado;

    /**
     * metodo get de mensajeResultado
     *
     * @return MensajeResultado
     */
    public String getMensajeResultado() {
        return mensajeResultado;
    }

    /**
     * metodo set de mensajeResultado
     *
     * @param mensajeResultado
     */
    public void setMensajeResultado(String mensajeResultado) {
        this.mensajeResultado = mensajeResultado;
    }
    /**
     * Variable privada que guarda el pago final
     */
    private int pagoFinal;
    /**
     * Variable privada que guarda el auxiliar
     */
    private int aux;

    /**
     * constructor
     */
    public IndexController() {
        seleccionIdiomas = new ArrayList<String>();
        seleccionIdiomas.add("Mandarín");
        seleccionIdiomas.add("Ruso");
        seleccionIdiomas.add("Inglés");
        seleccionIdiomas.add("Portugues");
        seleccionIdiomas.add("Vientoñol");
    }

    /**
     * metodo click que muestra el mensaje
     */
    public void click() {
        pagoFinal = Integer.parseInt(diasTrabajados) * Integer.parseInt(sueldoBase);
        estudios();
        idiomas();
        mensajeResultado = "Señor " + this.nombre + " "
                + this.apellido + ", identificado con C.C " + this.cedula
                + ", su salario será de $" + pagoFinal;
    }

    /**
     * metodo estudios hace los calculos dependiendo del nivel educativo
     */
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

    /**
     * metodo de idiomas realiza el calculo del pago final
     */
    private void idiomas() {
        aux = guardarIdiomas.size() * 10000;
        pagoFinal += aux;
    }

    /**
     * metodo get de cedula
     *
     * @return cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * metodo set de cedula
     *
     * @param cedula
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * metodo get de apellido
     *
     * @return apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * metodo set de apellido
     *
     * @param apellido
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * metodo get de nivEducativo
     *
     * @return nivEducativo
     */
    public String getNivEducativo() {
        return nivEducativo;
    }

    /**
     * metodo set de nivEducativo
     *
     * @param nivEducativo
     */
    public void setNivEducativo(String nivEducativo) {
        this.nivEducativo = nivEducativo;
    }

    /**
     * metodo get de idiomas
     *
     * @return idiomas
     */
    public String getIdiomas() {
        return idiomas;
    }

    /**
     * metodo set de idiomas
     *
     * @param idiomas
     */
    public void setIdiomas(String idiomas) {
        this.idiomas = idiomas;
    }

    /**
     * metodo get de diasTrabajados
     *
     * @return diasTrabajados
     */
    public String getDiasTrabajados() {
        return diasTrabajados;
    }

    /**
     * metodo set de diasTrabajados
     *
     * @param diasTrabajados
     */
    public void setDiasTrabajados(String diasTrabajados) {
        this.diasTrabajados = diasTrabajados;
    }

    /**
     * metodo get de seleccion
     *
     * @return seleccion
     */
    public String getSeleccion() {
        return seleccion;
    }

    /**
     * metodo set de seleccion
     *
     * @param seleccion
     */
    public void setSeleccion(String seleccion) {
        this.seleccion = seleccion;
    }

    /**
     * metodo get de nivelEducativo
     *
     * @return nivelEducativo
     */
    public String[] getNivelEducativo() {
        return nivelEducativo;
    }

    /**
     * metodo set de nivelEducativo
     *
     * @param nivelEducativo
     */
    public void setNivelEducativo(String[] nivelEducativo) {
        this.nivelEducativo = nivelEducativo;
    }

    /**
     * metodo get de nombre
     *
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * metodo set de nombre
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * metodo get de seleccionIdiomas
     *
     * @return seleccionIdiomas
     */
    public List<String> getSeleccionIdiomas() {
        return seleccionIdiomas;
    }

    /**
     * metodo set de seleccionIdiomas
     *
     * @param seleccionIdiomas
     */
    public void setSeleccionIdiomas(List<String> seleccionIdiomas) {
        this.seleccionIdiomas = seleccionIdiomas;
    }

    /**
     * metodo get de guardarIdiomas
     *
     * @return
     */
    public List<String> getGuardarIdiomas() {
        return guardarIdiomas;
    }

    /**
     * metodo set de guardarIdiomas
     *
     * @param guardarIdiomas
     */
    public void setGuardarIdiomas(List<String> guardarIdiomas) {
        this.guardarIdiomas = guardarIdiomas;
    }

    /**
     * metodo get de sueldoBase
     *
     * @return sueldoBase
     */
    public String getSueldoBase() {
        return sueldoBase;
    }

    /**
     * metodo set de sueldoBase
     *
     * @param sueldoBase
     */
    public void setSueldoBase(String sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

}
