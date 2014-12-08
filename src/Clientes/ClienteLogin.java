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
 * Jersey REST client generated for REST resource:WebService_Logins [logins]<br>
 * USAGE:
 * <pre>
 *        ClienteLogin client = new ClienteLogin();
 *        Object response = client.XXX(...);
 *        // do whatever with response
 *        client.close();
 * </pre>
 *
 * @author Ivan Reyes
 */
public class ClienteLogin {
    private WebTarget webTarget;
    private Client client;
    private static final String BASE_URI = "http://itla2-itlajavados.rhcloud.com/itlajava1/webresources";

    public ClienteLogin() {
        client = javax.ws.rs.client.ClientBuilder.newClient();
        webTarget = client.target(BASE_URI).path("logins");
    }

    public void putJson(Object requestEntity) throws ClientErrorException {
        webTarget.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).put(javax.ws.rs.client.Entity.entity(requestEntity, javax.ws.rs.core.MediaType.APPLICATION_JSON));
    }

//    public String holaM() throws ClientErrorException {
//        WebTarget resource = webTarget;
//        resource = resource.path("hola");
//        return resource.get(String.class);
//    }

    public Respuesta getStatus(String user, String pass) throws ClientErrorException {
        WebTarget resource = webTarget;
        Gson json = new Gson();
        Respuesta respo = new Respuesta();
        resource = resource.path(java.text.MessageFormat.format("getstatus/{0}/{1}", new Object[]{user, pass}));
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
