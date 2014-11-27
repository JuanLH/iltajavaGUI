/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

import javax.ws.rs.ClientErrorException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;

/**
 * Jersey REST client generated for REST resource:Webservice_Producto
 * [producto]<br>
 * USAGE:
 * <pre>
 *        NewJerseyClient client = new NewJerseyClient();
 *        Object response = client.XXX(...);
 *        // do whatever with response
 *        client.close();
 * </pre>
 *
 * @author HiraldoTran
 */
public class NewJerseyClient {
    private WebTarget webTarget;
    private Client client;
    private static final String BASE_URI = "http://itla2-itlajavados.rhcloud.com/itlajava/webresources";

    public NewJerseyClient() {
        client = javax.ws.rs.client.ClientBuilder.newClient();
        webTarget = client.target(BASE_URI).path("producto");
    }

    public void putJson(Object requestEntity) throws ClientErrorException {
        webTarget.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).put(javax.ws.rs.client.Entity.entity(requestEntity, javax.ws.rs.core.MediaType.APPLICATION_JSON));
    }

    public String getproduct_id_nombre(String id, String token) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("getproducto/{0}/{1}", new Object[]{id, token}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(String.class);
    }

    public void insertar_producto(String id, String nombre, String descripcion, String costo, String precioventa, String precioalquiler, String alquilerventa, String cantidadalquiler, String cantidadventa, String diasrecuperacion) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("insertarproducto/{0}/{1}/{2}/{3}//{4}/{5}/{6}/{7}/{8}/{9}", new Object[]{id, nombre, descripcion, costo, precioventa, precioalquiler, alquilerventa, cantidadalquiler, cantidadventa, diasrecuperacion})).request().put(null);
    }

    public String getproducto() throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path("getproductos");
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
