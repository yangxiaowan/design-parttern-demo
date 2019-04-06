package pattern.proxy.staticproxy;

public class SaleHouseProxy implements BuyHouse{

    private BuyHouse buyHouse;

    public SaleHouseProxy(BuyHouse buyHouse){
        this.buyHouse = buyHouse;
        System.out.println("我是买房代理者!");
    }

    public void purchaseHouse() {
        System.out.println("我来代理你买房子!");
        this.buyHouse.purchaseHouse();
    }
}
