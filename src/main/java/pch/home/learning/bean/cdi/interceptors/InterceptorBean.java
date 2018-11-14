package pch.home.learning.bean.cdi.interceptors;

import pch.home.learning.bean.cdi.interceptors.loggerInterceptor.Logged;
import pch.home.learning.bean.cdi.interceptors.securityInterceptor.Authorization;
import pch.home.learning.bean.cdi.interceptors.securityInterceptor.Authorized;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.interceptor.Interceptors;

@Named
@RequestScoped
public class InterceptorBean {

    @Logged
    public void testLogger(){
        System.out.println("Interceptor TEST");
    }

    // Over interceptor binding annotation
    // @Authorized
    // Over Interceptors annotation
    @Interceptors(Authorization.class)
    public void testAuthorization(){
        System.out.println("Authorized");
    }
}
