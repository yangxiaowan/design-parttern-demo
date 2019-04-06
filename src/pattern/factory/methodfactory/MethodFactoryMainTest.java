package pattern.factory.methodfactory;

import pattern.factory.product.Vehicle;

public class MethodFactoryMainTest {

    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        Vehicle vehicle1 = carFactory.create();
        vehicle1.description();

        BusFactory busFactory = new BusFactory();
        Vehicle vehicle2 = busFactory.create();
        vehicle2.description();

    }

}
