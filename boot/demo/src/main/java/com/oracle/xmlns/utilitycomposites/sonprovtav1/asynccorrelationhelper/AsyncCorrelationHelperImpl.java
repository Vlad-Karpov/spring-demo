
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.oracle.xmlns.utilitycomposites.sonprovtav1.asynccorrelationhelper;

import java.util.logging.Logger;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;

/**
 * This class was generated by Apache CXF 3.2.1
 * 2019-09-30T23:57:26.928+03:00
 * Generated source version: 3.2.1
 * 
 */

@javax.jws.WebService(
                      serviceName = "$service.ServiceName",
                      targetNamespace = "$service.Namespace",
                      wsdlLocation = "file:/C:/Users/User/IdeaProjects/spring/boot/demo/src/main/resources/son/SONProvTAWrapper1.wsdl",
                      endpointInterface = "com.oracle.xmlns.utilitycomposites.sonprovtav1.asynccorrelationhelper.AsyncCorrelationHelper")
                      
public class AsyncCorrelationHelperImpl implements AsyncCorrelationHelper {

    private static final Logger LOG = Logger.getLogger(AsyncCorrelationHelperImpl.class.getName());

    /* (non-Javadoc)
     * @see com.oracle.xmlns.utilitycomposites.sonprovtav1.asynccorrelationhelper.AsyncCorrelationHelper#process(java.lang.String input)*
     */
    public void process(java.lang.String input) { 
        LOG.info("Executing operation process");
        System.out.println(input);
        try {
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}