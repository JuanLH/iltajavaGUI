/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author Ivan Reyes
 */
public class Productos 
{
    
 private int f_id;
    private String f_nombre;
    private String f_descripcion;
    private int f_costo;
    private int f_precioVenta;
    private int f_precioAlquiler;
    private String f_alquilerVenta;
    private String f_cantidadALquiler;
    private String f_cantidadVenta;
    private String f_diasRecuperacion;

    public int getF_id() {
        return f_id;
    }

    public void setF_id(int f_id) {
        this.f_id = f_id;
    }

    public String getF_nombre() {
        return f_nombre;
    }

    public void setF_nombre(String f_nombre) {
        this.f_nombre = f_nombre;
    }

    public String getF_descripcion() {
        return f_descripcion;
    }

    public void setF_descripcion(String f_descripcion) {
        this.f_descripcion = f_descripcion;
    }

    public int getF_costo() {
        return f_costo;
    }

    public void setF_costo(int f_costo) {
        this.f_costo = f_costo;
    }

    public int getF_precioVenta() {
        return f_precioVenta;
    }

    public void setF_precioVenta(int f_precioVenta) {
        this.f_precioVenta = f_precioVenta;
    }

    public int getF_precioAlquiler() {
        return f_precioAlquiler;
    }

    public void setF_precioAlquiler(int f_precioAlquiler) {
        this.f_precioAlquiler = f_precioAlquiler;
    }

    public String getF_alquilerVenta() {
        return f_alquilerVenta;
    }

    public void setF_alquilerVenta(String f_alquilerVenta) {
        this.f_alquilerVenta = f_alquilerVenta;
    }

    public String getF_cantidadALquiler() {
        return f_cantidadALquiler;
    }

    public void setF_cantidadALquiler(String f_cantidadALquiler) {
        this.f_cantidadALquiler = f_cantidadALquiler;
    }

    public String getF_cantidadVenta() {
        return f_cantidadVenta;
    }

    public void setF_cantidadVenta(String f_cantidadVenta) {
        this.f_cantidadVenta = f_cantidadVenta;
    }

    public String getF_diasRecuperacion() {
        return f_diasRecuperacion;
    }

    public void setF_diasRecuperacion(String f_diasRecuperacion) {
        this.f_diasRecuperacion = f_diasRecuperacion;
    }

}
