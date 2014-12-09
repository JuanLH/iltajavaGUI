/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clientes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

/**
 *
 * @author Paola H
 */
public class genericMehod {
    
    public String getHttpClientWebServices(String url,String token,String nombre_apeliido) throws IOException{
        DefaultHttpClient client = new DefaultHttpClient();
        HttpGet request = new HttpGet(url+"/"+token+"/"+nombre_apeliido);
        HttpResponse response = client.execute(request);


        BufferedReader rd = new BufferedReader
        (new InputStreamReader(response.getEntity().getContent()));
    

          return rd.readLine();
        
        
    }
    
}
