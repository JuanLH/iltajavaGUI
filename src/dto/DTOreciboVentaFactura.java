/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author HiraldoTran
 */
public class DTOreciboVentaFactura {
    private int f_id;
    private int f_idCliente;
    private String f_concepto;
    private String f_Fecha;

    public int getF_id() {
        return f_id;
    }

    public void setF_id(int f_id) {
        this.f_id = f_id;
    }

    public int getF_idCliente() {
        return f_idCliente;
    }

    public void setF_idCliente(int f_idCliente) {
        this.f_idCliente = f_idCliente;
    }

    public String getF_concepto() {
        return f_concepto;
    }

    public void setF_concepto(String f_concepto) {
        this.f_concepto = f_concepto;
    }

    public String getF_Fecha() {
        return f_Fecha;
    }

    public void setF_Fecha(String f_Fecha) {
        this.f_Fecha = f_Fecha;
    }

    
    
}
