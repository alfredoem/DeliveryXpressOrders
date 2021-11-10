/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.deliveryxpress.domain;

/**
 *
 * @author aespiritu
 */
public class Item {

    private static final Integer FACTOR_VOLUMETRICO = 5000;

    private String descripcion;
    private double valor;
    private double peso;
    private double alto;
    private double ancho;
    private double largo;
    private Integer cantidad;

    public Item(String descripcion, double valor, double peso, double alto, double ancho, double largo, Integer cantidad) {
        this.descripcion = descripcion;
        this.valor = valor;
        this.peso = peso;
        this.alto = alto;
        this.ancho = ancho;
        this.largo = largo;
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
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

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public double getPesoVolumetrico() {
        return (this.largo * this.alto * this.ancho) / this.FACTOR_VOLUMETRICO;
    }

    public double getPesoMayor() {
        return  this.getPesoVolumetrico() > this.peso ? this.getPesoVolumetrico() : this.peso;
    }



    
}
