package com.yit1.basic.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class TestDynamicProxy {
	public static void main(String[] args) {
		Hello helloImpl = new HelloImpl();
		InvocationHandler myInvocation = new MyInvocation(helloImpl);
		Hello proxy = (Hello) Proxy.newProxyInstance(helloImpl.getClass().getClassLoader(), helloImpl.getClass().getInterfaces(), myInvocation);
		proxy.say();
	}
}
