/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import Clases.cliente;
import javax.swing.JTable;

/**
 *
 * @author HiraldoTran
 */
public class DTOcliente {
    static cliente cli = new cliente();
    
    
    public static cliente getCliente()
    {
        return cli;
    }
    
    
    public static void llenarCliente (JTable jTable1)
    {
        cli.setF_id((int)jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 0));
        cli.setF_nombre((String)jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 1));
        cli.setF_apellido((String)jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 2));
        cli.setF_direccion((String)jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 3));
        cli.setF_cedula((String)jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 4));
        cli.setF_telefono1((String)jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 5));
        cli.setF_telefono2((String)jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 6));
        cli.setF_email((String)jTable1.getModel().getValueAt(jTable1.getSelectedRow(),7));
    }    
}
