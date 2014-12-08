/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clientes;

import Clases.Respuesta;
import com.google.gson.Gson;
import javax.ws.rs.ClientErrorException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;

/**
 * Jersey REST client generated for REST resource:Webservice_Usuario
 * [/usuario]<br>
 * USAGE:
 * <pre>
 *        ClienteUsuario client = new ClienteUsuario();
 *        Object response = client.XXX(...);
 *        // do whatever with response
 *        client.close();
 * </pre>
 *
 * @author Raul
 */
public class ClienteUsuario {
    private WebTarget webTarget;
    private Client client;
    private static final String BASE_URI = "http://itla2-itlajavados.rhcloud.com/itlajava1/webresources";

    public ClienteUsuario() {
        client = javax.ws.rs.client.ClientBuilder.newClient();
        webTarget = client.target(BASE_URI).path("usuario");
    }

    public void putJson(Object requestEntity) throws ClientErrorException {
        webTarget.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).put(javax.ws.rs.client.Entity.entity(requestEntity, javax.ws.rs.core.MediaType.APPLICATION_JSON));
    }

    public String Mod_pass_usu(Object requestEntity) throws ClientErrorException {
        return webTarget.path("modificar_pass").request(javax.ws.rs.core.MediaType.APPLICATION_JSON).put(javax.ws.rs.client.Entity.entity(requestEntity, javax.ws.rs.core.MediaType.APPLICATION_JSON), String.class);
    }

    public Respuesta getUsuario(String token, String id) throws ClientErrorException {
        WebTarget resource = webTarget;
        Gson json = new Gson();
        Respuesta respo = new Respuesta();
        resource = resource.path(java.text.MessageFormat.format("getusuario/{0}/{1}", new Object[]{token, id}));
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
