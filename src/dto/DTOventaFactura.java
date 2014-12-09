/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import Clases.Productos;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HiraldoTran
 */
public class DTOventaFactura {

    public static final String TIPO_VENTA = "Alquiler";
    public static final String TIPO_ALQUILER = "Venta";
    static List<Object> lista = new ArrayList<Object>();
    static DefaultTableModel modelo = new DefaultTableModel();
    public static int total;
    
    public static void formatearTabla(JTable tabla) {

        String[] col = {"ID", "Nombre", "Descripcion", "Precio", "Cantidad", "Días recuperacion","Importe"};
        for (int i = 0; i < col.length; i++) {
            modelo.addColumn(col[i]);
        }
    }

    public static void addArticulo(Productos pro, int cantidad, JTable tabla, String tipo) {
        List<Productos> lista = new ArrayList<Productos>();
        lista.add(pro);
        int k;
        for (Productos p : lista) {

            System.out.println(p.getF_dias_recuperacion());
            k = 0;
            Object[] fila = new Object[8];
            fila[k++] = (Object) p.getF_id();
            fila[k++] = (Object) p.getF_nombre();
            fila[k++] = (Object) p.getF_descripcion();
            int price = 0;
            if (tipo.equals(TIPO_VENTA)) 
                price = p.getF_precio_venta();
            if (tipo.equals(TIPO_ALQUILER))    
                price = p.getF_precio_alquiler();
            
            fila[k++] = (Object) price;
            fila[k++] = (Object) cantidad;
            fila[k++] = (Object) p.getF_dias_recuperacion();
            fila[k++] = (Object) (cantidad * price);
            total=total+(cantidad * price);
            modelo.addRow(fila);
            tabla.setModel(modelo);
        }
    }
    
    public  static void calcularMonto(JTextField subtotal,JTextField itbis,JTextField total)
    {
      // total.setText(""+this.total);
      // itbis.setText(""+(total*0.18f));
    }
}
