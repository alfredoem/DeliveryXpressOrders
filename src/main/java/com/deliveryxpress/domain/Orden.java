/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.deliveryxpress.domain;

/**
 *
 * @author aespiritu
 */
public class Orden {

private TipoServicio tipoServicio;
private Integer cantidadPiezas;
private String codigoSeguimiento;
private String urlSeguimiento;
private String fechaHora;
private Destinatario destinatario;
private Vendedor vendedor;
private Pieza piezas;

    public Orden(TipoServicio tipoServicio, Integer cantidadPiezas, String codigoSeguimiento, String urlSeguimiento, String fechaHora, Destinatario destinatario, Vendedor vendedor, Pieza piezas) {
        this.tipoServicio = tipoServicio;
        this.cantidadPiezas = cantidadPiezas;
        this.codigoSeguimiento = codigoSeguimiento;
        this.urlSeguimiento = urlSeguimiento;
        this.fechaHora = fechaHora;
        this.destinatario = destinatario;
        this.vendedor = vendedor;
        this.piezas = piezas;
    }

    public TipoServicio getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(TipoServicio tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public Integer getCantidadPiezas() {
        return cantidadPiezas;
    }

    public void setCantidadPiezas(Integer cantidadPiezas) {
        this.cantidadPiezas = cantidadPiezas;
    }

    public String getCodigoSeguimiento() {
        return codigoSeguimiento;
    }

    public void setCodigoSeguimiento(String codigoSeguimiento) {
        this.codigoSeguimiento = codigoSeguimiento;
    }

    public String getUrlSeguimiento() {
        return urlSeguimiento;
    }

    public void setUrlSeguimiento(String urlSeguimiento) {
        this.urlSeguimiento = urlSeguimiento;
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(String fechaHora) {
        this.fechaHora = fechaHora;
    }

    public Destinatario getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Destinatario destinatario) {
        this.destinatario = destinatario;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Pieza getPiezas() {
        return piezas;
    }

    public void setPiezas(Pieza piezas) {
        this.piezas = piezas;
    }



    
}
