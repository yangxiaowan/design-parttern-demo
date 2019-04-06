package pattern.proxy.cglibproxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CGLibDynamicProxy implements MethodInterceptor {

    private Object buyHouse;

    public CGLibDynamicProxy(Object buyHouse){
        this.buyHouse = buyHouse;
    }

    public Object getBuyHouseInstance(){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(buyHouse.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }


    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("需要交纳定金!");
        Object object = method.invoke(buyHouse, objects);
        System.out.println("交易完成，祝您购房愉快!");
        return object;
    }
}
