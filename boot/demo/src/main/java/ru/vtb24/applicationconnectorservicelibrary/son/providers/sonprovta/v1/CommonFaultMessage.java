
package ru.vtb24.applicationconnectorservicelibrary.son.providers.sonprovta.v1;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.2.1
 * 2019-10-07T14:47:51.419+03:00
 * Generated source version: 3.2.1
 */

@WebFault(name = "Fault", targetNamespace = "http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2")
public class CommonFaultMessage extends Exception {
    
    private com.oracle.xmlns.enterpriseobjects.core.common.v2.FaultType fault;

    public CommonFaultMessage() {
        super();
    }
    
    public CommonFaultMessage(String message) {
        super(message);
    }
    
    public CommonFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public CommonFaultMessage(String message, com.oracle.xmlns.enterpriseobjects.core.common.v2.FaultType fault) {
        super(message);
        this.fault = fault;
    }

    public CommonFaultMessage(String message, com.oracle.xmlns.enterpriseobjects.core.common.v2.FaultType fault, Throwable cause) {
        super(message, cause);
        this.fault = fault;
    }

    public com.oracle.xmlns.enterpriseobjects.core.common.v2.FaultType getFaultInfo() {
        return this.fault;
    }
}