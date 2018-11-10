package pch.home.learning.bean.cdi.scopes.backingbean;

import pch.home.learning.bean.cdi.scopes.*;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class ScopeBean implements Serializable{

    @Inject
    private ApplicationScope applicationScopeBean;

    @Inject
    private ConversationScope conversationScopeBean;

    @Inject
    private DependentScope dependentScopeBean;

    @Inject
    private RequestScope requestScopeBean;

    @Inject
    private SessionScope sessionScopeBean;


    public ApplicationScope getApplicationScopeBean() {
        return applicationScopeBean;
    }

    public ConversationScope getConversationScopeBean() {
        return conversationScopeBean;
    }

    public DependentScope getDependentScopeBean() {
        return dependentScopeBean;
    }

    public RequestScope getRequestScopeBean() {
        return requestScopeBean;
    }

    public SessionScope getSessionScopeBean() {
        return sessionScopeBean;
    }
}
