package com.reddit.Reddit.session;

import org.springframework.session.ExpiringSession;
import org.springframework.session.SessionRepository;

public class UserSessionRepository <S extends ExpiringSession> {

    private SessionRepository<S> sessionRepository;

    public void creatingSession(){
        S sessionToSave = this.sessionRepository.createSession();
        sessionToSave.setMaxInactiveIntervalInSeconds(30);
        this.sessionRepository.save(sessionToSave);
        S session = this.sessionRepository.getSession(sessionToSave.getId());
    }
}
