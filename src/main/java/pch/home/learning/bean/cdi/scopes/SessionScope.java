package pch.home.learning.bean.cdi.scopes;

import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
/*
    This scope is bound with http session. Every http session refers to
    long running communication between client and server.
    Client initialize session with initialization request
    to the server and server holds the session.
    Once a session scoped bean is created is in pasivating state and is
    activated only when is called.
 */
@SessionScoped
public class SessionScope implements Serializable{

    public int beanHashCode() {
        return this.hashCode();
    }
}
