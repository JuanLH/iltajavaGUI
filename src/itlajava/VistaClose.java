/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itlajava;

import javax.swing.JOptionPane;


/**
 *
 * @author gabriela
 */
    public class VistaClose extends javax.swing.JFrame {
     
        VistaClose() {
            setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
     
            addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent evt) {
                    close();
                }
            });
        }
    
         void close(){
            if (JOptionPane.showConfirmDialog(rootPane, "¿Desea realmente salir del sistema?",
                    "Salir del sistema", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
                System.exit(0);
        }                
     
    }
