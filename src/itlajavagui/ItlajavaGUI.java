/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itlajavagui;
import Formularios.Login;
import Clases.Productos;
import Clases.Respuesta;
import Clientes.HttpClientWebServices;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HiraldoTran
 */
public class ItlajavaGUI {

    /**
     * @param args the command line arguments
     */
    
    static String clientPost(String url,String token,String gson)
    {
        try {
            HttpClientWebServices client = new HttpClientWebServices();
            
            return client.HttpClientWebServices(url, token, gson);
        } catch (IOException ex) {
            //Logger.getLogger(ItlajavaGUI.class.getName()).log(Level.SEVERE, null, ex);
            
            return  "-1"+ex;
        
        }
        
       
       
    }
    public static void main(String[] args) 
    {
    
        Productos pro = new Productos();
        Respuesta resp = new Respuesta();
        
        pro.setF_id(0);
        pro.setF_nombre("Pechuga de mama ana");
        pro.setF_descripcion("a la gordon blue");
        pro.setF_costo(150);
        pro.setF_precio_venta(300);
        pro.setF_precio_alquiler(100);
        pro.setF_alquiler_venta("alquiler");
        pro.setF_cantidad_alquiler("1000");
        pro.setF_cantidad_venta("2");
        pro.setF_dias_recuperacion("1");
        
        System.out.println(resp.ToJson(pro));
        
        System.out.print(clientPost("http://itla2-itlajavados.rhcloud.com/itlajava/webresources/producto/insertarproducto",
                "c995803678f1f4f2fd1f291950953b86",
                resp.ToJson(pro)));
        
        
    
    
    }
    
}
