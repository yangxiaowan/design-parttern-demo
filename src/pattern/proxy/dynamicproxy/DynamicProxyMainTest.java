package pattern.proxy.dynamicproxy;

import pattern.proxy.staticproxy.BuyHouse;
import pattern.proxy.staticproxy.HouseBuyer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class DynamicProxyMainTest {

    public static void main(String[] args) {
        HouseBuyer houseBuyer = new HouseBuyer();
        InvocationHandler invocationHandler1 = new JDKDynamicProxy(houseBuyer);
        BuyHouse buyHouse1 = (BuyHouse)Proxy.newProxyInstance(
                houseBuyer.getClass().getClassLoader(),
                houseBuyer.getClass().getInterfaces(),
                invocationHandler1
        );
        buyHouse1.purchaseHouse();


        HouseSaver houseSaver = new HouseSaver();
        InvocationHandler invocationHandler2 = new JDKDynamicProxy(houseSaver);
        BuyHouse buyHouse2 = (BuyHouse)Proxy.newProxyInstance(
                houseSaver.getClass().getClassLoader(),
                houseSaver.getClass().getInterfaces(),
                invocationHandler2
        );
        buyHouse2.purchaseHouse();
    }

}
