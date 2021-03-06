
package com.openkm.ws;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "PathNotFoundException", targetNamespace = "http://ws.openkm.com")
public class PathNotFoundException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private PathNotFoundException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public PathNotFoundException_Exception(String message, PathNotFoundException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public PathNotFoundException_Exception(String message, PathNotFoundException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.openkm.ws.PathNotFoundException
     */
    public PathNotFoundException getFaultInfo() {
        return faultInfo;
    }

}
