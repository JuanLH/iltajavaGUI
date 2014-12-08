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

/**
 *
 * @author HiraldoTran
 */
public class HttpClientWebServices {
    public String HttpClientWebServices(String url,String token,String gson) throws IOException{
        HttpClient httpClient=new HttpClient();
        
        PostMethod postMeto=new PostMethod(url);
        
        postMeto.addParameter("token", token);
        postMeto.addParameter("Gson", gson);
        try{
            httpClient.executeMethod(postMeto);
        }catch(HttpException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
     
        if(postMeto.getStatusCode()==HttpStatus.SC_OK){
            
           return postMeto.getResponseBodyAsString();
            
        }
        return "-1"+postMeto.getResponseBodyAsString();
    }
}
