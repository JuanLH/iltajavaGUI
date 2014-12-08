/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import Clases.Productos;
import static dto.DTOcliente.cli;
import javax.swing.JTable;

/**
 *
 * @author Ivan Reyes
 */
public class DTOProductos 
{

    static Productos p = new Productos();
    public static void llenarArticulo (JTable jTable1)
    {
        p.setF_id((int)jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 0));
        p.setF_nombre((String)jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 1));
        p.setF_descripcion((String)jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 2));
        p.setF_costo((int)jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 3));
        p.setF_precio_venta((int)jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 4));
        p.setF_precio_alquiler((int)jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 5));
        p.setF_alquiler_venta((String)jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 6));
        p.setF_cantidad_alquiler((String)jTable1.getModel().getValueAt(jTable1.getSelectedRow(),7));
        p.setF_cantidad_venta((String)jTable1.getModel().getValueAt(jTable1.getSelectedRow(),8));
        p.setF_dias_recuperacion((String)jTable1.getModel().getValueAt(jTable1.getSelectedRow(),9));
                  
    }
    public static Productos getProducto()
    {
        return p;
    }
}
