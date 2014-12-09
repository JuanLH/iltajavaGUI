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
import Clientes.ClienteVenta_Factura;

/**
 * Jersey REST client generated for REST resource:WebService_Alquiler_factura
 * [alquiler_factura]<br>
 * USAGE:
 * <pre>
 *        ClienteAlquilerFac client = new ClienteAlquilerFac();
 *        Object response = client.XXX(...);
 *        // do whatever with response
 *        client.close();
 * </pre>
 *
 * @author Paola H
 */
public class ClienteAlquilerFac {
    private WebTarget webTarget;
    private Client client;
    private static final String BASE_URI = "http://itla2-itlajavados.rhcloud.com/itlajava/webresources/";

    public ClienteAlquilerFac() {
        client = javax.ws.rs.client.ClientBuilder.newClient();
        webTarget = client.target(BASE_URI).path("alquiler_factura");
    }

    public Respuesta getAlquilerFactura_Id(String token, String id) throws ClientErrorException {
        WebTarget resource = webTarget;
        Gson json = new Gson();
        Respuesta respo = new Respuesta();
        resource = resource.path(java.text.MessageFormat.format("/getalquilerfactura_id/{0}/{1}", new Object[]{token, id}));
        System.out.println(resource.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(ClienteVenta_Factura.class));
        String res = resource.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(String.class);
        respo = json.fromJson(res, Respuesta.class);
        return respo;
    }

    public String insertar_alquiler_factura() throws ClientErrorException {
        return webTarget.path("insertar_alquiler_factura").request().post(null, String.class);
    }

    public void close() {
        client.close();
    }
    
}
