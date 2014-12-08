/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import dto.*;

/**
 *
 * @author HiraldoTran
 */
public class ventaFactura {
    private int f_id;
    private String f_tipo_factura;
    private int f_id_t_cliente;
    private int f_id_t_usuario;
    private int f_monto;
    private int f_id_t_orden;
    private String f_fecha;
    private String f_hecha_por;
    private int f_balance;
    private boolean f_pagada;

    public int getF_id() {
        return f_id;
    }

    public void setF_id(int f_id) {
        this.f_id = f_id;
    }

    public String getF_tipo_factura() {
        return f_tipo_factura;
    }

    public void setF_tipo_factura(String f_tipo_factura) {
        this.f_tipo_factura = f_tipo_factura;
    }

    public int getF_id_t_cliente() {
        return f_id_t_cliente;
    }

    public void setF_id_t_cliente(int f_id_t_cliente) {
        this.f_id_t_cliente = f_id_t_cliente;
    }

    public int getF_id_t_usuario() {
        return f_id_t_usuario;
    }

    public void setF_id_t_usuario(int f_id_t_usuario) {
        this.f_id_t_usuario = f_id_t_usuario;
    }

    public int getF_monto() {
        return f_monto;
    }

    public void setF_monto(int f_monto) {
        this.f_monto = f_monto;
    }

    public int getF_id_t_orden() {
        return f_id_t_orden;
    }

    public void setF_id_t_orden(int f_id_t_orden) {
        this.f_id_t_orden = f_id_t_orden;
    }

    public String getF_fecha() {
        return f_fecha;
    }

    public void setF_fecha(String f_fecha) {
        this.f_fecha = f_fecha;
    }

    public String getF_hecha_por() {
        return f_hecha_por;
    }

    public void setF_hecha_por(String f_hecha_por) {
        this.f_hecha_por = f_hecha_por;
    }

    public int getF_balance() {
        return f_balance;
    }

    public void setF_balance(int f_balance) {
        this.f_balance = f_balance;
    }

    public boolean isF_pagada() {
        return f_pagada;
    }

    public void setF_pagada(boolean f_pagada) {
        this.f_pagada = f_pagada;
    }


}
