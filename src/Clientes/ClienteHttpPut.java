/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clientes;

import java.io.IOException;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.PutMethod;

/**
 *
 * @author Raul
 */
public class ClienteHttpPut {
    public String HttpClientWebServices(String url,String token,String pass,String id) throws IOException{
        HttpClient httpClient=new HttpClient();
        
        PutMethod postMeto=new PutMethod(url);
        
        postMeto.addRequestHeader("token", token);
        postMeto.addRequestHeader("pass", pass);
        postMeto.addRequestHeader("id", id);
        try{
            httpClient.executeMethod(postMeto);
        }catch(HttpException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
     
        if(postMeto.getStatusCode()==HttpStatus.SC_OK){
            
           //return postMeto.getResponseBodyAsString();
            System.out.println("Hecho");
            
        }
        //return postMeto.getResponseBodyAsString();
        System.out.println("Error");
        return null;
    }
    
}
