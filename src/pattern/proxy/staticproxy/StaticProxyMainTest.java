package pattern.proxy.staticproxy;

public class StaticProxyMainTest {

    public static void main(String[] args) {
        BuyHouse buyHouse = new HouseBuyer();
        SaleHouseProxy saleHouseProxy = new SaleHouseProxy(buyHouse);
        saleHouseProxy.purchaseHouse();
    }

}
