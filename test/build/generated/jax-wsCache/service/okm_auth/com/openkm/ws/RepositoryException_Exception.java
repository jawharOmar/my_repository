
package com.openkm.ws;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "RepositoryException", targetNamespace = "http://ws.openkm.com")
public class RepositoryException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private RepositoryException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public RepositoryException_Exception(String message, RepositoryException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public RepositoryException_Exception(String message, RepositoryException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.openkm.ws.RepositoryException
     */
    public RepositoryException getFaultInfo() {
        return faultInfo;
    }

}
