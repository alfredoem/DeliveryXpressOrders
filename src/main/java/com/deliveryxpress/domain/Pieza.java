/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.deliveryxpress.domain;

import java.lang.reflect.Array;
import java.util.List;

/**
 *
 * @author aespiritu
 */
public class Pieza {

    private double peso;
    private double alto;
    private double ancho;
    private double largo;
    private List<Item> items;
    private List<PiezaEstado> estados;
    private String etiquetaTamaño;

    public Pieza(double peso, double alto, double ancho, double largo, List<Item> items) {
        this.peso = peso;
        this.alto = alto;
        this.ancho = ancho;
        this.largo = largo;
        this.items = items;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public Integer getCantidadItems() {
        int cantidad = 0;
        for (Item item : this.items) {
            cantidad += item.getCantidad();
        }
        return cantidad;
    }


    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public List<PiezaEstado> getEstados() {
        return estados;
    }

    public void setEstados(List<PiezaEstado> estados) {
        this.estados = estados;
    }


    public void calcularEtiquetaTamaño() {

        if (this.peso <= 3) {
        this.etiquetaTamaño = "S";
        } else if(this.peso <= 10 ) {
        this.etiquetaTamaño = "M";
        } else if(this.peso <= 20 ) {
        this.etiquetaTamaño = "L";
        } else if(this.peso <= 35 ) {
        this.etiquetaTamaño = "X";
        } else if(this.peso <= 100 ) {
        this.etiquetaTamaño = "XL";
        } else {
        this.etiquetaTamaño = "NP";
        }
    }

    public String getEtiquetaTamaño() {
        return this.etiquetaTamaño;
    }

}
