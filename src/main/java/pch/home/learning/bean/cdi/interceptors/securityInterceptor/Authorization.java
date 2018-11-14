package pch.home.learning.bean.cdi.interceptors.securityInterceptor;

import pch.home.learning.bean.cdi.producers.qualifier.Username;

import javax.annotation.Priority;
import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;
import java.io.Serializable;

@Interceptor
@Authorized
// Activate interceptor in Java EE 7 (in Java EE 6 activation through XML in beans.xml)
@Priority(Interceptor.Priority.APPLICATION)
public class Authorization implements Serializable{

    @Inject
    @Username
    private String username;

    @AroundInvoke
    public Object Authorize(InvocationContext invocationContext) throws Exception {
        if (username.equals("admin")){
            // execute method with interceptor
           return invocationContext.proceed();
        }
        // do not execute method with interceptor
        return null;
    }
}
