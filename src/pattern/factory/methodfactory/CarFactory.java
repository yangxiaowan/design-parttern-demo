package pattern.factory.methodfactory;

import pattern.factory.product.Car;
import pattern.factory.product.Vehicle;

public class CarFactory implements MethodAbstractFactory{

    @Override
    public Vehicle create() {
        return new Car();
    }
}
