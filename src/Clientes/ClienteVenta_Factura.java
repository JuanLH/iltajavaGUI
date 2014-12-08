/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clientes;

import Clases.Respuesta;
import com.google.gson.Gson;
import dto.DTORespuesta;
import javax.ws.rs.ClientErrorException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;

/**
 * Jersey REST client generated for REST resource:Webservice_Venta_factura
 * [venta_factura]<br>
 * USAGE:
 * <pre>
 *        ClienteVenta_Factura client = new ClienteVenta_Factura();
 *        Object response = client.XXX(...);
 *        // do whatever with response
 *        client.close();
 * </pre>
 *
 * @author Raul
 */
public class ClienteVenta_Factura {
    private WebTarget webTarget;
    private Client client;
    private static final String BASE_URI = "http://itla2-itlajavados.rhcloud.com/itlajava/webresources";

    public ClienteVenta_Factura() {
        client = javax.ws.rs.client.ClientBuilder.newClient();
        webTarget = client.target(BASE_URI).path("venta_factura");
    }

    public void putJson(Object requestEntity) throws ClientErrorException {
        webTarget.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).put(javax.ws.rs.client.Entity.entity(requestEntity, javax.ws.rs.core.MediaType.APPLICATION_JSON));
    }

    public void insertar_venta_factura(Object requestEntity, String token, String informacion) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("insertar_venta_factura/{0}/{1}", new Object[]{token, informacion})).request(javax.ws.rs.core.MediaType.APPLICATION_JSON).post(javax.ws.rs.client.Entity.entity(requestEntity, javax.ws.rs.core.MediaType.APPLICATION_JSON));
    }

    public Respuesta getfactura_id(String token, String id) throws ClientErrorException {
        WebTarget resource = webTarget;
        Gson json = new Gson();
        Respuesta respo = new Respuesta();
        resource = resource.path(java.text.MessageFormat.format("getproductos/{0}/{1}", new Object[]{token, id}));
        System.out.println(resource.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(String.class));
        String res = resource.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(String.class);
        respo = json.fromJson(res, Respuesta.class);
        return respo;
    }

    public String getJson() throws ClientErrorException {
        WebTarget resource = webTarget;
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(String.class);
    }

    public void close() {
        client.close();
    }
    
}
