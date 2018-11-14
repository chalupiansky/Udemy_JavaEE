package pch.home.learning.bean.cdi.interceptors.loggerInterceptor;

import pch.home.learning.bean.cdi.producers.qualifier.Username;

import javax.annotation.PostConstruct;
import javax.annotation.Priority;
import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;
import java.util.logging.Level;
import java.util.logging.Logger;

@Logged
@Interceptor
@Priority(Interceptor.Priority.APPLICATION)
public class InterceptorLogger {

    @Inject
    private Logger logger;

    @Inject
    @Username
    private String username;

    @PostConstruct
    public void init(){
        logger = Logger.getGlobal();
    }

    @AroundInvoke
    public Object log(InvocationContext invocationContext) throws Exception {
        logger.log(Level.INFO, username + ": logged in method: " + invocationContext.getMethod().getName());
        return invocationContext.proceed();
    }
}
