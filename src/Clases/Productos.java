/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import dto.*;

/**
 *
 * @author Ivan Reyes
 */
public class Productos 
{

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

    public int getF_precio_venta() {
        return f_precio_venta;
    }

    public void setF_precio_venta(int f_precio_venta) {
        this.f_precio_venta = f_precio_venta;
    }

    public int getF_precio_alquiler() {
        return f_precio_alquiler;
    }

    public void setF_precio_alquiler(int f_precio_alquiler) {
        this.f_precio_alquiler = f_precio_alquiler;
    }

    public String getF_alquiler_venta() {
        return f_alquiler_venta;
    }

    public void setF_alquiler_venta(String f_alquiler_venta) {
        this.f_alquiler_venta = f_alquiler_venta;
    }

    public String getF_cantidad_alquiler() {
        return f_cantidad_alquiler;
    }

    public void setF_cantidad_alquiler(String f_cantidad_alquiler) {
        this.f_cantidad_alquiler = f_cantidad_alquiler;
    }

    public String getF_cantidad_venta() {
        return f_cantidad_venta;
    }

    public void setF_cantidad_venta(String f_cantidad_venta) {
        this.f_cantidad_venta = f_cantidad_venta;
    }

    public String getF_dias_recuperacion() {
        return f_dias_recuperacion;
    }

    public void setF_dias_recuperacion(String f_dias_recuperacion) {
        this.f_dias_recuperacion = f_dias_recuperacion;
    }
    
    private int f_id;
    private String f_nombre;
    private String f_descripcion;
    private int f_costo;
    private int f_precio_venta;
    private int f_precio_alquiler;
    private String f_alquiler_venta;
    private String f_cantidad_alquiler;
    private String f_cantidad_venta;
    private String f_dias_recuperacion;

    
}
