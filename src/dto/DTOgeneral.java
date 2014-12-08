/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import javax.swing.JTable;

/**
 *
 * @author Raul
 */
public class DTOgeneral {
    
    public static void bloquearTabla(JTable jTable1)
    {
                for (int c = 0; c < jTable1.getColumnCount(); c++)
        {
            Class<?> col_class = jTable1.getColumnClass(c);
            jTable1.setDefaultEditor(col_class, null);
        }
    }
    
    
}
