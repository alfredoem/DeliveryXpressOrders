/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.deliveryxpress.domain;

/**
 *
 * @author aespiritu
 */
public class Destinatario {

private TipoDocumento tipoDocumento;
private String numeroDocumento;
private String nombre;
private String apellidos;
private String telefono;
private String email;
private String ubigeo;
private String direccion;
private String direccionReferecia;

    public Destinatario(TipoDocumento tipoDocumento, String numeroDocumento, String nombre, String apellidos, String telefono, String email, String ubigeo, String direccion, String direccionReferecia) {
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.email = email;
        this.ubigeo = ubigeo;
        this.direccion = direccion;
        this.direccionReferecia = direccionReferecia;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }



    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUbigeo() {
        return ubigeo;
    }

    public void setUbigeo(String ubigeo) {
        this.ubigeo = ubigeo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccionReferecia() {
        return direccionReferecia;
    }

    public void setDireccionReferecia(String direccionReferecia) {
        this.direccionReferecia = direccionReferecia;
    }




    
}
