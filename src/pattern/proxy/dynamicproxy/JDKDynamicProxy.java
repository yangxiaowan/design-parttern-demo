package pattern.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class JDKDynamicProxy implements InvocationHandler {

    private Object buyHouse;

    public JDKDynamicProxy(Object buyHouse){
        this.buyHouse = buyHouse;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("需要交纳定金!");
        method.invoke(buyHouse, args);
        System.out.println("交易完成，祝您购房愉快!");
        return null;
    }
}
