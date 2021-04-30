package com.yit1.basic.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocation implements InvocationHandler{
	
	Object obj;
	
	public MyInvocation(Object obj) {
		this.obj = obj;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("before advice");
		method.invoke(obj, args);
		System.out.println("after advice");
		return null;
	}

}
