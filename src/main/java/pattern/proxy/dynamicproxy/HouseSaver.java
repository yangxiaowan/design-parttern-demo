package pattern.proxy.dynamicproxy;

import pattern.proxy.staticproxy.BuyHouse;

public class HouseSaver implements BuyHouse {


    public HouseSaver(){
        System.out.println("我是炒房者!");
    }

    public void purchaseHouse() {
        System.out.println("房子买到了!");
    }
}
