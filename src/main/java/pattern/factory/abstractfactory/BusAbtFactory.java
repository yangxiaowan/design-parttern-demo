package pattern.factory.abstractfactory;

import pattern.factory.product.Car;
import pattern.factory.product.DaZhongVender;
import pattern.factory.product.Vehicle;
import pattern.factory.product.Vender;

public class BusAbtFactory implements AbstractVehicleFactory{

    @Override
    public Vehicle createVehicle() {
        return new Car();
    }

    @Override
    public Vender createVender() {
        return new DaZhongVender();
    }
}
