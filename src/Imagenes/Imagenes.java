/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Imagenes;


import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Raul
 */
public class Imagenes {
    public static void setImagen(JLabel label,String cadena)
    {
        ImageIcon imagen = new ImageIcon(Imagenes.class.getResource(cadena));
        label.setIcon(imagen);
        label.repaint();
    }
    public static void addImagenFondoPanel(JPanel panel)
    {
        JLabel imagen=new JLabel();
        setImagen(imagen, "fondo.jpg");
        
        
        //Size s = System.out.
        
        //panel.setSize(form.getSize());
        imagen.setSize(panel.getSize());
        
        panel.add(imagen);
        panel.setOpaque(false);
    }
}
