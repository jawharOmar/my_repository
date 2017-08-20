
package com.openkm.ws;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "PrincipalAdapterException", targetNamespace = "http://ws.openkm.com")
public class PrincipalAdapterException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private PrincipalAdapterException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public PrincipalAdapterException_Exception(String message, PrincipalAdapterException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public PrincipalAdapterException_Exception(String message, PrincipalAdapterException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.openkm.ws.PrincipalAdapterException
     */
    public PrincipalAdapterException getFaultInfo() {
        return faultInfo;
    }

}
