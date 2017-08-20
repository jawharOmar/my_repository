
package com.openkm.ws;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "OKMAuth", targetNamespace = "http://ws.openkm.com")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface OKMAuth {


    /**
     * 
     * @param permissions
     * @param nodePath
     * @param user
     * @param recursive
     * @param token
     * @throws RepositoryException_Exception
     * @throws PathNotFoundException_Exception
     * @throws DatabaseException_Exception
     * @throws AccessDeniedException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "grantUser", targetNamespace = "http://ws.openkm.com", className = "com.openkm.ws.GrantUser")
    @ResponseWrapper(localName = "grantUserResponse", targetNamespace = "http://ws.openkm.com", className = "com.openkm.ws.GrantUserResponse")
    public void grantUser(
        @WebParam(name = "token", targetNamespace = "")
        String token,
        @WebParam(name = "nodePath", targetNamespace = "")
        String nodePath,
        @WebParam(name = "user", targetNamespace = "")
        String user,
        @WebParam(name = "permissions", targetNamespace = "")
        int permissions,
        @WebParam(name = "recursive", targetNamespace = "")
        boolean recursive)
        throws AccessDeniedException_Exception, DatabaseException_Exception, PathNotFoundException_Exception, RepositoryException_Exception
    ;

    /**
     * 
     * @param password
     * @param user
     * @return
     *     returns java.lang.String
     * @throws RepositoryException_Exception
     * @throws DatabaseException_Exception
     * @throws AccessDeniedException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "login", targetNamespace = "http://ws.openkm.com", className = "com.openkm.ws.Login")
    @ResponseWrapper(localName = "loginResponse", targetNamespace = "http://ws.openkm.com", className = "com.openkm.ws.LoginResponse")
    public String login(
        @WebParam(name = "user", targetNamespace = "")
        String user,
        @WebParam(name = "password", targetNamespace = "")
        String password)
        throws AccessDeniedException_Exception, DatabaseException_Exception, RepositoryException_Exception
    ;

    /**
     * 
     * @param user
     * @param token
     * @return
     *     returns java.lang.String
     * @throws PrincipalAdapterException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getMail", targetNamespace = "http://ws.openkm.com", className = "com.openkm.ws.GetMail")
    @ResponseWrapper(localName = "getMailResponse", targetNamespace = "http://ws.openkm.com", className = "com.openkm.ws.GetMailResponse")
    public String getMail(
        @WebParam(name = "token", targetNamespace = "")
        String token,
        @WebParam(name = "user", targetNamespace = "")
        String user)
        throws PrincipalAdapterException_Exception
    ;

    /**
     * 
     * @param nodePath
     * @param token
     * @return
     *     returns java.util.List<com.openkm.ws.IntegerPair>
     * @throws RepositoryException_Exception
     * @throws PathNotFoundException_Exception
     * @throws DatabaseException_Exception
     * @throws AccessDeniedException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getGrantedUsers", targetNamespace = "http://ws.openkm.com", className = "com.openkm.ws.GetGrantedUsers")
    @ResponseWrapper(localName = "getGrantedUsersResponse", targetNamespace = "http://ws.openkm.com", className = "com.openkm.ws.GetGrantedUsersResponse")
    public List<IntegerPair> getGrantedUsers(
        @WebParam(name = "token", targetNamespace = "")
        String token,
        @WebParam(name = "nodePath", targetNamespace = "")
        String nodePath)
        throws AccessDeniedException_Exception, DatabaseException_Exception, PathNotFoundException_Exception, RepositoryException_Exception
    ;

    /**
     * 
     * @param nodePath
     * @param token
     * @return
     *     returns java.util.List<com.openkm.ws.IntegerPair>
     * @throws RepositoryException_Exception
     * @throws PathNotFoundException_Exception
     * @throws DatabaseException_Exception
     * @throws AccessDeniedException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getGrantedRoles", targetNamespace = "http://ws.openkm.com", className = "com.openkm.ws.GetGrantedRoles")
    @ResponseWrapper(localName = "getGrantedRolesResponse", targetNamespace = "http://ws.openkm.com", className = "com.openkm.ws.GetGrantedRolesResponse")
    public List<IntegerPair> getGrantedRoles(
        @WebParam(name = "token", targetNamespace = "")
        String token,
        @WebParam(name = "nodePath", targetNamespace = "")
        String nodePath)
        throws AccessDeniedException_Exception, DatabaseException_Exception, PathNotFoundException_Exception, RepositoryException_Exception
    ;

    /**
     * 
     * @param user
     * @param token
     * @return
     *     returns java.lang.String
     * @throws PrincipalAdapterException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getName", targetNamespace = "http://ws.openkm.com", className = "com.openkm.ws.GetName")
    @ResponseWrapper(localName = "getNameResponse", targetNamespace = "http://ws.openkm.com", className = "com.openkm.ws.GetNameResponse")
    public String getName(
        @WebParam(name = "token", targetNamespace = "")
        String token,
        @WebParam(name = "user", targetNamespace = "")
        String user)
        throws PrincipalAdapterException_Exception
    ;

    /**
     * 
     * @param role
     * @param token
     * @return
     *     returns java.util.List<java.lang.String>
     * @throws PrincipalAdapterException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getUsersByRole", targetNamespace = "http://ws.openkm.com", className = "com.openkm.ws.GetUsersByRole")
    @ResponseWrapper(localName = "getUsersByRoleResponse", targetNamespace = "http://ws.openkm.com", className = "com.openkm.ws.GetUsersByRoleResponse")
    public List<String> getUsersByRole(
        @WebParam(name = "token", targetNamespace = "")
        String token,
        @WebParam(name = "role", targetNamespace = "")
        String role)
        throws PrincipalAdapterException_Exception
    ;

    /**
     * 
     * @param role
     * @param permissions
     * @param nodePath
     * @param recursive
     * @param token
     * @throws RepositoryException_Exception
     * @throws PathNotFoundException_Exception
     * @throws DatabaseException_Exception
     * @throws AccessDeniedException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "revokeRole", targetNamespace = "http://ws.openkm.com", className = "com.openkm.ws.RevokeRole")
    @ResponseWrapper(localName = "revokeRoleResponse", targetNamespace = "http://ws.openkm.com", className = "com.openkm.ws.RevokeRoleResponse")
    public void revokeRole(
        @WebParam(name = "token", targetNamespace = "")
        String token,
        @WebParam(name = "nodePath", targetNamespace = "")
        String nodePath,
        @WebParam(name = "role", targetNamespace = "")
        String role,
        @WebParam(name = "permissions", targetNamespace = "")
        int permissions,
        @WebParam(name = "recursive", targetNamespace = "")
        boolean recursive)
        throws AccessDeniedException_Exception, DatabaseException_Exception, PathNotFoundException_Exception, RepositoryException_Exception
    ;

    /**
     * 
     * @param token
     * @return
     *     returns java.util.List<java.lang.String>
     * @throws PrincipalAdapterException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getRoles", targetNamespace = "http://ws.openkm.com", className = "com.openkm.ws.GetRoles")
    @ResponseWrapper(localName = "getRolesResponse", targetNamespace = "http://ws.openkm.com", className = "com.openkm.ws.GetRolesResponse")
    public List<String> getRoles(
        @WebParam(name = "token", targetNamespace = "")
        String token)
        throws PrincipalAdapterException_Exception
    ;

    /**
     * 
     * @param role
     * @param permissions
     * @param nodePath
     * @param recursive
     * @param token
     * @throws RepositoryException_Exception
     * @throws PathNotFoundException_Exception
     * @throws DatabaseException_Exception
     * @throws AccessDeniedException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "grantRole", targetNamespace = "http://ws.openkm.com", className = "com.openkm.ws.GrantRole")
    @ResponseWrapper(localName = "grantRoleResponse", targetNamespace = "http://ws.openkm.com", className = "com.openkm.ws.GrantRoleResponse")
    public void grantRole(
        @WebParam(name = "token", targetNamespace = "")
        String token,
        @WebParam(name = "nodePath", targetNamespace = "")
        String nodePath,
        @WebParam(name = "role", targetNamespace = "")
        String role,
        @WebParam(name = "permissions", targetNamespace = "")
        int permissions,
        @WebParam(name = "recursive", targetNamespace = "")
        boolean recursive)
        throws AccessDeniedException_Exception, DatabaseException_Exception, PathNotFoundException_Exception, RepositoryException_Exception
    ;

    /**
     * 
     * @param token
     * @return
     *     returns java.util.List<java.lang.String>
     * @throws PrincipalAdapterException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getUsers", targetNamespace = "http://ws.openkm.com", className = "com.openkm.ws.GetUsers")
    @ResponseWrapper(localName = "getUsersResponse", targetNamespace = "http://ws.openkm.com", className = "com.openkm.ws.GetUsersResponse")
    public List<String> getUsers(
        @WebParam(name = "token", targetNamespace = "")
        String token)
        throws PrincipalAdapterException_Exception
    ;

    /**
     * 
     * @param permissions
     * @param nodePath
     * @param user
     * @param recursive
     * @param token
     * @throws RepositoryException_Exception
     * @throws PathNotFoundException_Exception
     * @throws DatabaseException_Exception
     * @throws AccessDeniedException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "revokeUser", targetNamespace = "http://ws.openkm.com", className = "com.openkm.ws.RevokeUser")
    @ResponseWrapper(localName = "revokeUserResponse", targetNamespace = "http://ws.openkm.com", className = "com.openkm.ws.RevokeUserResponse")
    public void revokeUser(
        @WebParam(name = "token", targetNamespace = "")
        String token,
        @WebParam(name = "nodePath", targetNamespace = "")
        String nodePath,
        @WebParam(name = "user", targetNamespace = "")
        String user,
        @WebParam(name = "permissions", targetNamespace = "")
        int permissions,
        @WebParam(name = "recursive", targetNamespace = "")
        boolean recursive)
        throws AccessDeniedException_Exception, DatabaseException_Exception, PathNotFoundException_Exception, RepositoryException_Exception
    ;

    /**
     * 
     * @param user
     * @param token
     * @return
     *     returns java.util.List<java.lang.String>
     * @throws PrincipalAdapterException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getRolesByUser", targetNamespace = "http://ws.openkm.com", className = "com.openkm.ws.GetRolesByUser")
    @ResponseWrapper(localName = "getRolesByUserResponse", targetNamespace = "http://ws.openkm.com", className = "com.openkm.ws.GetRolesByUserResponse")
    public List<String> getRolesByUser(
        @WebParam(name = "token", targetNamespace = "")
        String token,
        @WebParam(name = "user", targetNamespace = "")
        String user)
        throws PrincipalAdapterException_Exception
    ;

    /**
     * 
     * @param token
     * @throws RepositoryException_Exception
     * @throws DatabaseException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "logout", targetNamespace = "http://ws.openkm.com", className = "com.openkm.ws.Logout")
    @ResponseWrapper(localName = "logoutResponse", targetNamespace = "http://ws.openkm.com", className = "com.openkm.ws.LogoutResponse")
    public void logout(
        @WebParam(name = "token", targetNamespace = "")
        String token)
        throws DatabaseException_Exception, RepositoryException_Exception
    ;

}