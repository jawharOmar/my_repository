package modules;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MFeedBack {
private int status;
private String Message="";
private String Comment="";

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String Message) {
        this.Message = Message;
    }

    public String getComment() {
        return Comment;
    }

    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    @Override
    public String toString() {
        return "MFeedBack{" + "status=" + status + ", Message=" + Message + ", Comment=" + Comment + '}';
    }

}
