/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import Clases.usuario;

/**
 *
 * @author HiraldoTran
 */
public class DTOusuario {
    static usuario usuario = new usuario();
    public static void setUsuario(usuario us)
    {
        usuario = us;
    }
    public static usuario getUsuario()
    {
        return usuario;
    }
}
