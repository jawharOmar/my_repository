/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package okm_auth;

import com.openkm.ws.OKMAuth;
import com.openkm.ws.OKMAuth_Service;
import javax.jws.WebService;

/**
 *
 * @author joh
 */
@WebService(serviceName = "OKMAuth", portName = "OKMAuthPort", endpointInterface = "com.openkm.ws.OKMAuth", targetNamespace = "http://ws.openkm.com", wsdlLocation = "WEB-INF/wsdl/okm_auth/localhost_8080/OpenKM/services/OKMAuth.wsdl")
public class okm_auth {

    public void grantUser(java.lang.String token, java.lang.String nodePath, java.lang.String user, int permissions, boolean recursive) throws com.openkm.ws.RepositoryException_Exception, com.openkm.ws.DatabaseException_Exception, com.openkm.ws.PathNotFoundException_Exception, com.openkm.ws.AccessDeniedException_Exception {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public java.lang.String login(java.lang.String user, java.lang.String password) throws com.openkm.ws.AccessDeniedException_Exception, com.openkm.ws.RepositoryException_Exception, com.openkm.ws.DatabaseException_Exception {
        //TODO implement this method
        //throw new UnsupportedOperationException("Not implemented yet.");
        OKMAuth_Service oKMAuth_service=new OKMAuth_Service();
        OKMAuth oKMAuth=oKMAuth_service.getOKMAuthPort();
        String token=oKMAuth.login(user, password);
        return token;
    
    
    }

    public java.lang.String getMail(java.lang.String token, java.lang.String user) throws com.openkm.ws.PrincipalAdapterException_Exception {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public java.util.List<com.openkm.ws.IntegerPair> getGrantedUsers(java.lang.String token, java.lang.String nodePath) throws com.openkm.ws.RepositoryException_Exception, com.openkm.ws.DatabaseException_Exception, com.openkm.ws.AccessDeniedException_Exception, com.openkm.ws.PathNotFoundException_Exception {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public java.util.List<com.openkm.ws.IntegerPair> getGrantedRoles(java.lang.String token, java.lang.String nodePath) throws com.openkm.ws.AccessDeniedException_Exception, com.openkm.ws.DatabaseException_Exception, com.openkm.ws.PathNotFoundException_Exception, com.openkm.ws.RepositoryException_Exception {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public java.lang.String getName(java.lang.String token, java.lang.String user) throws com.openkm.ws.PrincipalAdapterException_Exception {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public java.util.List<java.lang.String> getUsersByRole(java.lang.String token, java.lang.String role) throws com.openkm.ws.PrincipalAdapterException_Exception {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public void revokeRole(java.lang.String token, java.lang.String nodePath, java.lang.String role, int permissions, boolean recursive) throws com.openkm.ws.AccessDeniedException_Exception, com.openkm.ws.RepositoryException_Exception, com.openkm.ws.PathNotFoundException_Exception, com.openkm.ws.DatabaseException_Exception {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public java.util.List<java.lang.String> getRoles(java.lang.String token) throws com.openkm.ws.PrincipalAdapterException_Exception {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public void grantRole(java.lang.String token, java.lang.String nodePath, java.lang.String role, int permissions, boolean recursive) throws com.openkm.ws.DatabaseException_Exception, com.openkm.ws.AccessDeniedException_Exception, com.openkm.ws.PathNotFoundException_Exception, com.openkm.ws.RepositoryException_Exception {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public java.util.List<java.lang.String> getUsers(java.lang.String token) throws com.openkm.ws.PrincipalAdapterException_Exception {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public void revokeUser(java.lang.String token, java.lang.String nodePath, java.lang.String user, int permissions, boolean recursive) throws com.openkm.ws.RepositoryException_Exception, com.openkm.ws.AccessDeniedException_Exception, com.openkm.ws.DatabaseException_Exception, com.openkm.ws.PathNotFoundException_Exception {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public java.util.List<java.lang.String> getRolesByUser(java.lang.String token, java.lang.String user) throws com.openkm.ws.PrincipalAdapterException_Exception {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public void logout(java.lang.String token) throws com.openkm.ws.DatabaseException_Exception, com.openkm.ws.RepositoryException_Exception {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }
    
}
