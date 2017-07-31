package com.reddit.Reddit.session;

import com.reddit.Reddit.model.User;
import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public @Data class UserSession {
    private final String id = UUID.randomUUID().toString();
    private User user;
}
