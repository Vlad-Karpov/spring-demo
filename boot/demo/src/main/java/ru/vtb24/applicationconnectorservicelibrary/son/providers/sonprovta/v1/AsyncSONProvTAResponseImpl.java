
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package ru.vtb24.applicationconnectorservicelibrary.son.providers.sonprovta.v1;

import java.util.logging.Logger;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.2.1
 * 2019-09-30T23:57:26.937+03:00
 * Generated source version: 3.2.1
 * 
 */

@javax.jws.WebService(
                      serviceName = "$service.ServiceName",
                      targetNamespace = "$service.Namespace",
                      wsdlLocation = "file:/C:/Users/User/IdeaProjects/spring/boot/demo/src/main/resources/son/SONProvTAWrapper1.wsdl",
                      endpointInterface = "ru.vtb24.applicationconnectorservicelibrary.son.providers.sonprovta.v1.AsyncSONProvTAResponse")
                      
public class AsyncSONProvTAResponseImpl implements AsyncSONProvTAResponse {

    private static final Logger LOG = Logger.getLogger(AsyncSONProvTAResponseImpl.class.getName());

    /* (non-Javadoc)
     * @see ru.vtb24.applicationconnectorservicelibrary.son.providers.sonprovta.v1.AsyncSONProvTAResponse#asyncSONResponse(ru.vtb24.applicationconnectorservicelibrary.son.providers.sonprovta.v1.SONRespMsgType sonResponseEBM)*
     */
    public void asyncSONResponse(SONRespMsgType sonResponseEBM) { 
        LOG.info("Executing operation asyncSONResponse");
        System.out.println(sonResponseEBM);
        try {
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
