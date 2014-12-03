/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clientes;

import com.google.gson.Gson;
import dto.Respuesta;
import javax.ws.rs.ClientErrorException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;

/**
 * Jersey REST client generated for REST resource:Webservice_Producto
 * [producto]<br>
 * USAGE:
 * <pre>
 *        ClienteProducto client = new ClienteProducto();
 *        Object response = client.XXX(...);
 *        // do whatever with response
 *        client.close();
 * </pre>
 *
 * @author Ivan Reyes
 */
public class ClienteProducto {
    private WebTarget webTarget;
    private Client client;
    private static final String BASE_URI = "http://itla2-itlajavados.rhcloud.com/itlajava38/webresources";

    public ClienteProducto() {
        client = javax.ws.rs.client.ClientBuilder.newClient();
        webTarget = client.target(BASE_URI).path("producto");
    }

    public void putJson(Object requestEntity) throws ClientErrorException {
        webTarget.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).put(javax.ws.rs.client.Entity.entity(requestEntity, javax.ws.rs.core.MediaType.APPLICATION_JSON));
    }

    public Respuesta getproduct_id_nombre(String token, String nombre) throws ClientErrorException {
        WebTarget resource = webTarget;
        Gson json = new Gson();
        Respuesta respo = new Respuesta();
        resource = resource.path(java.text.MessageFormat.format("getproducto/{0}/{1}", new Object[]{token, nombre}));
        //System.out.println(resource.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(String.class));
        String res=resource.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(String.class);
        respo = json.fromJson(res, Respuesta.class);
        return respo;
        //return resource.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(String.class);
    }

    public void insertar_producto(Object requestEntity, String token, String informacion) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("insertarproducto/{0}/{1}", new Object[]{token, informacion})).request(javax.ws.rs.core.MediaType.APPLICATION_JSON).post(javax.ws.rs.client.Entity.entity(requestEntity, javax.ws.rs.core.MediaType.APPLICATION_JSON));
    }

    public String getJson() throws ClientErrorException {
        WebTarget resource = webTarget;
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(String.class);
    }

    public void close() {
        client.close();
    }
    
}
