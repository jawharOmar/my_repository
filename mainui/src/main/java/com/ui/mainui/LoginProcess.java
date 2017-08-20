package com.ui.mainui;

import java.util.Enumeration;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import modules.*;
import okm.LOKMAuth;

@Path("/login")
public class LoginProcess {

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public MFeedBack getLogin(MLogin login, @Context HttpServletRequest e) {
        MFeedBack mFeedBack = new MFeedBack();
        MLogin copy = login;
        System.out.println("welcome=" + copy);
        LOKMAuth oKMAuth = new LOKMAuth();
        String token = oKMAuth.login(login.getUserName(), login.getPassword());
        System.out.println("token back from OKM=" + token);
        if (token != null) {
            System.out.println("Class=" + this.getClass().getName() + ",getLogin,A=login success");
            HttpSession session = e.getSession();
            session.setAttribute("okm_token", token);
            mFeedBack.setStatus(200);
            mFeedBack.setMessage("login success");
            System.out.println("FeedBack=" + mFeedBack);
            return mFeedBack;
        } else {
            mFeedBack.setStatus(300);
            mFeedBack.setMessage("login failed");
            return mFeedBack;
        }

    }
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.TEXT_PLAIN)
    public String test(@Context HttpServletRequest e) {
        HttpSession session=e.getSession();
        Enumeration keys = session.getAttributeNames();
while (keys.hasMoreElements())
{
  String key = (String)keys.nextElement();
  System.out.println(key + ": " + session.getValue(key) + "\n");
}
       return null;
    }
}
