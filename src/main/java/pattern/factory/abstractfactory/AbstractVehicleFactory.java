package pattern.factory.abstractfactory;

import pattern.factory.product.Vehicle;
import pattern.factory.product.Vender;

public interface AbstractVehicleFactory {

    Vehicle createVehicle();

    Vender createVender();

}
