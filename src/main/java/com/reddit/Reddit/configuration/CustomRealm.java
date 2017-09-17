package com.reddit.Reddit.configuration;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.credential.CredentialsMatcher;
import org.apache.shiro.realm.AuthenticatingRealm;

public class CustomRealm extends AuthenticatingRealm {
    private CredentialsMatcher credentialsMatcher;

    public String getName() {
        return "CustomRealm";
    }

    public boolean supports(AuthenticationToken token) {
        return true;
    }

    public CredentialsMatcher getCredentialsMatcher() {
        return credentialsMatcher;
    }

    public void setCredentialsMatcher(CredentialsMatcher credentialsMatcher) {
        this.credentialsMatcher = credentialsMatcher;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(
            AuthenticationToken token) throws AuthenticationException {
        return new SimpleAuthenticationInfo("", "".toCharArray(), getName());
    }
}
