package pch.home.learning.bean.cdi.scopes;


/*
General info

    CDI container is consist of scopes. If we annotate bean with scope,
    we add that bean to particular container context. Bean placed in different container conexts
    has different lifecycle

    Scoped bean are created lazily,
    it means that session scoped bean does not have to be created when http session
    is created, but is created on first call as well as request scope bean is not
    created on every http request only when it is called.
*/

import java.io.Serializable;

// Default scope. Inherit scope from bean that it was injected into.
public class DependentScope implements Serializable{

    public int beanHashCode() {
        return this.hashCode();
    }
}
