package pattern.proxy.staticproxy;

public class HouseBuyer implements BuyHouse{

    public HouseBuyer(){
        System.out.println("我想买房子!");
    }

    public void purchaseHouse() {
        System.out.println("房子买到了!");
    }
}
