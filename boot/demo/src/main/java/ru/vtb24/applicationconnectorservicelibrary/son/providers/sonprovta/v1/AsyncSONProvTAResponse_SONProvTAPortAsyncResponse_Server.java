
package ru.vtb24.applicationconnectorservicelibrary.son.providers.sonprovta.v1;

import javax.xml.ws.Endpoint;

/**
 * This class was generated by Apache CXF 3.2.1
 * 2019-10-07T14:47:51.472+03:00
 * Generated source version: 3.2.1
 * 
 */
 
public class AsyncSONProvTAResponse_SONProvTAPortAsyncResponse_Server{

    protected AsyncSONProvTAResponse_SONProvTAPortAsyncResponse_Server() throws java.lang.Exception {
        System.out.println("Starting Server");
        Object implementor = new SONProvTA_Port_Async_ResponseImpl();
        String address = "http://localhost:8081/ws/SONProvTAWrapper1";
        Endpoint.publish(address, implementor);
    }
    
    public static void main(String args[]) throws java.lang.Exception { 
        new AsyncSONProvTAResponse_SONProvTAPortAsyncResponse_Server();
        System.out.println("Server ready..."); 
        
        Thread.sleep(5 * 60 * 1000); 
        System.out.println("Server exiting");
        System.exit(0);
    }
}
