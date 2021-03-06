
package com.openkm.ws;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "DatabaseException", targetNamespace = "http://ws.openkm.com")
public class DatabaseException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private DatabaseException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public DatabaseException_Exception(String message, DatabaseException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public DatabaseException_Exception(String message, DatabaseException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.openkm.ws.DatabaseException
     */
    public DatabaseException getFaultInfo() {
        return faultInfo;
    }

}
