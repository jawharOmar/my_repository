/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package okm;

import  com.openkm.ws.AccessDeniedException_Exception;
import  com.openkm.ws.DatabaseException_Exception;
import  com.openkm.ws.LockException_Exception;
import  com.openkm.ws.PathNotFoundException_Exception;
import  com.openkm.ws.RepositoryException_Exception;
import javax.jws.WebService;

/**
 *
 * @author joh
 */
@WebService(serviceName = "OKMRepository", portName = "OKMRepositoryPort", endpointInterface = " OKMRepository", targetNamespace = "http://ws.openkm.com", wsdlLocation = "WEB-INF/wsdl/localhost_8080/OpenKM/services/OKMRepository.wsdl")
public class OKMRepository {

    public String getRepositoryUuid() throws RepositoryException_Exception, DatabaseException_Exception {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public  Folder getMailFolder(String token) throws RepositoryException_Exception, PathNotFoundException_Exception, AccessDeniedException_Exception, DatabaseException_Exception {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public String getUpdateMessage(String token) throws RepositoryException_Exception, DatabaseException_Exception {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public  Folder getCategoriesFolder(String token) throws DatabaseException_Exception, RepositoryException_Exception, PathNotFoundException_Exception, AccessDeniedException_Exception {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public  Folder getThesaurusFolder(String token) throws PathNotFoundException_Exception, RepositoryException_Exception, DatabaseException_Exception, AccessDeniedException_Exception {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public  Folder getRootFolder(String token) throws RepositoryException_Exception, AccessDeniedException_Exception, PathNotFoundException_Exception, DatabaseException_Exception {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public String getNodeUuid(String token, String path) throws AccessDeniedException_Exception, DatabaseException_Exception, PathNotFoundException_Exception, RepositoryException_Exception {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public  AppVersion getAppVersion(String token) throws RepositoryException_Exception, AccessDeniedException_Exception, DatabaseException_Exception {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public boolean hasNode(String token, String path) throws RepositoryException_Exception, DatabaseException_Exception, AccessDeniedException_Exception {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public  Folder getPersonalFolder(String token) throws PathNotFoundException_Exception, AccessDeniedException_Exception, DatabaseException_Exception, RepositoryException_Exception {
        OKMRepository_Service  oKMRepository_Service=new OKMRepository_Service();
        OKMRepository oKMRepository=oKMRepository_Service.getOKMRepositoryPort();
        
     
        
        
        throw new UnsupportedOperationException("Not implemented yet.");
        
    }

    public  Folder getTrashFolder(String token) throws PathNotFoundException_Exception, AccessDeniedException_Exception, DatabaseException_Exception, RepositoryException_Exception {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public String getNodePath(String token, String uuid) throws PathNotFoundException_Exception, RepositoryException_Exception, AccessDeniedException_Exception, DatabaseException_Exception {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public  Folder getTemplatesFolder(String token) throws RepositoryException_Exception, PathNotFoundException_Exception, AccessDeniedException_Exception, DatabaseException_Exception {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public void purgeTrash(String token) throws RepositoryException_Exception, PathNotFoundException_Exception, DatabaseException_Exception, LockException_Exception, AccessDeniedException_Exception {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }
    
}
