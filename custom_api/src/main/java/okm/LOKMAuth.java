/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package okm;
import com.openkm.ws.OKMAuth;
import com.openkm.ws.OKMAuth_Service;
import java.util.List;
import javax.jws.WebService;

/**
 *
 * @author joh
 */
@WebService(serviceName = "OKMAuth", portName = "OKMAuthPort", endpointInterface = "com.openkm.ws.OKMAuth", targetNamespace = "http://ws.openkm.com", wsdlLocation = "WEB-INF/wsdl/localhost_8080/OpenKM/services/OKMAuth.wsdl")
public class LOKMAuth {

    public void grantUser(String token, String nodePath, String user, int permissions, boolean recursive) throws RepositoryException_Exception, DatabaseException_Exception, AccessDeniedException_Exception, PathNotFoundException_Exception {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    /**
     *
     * @param user
     * @param password
     * @return
     */
    public String login(String user, String password) {
        try {
            System.out.println(1);
            OKMAuth_Service oKMAuth_service = new OKMAuth_Service();
            System.out.println(2);
            OKMAuth oKMAuth = oKMAuth_service.getOKMAuthPort();
            System.out.println(3);
            String token = oKMAuth.login("okmAdmin", "admin");
            System.out.println(4);
            return token;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("OKMAuth->login->Exception occured");

        }
        return null;

    }

    public String getMail(String token, String user) throws PrincipalAdapterException_Exception {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public List<com.openkm.ws.IntegerPair> getGrantedUsers(String token, String nodePath) throws PathNotFoundException_Exception, DatabaseException_Exception, AccessDeniedException_Exception, RepositoryException_Exception {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public List<com.openkm.ws.IntegerPair> getGrantedRoles(String token, String nodePath) throws DatabaseException_Exception, AccessDeniedException_Exception, PathNotFoundException_Exception, RepositoryException_Exception {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public String getName(String token, String user) throws PrincipalAdapterException_Exception {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public List<String> getUsersByRole(String token, String role) throws PrincipalAdapterException_Exception {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public void revokeRole(String token, String nodePath, String role, int permissions, boolean recursive) throws RepositoryException_Exception, DatabaseException_Exception, AccessDeniedException_Exception, PathNotFoundException_Exception {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public List<String> getRoles(String token) throws PrincipalAdapterException_Exception {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public void grantRole(String token, String nodePath, String role, int permissions, boolean recursive) throws AccessDeniedException_Exception, DatabaseException_Exception, PathNotFoundException_Exception, RepositoryException_Exception {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public List<String> getUsers(String token) throws PrincipalAdapterException_Exception {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public void revokeUser(String token, String nodePath, String user, int permissions, boolean recursive) throws AccessDeniedException_Exception, PathNotFoundException_Exception, DatabaseException_Exception, RepositoryException_Exception {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public List<String> getRolesByUser(String token, String user) throws PrincipalAdapterException_Exception {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public void logout(String token) throws RepositoryException_Exception, DatabaseException_Exception {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

}
