package modules;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class MLogin {

    private String password;
    private String userName;

    public MLogin(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public MLogin() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Login{" + "userName=" + userName + ", password=" + password + '}';
    }

}
