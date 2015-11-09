/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mylinkedin.interceptors;

import com.mylinkedin.domain.User;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

/**
 *
 * @author superman90
 */
public class SessionCheckInterceptor extends MethodFilterInterceptor {

    @Override
    protected String doIntercept(ActionInvocation invocation) throws Exception {
        
        User me =(User) ActionContext.getContext().getSession().get("me");
        
        if (me!=null){
            return invocation.invoke();
        }else{
            return Action.LOGIN;
        }
    }
    
}
