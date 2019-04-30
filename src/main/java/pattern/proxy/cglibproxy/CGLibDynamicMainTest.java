package pattern.proxy.cglibproxy;

import pattern.proxy.dynamicproxy.HouseSaver;
import pattern.proxy.staticproxy.BuyHouse;
import pattern.proxy.staticproxy.HouseBuyer;

public class CGLibDynamicMainTest {

    public static void main(String[] args) {

        HouseBuyer houseBuyer = new HouseBuyer();
        CGLibDynamicProxy cgLibDynamicProxy = new CGLibDynamicProxy(houseBuyer);
        BuyHouse buyHouse  = (BuyHouse) cgLibDynamicProxy.getBuyHouseInstance();
        buyHouse.purchaseHouse();

        HouseSaver houseSaver = new HouseSaver();
        CGLibDynamicProxy cgLibDynamicProxy2 = new CGLibDynamicProxy(houseSaver);
        BuyHouse buyHouse2  = (BuyHouse) cgLibDynamicProxy2.getBuyHouseInstance();
        buyHouse2.purchaseHouse();

    }

}
