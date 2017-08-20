package okm_auth;
import com.openkm.ws.AccessDeniedException_Exception;
import com.openkm.ws.DatabaseException_Exception;
import com.openkm.ws.OKMAuth;
import com.openkm.ws.OKMAuth_Service;
import com.openkm.ws.RepositoryException_Exception;
import java.util.logging.Level;
import java.util.logging.Logger;
public class get_auth {

    public static void main(String args[]) {
      okm_auth okm_auth=new okm_auth();
        try {
            System.out.println(okm_auth.login("okmadmin", "admin"));
        } catch (AccessDeniedException_Exception ex) {
            Logger.getLogger(get_auth.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RepositoryException_Exception ex) {
            Logger.getLogger(get_auth.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DatabaseException_Exception ex) {
            Logger.getLogger(get_auth.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    

}
