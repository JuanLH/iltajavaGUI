/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clientes;

import javax.ws.rs.ClientErrorException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;

/**
 * Jersey REST client generated for REST resource:Webservice_Cliente
 * [cliente]<br>
 * USAGE:
 * <pre>
 *        ClienteCliente client = new ClienteCliente();
 *        Object response = client.XXX(...);
 *        // do whatever with response
 *        client.close();
 * </pre>
 *
 * @author Ivan Reyes
 */
public class ClienteCliente {
    private WebTarget webTarget;
    private Client client;
    private static final String BASE_URI = "http://itla2-itlajavados.rhcloud.com/itlajava23/webresources";

    public ClienteCliente() {
        client = javax.ws.rs.client.ClientBuilder.newClient();
        webTarget = client.target(BASE_URI).path("cliente");
    }

    public void putJson(Object requestEntity) throws ClientErrorException {
        webTarget.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).put(javax.ws.rs.client.Entity.entity(requestEntity, javax.ws.rs.core.MediaType.APPLICATION_JSON));
    }

    public void insertar_cliente(Object requestEntity, String informacion) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("insertar_cliente/{0}", new Object[]{informacion})).request(javax.ws.rs.core.MediaType.APPLICATION_JSON).post(javax.ws.rs.client.Entity.entity(requestEntity, javax.ws.rs.core.MediaType.APPLICATION_JSON));
        System.out.println(javax.ws.rs.core.MediaType.APPLICATION_JSON);
    }

    public String getCliente_nombre_apellido(String token, String id) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("getcliente_nombre_apellido/{0}/{1}", new Object[]{token, id}));
       System.out.println(resource.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(String.class));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(String.class);
    }

    public String getCliente(String token) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("getcliente/{0}", new Object[]{token}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(String.class);
    }

    public String getJson() throws ClientErrorException {
        WebTarget resource = webTarget;
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(String.class);
    }

    public void close() {
        client.close();
    }
    
}
