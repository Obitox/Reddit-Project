package com.reddit.Reddit.configuration;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.util.Factory;

public class ShiroAuthService {
    public ShiroAuthService() {
        Factory factory = new IniSecurityManagerFactory(
                "classpath:shiro.ini");
        SecurityManager securityManager = factory.getInstance();
        // Make the SecurityManager instance available to the entire application
        // via static memory:
        SecurityUtils.setSecurityManager(securityManager);
    }

    public void testAuth() {

        // simulate a username/password (plaintext) token created in response to
        // a login attempt:
        UsernamePasswordToken token = new UsernamePasswordToken("user", "secret");
        token.setRememberMe(true);

        boolean loggedIn = false;
        Session session = null;
        Subject currentUser = SecurityUtils.getSubject();

        try {
            currentUser.login(token);
            session = currentUser.getSession();
            System.out.println("Session Id: " + session.getId());
            loggedIn = true;
        } catch (Exception ex) {
            loggedIn = false;
        }

        Serializable sessionId = session.getId();
        if (loggedIn) {
            Subject requestSubject = new Subject.Builder().sessionId(sessionId)
                    .buildSubject();
            System.out.println("Is Authenticated = "
                    + requestSubject.isAuthenticated());//Should return true
            System.out.println("Is Remembered = "
                    + requestSubject.isRemembered());
        } else {
            System.out.println("Not logged in.");
        }

        System.exit(0);
    }

    public static void main(String[] args) {
        new ShiroAuthService().testAuth();
    }
}
