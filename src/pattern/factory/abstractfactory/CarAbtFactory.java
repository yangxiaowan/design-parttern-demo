package pattern.factory.abstractfactory;

import pattern.factory.product.Bus;
import pattern.factory.product.ChangAnVender;
import pattern.factory.product.Vehicle;
import pattern.factory.product.Vender;

public class CarAbtFactory implements AbstractVehicleFactory{
    @Override
    public Vehicle createVehicle() {
        return new Bus();
    }

    @Override
    public Vender createVender() {
        return new ChangAnVender();
    }
}
