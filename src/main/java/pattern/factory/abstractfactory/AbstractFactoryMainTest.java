package pattern.factory.abstractfactory;

import pattern.factory.product.Vehicle;
import pattern.factory.product.Vender;

public class AbstractFactoryMainTest {

    public static void main(String[] args) {

        CarAbtFactory carAbtFactory = new CarAbtFactory();
        Vehicle vehicle1 = carAbtFactory.createVehicle();
        vehicle1.description();
        Vender vender1 = carAbtFactory.createVender();
        vender1.display();

        BusAbtFactory busAbtFactory = new BusAbtFactory();
        Vehicle vehicle2 = busAbtFactory.createVehicle();
        vehicle2.description();
        Vender vender2 = busAbtFactory.createVender();
        vender2.display();

    }

}
