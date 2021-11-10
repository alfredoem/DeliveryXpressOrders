/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.deliveryxpress.domain;

/**
 *
 * @author aespiritu
 */
public class PiezaEstado {

private Estado estado;
private String descripcion;
private String observacion;
private String motivo;
private String urlEvidencias;
private String fechaHora;

    public PiezaEstado(Estado estado, String descripcion, String observacion, String motivo, String urlEvidencias, String fechaHora) {
        this.estado = estado;
        this.descripcion = descripcion;
        this.observacion = observacion;
        this.motivo = motivo;
        this.urlEvidencias = urlEvidencias;
        this.fechaHora = fechaHora;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getUrlEvidencias() {
        return urlEvidencias;
    }

    public void setUrlEvidencias(String urlEvidencias) {
        this.urlEvidencias = urlEvidencias;
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(String fechaHora) {
        this.fechaHora = fechaHora;
    }


    
}
