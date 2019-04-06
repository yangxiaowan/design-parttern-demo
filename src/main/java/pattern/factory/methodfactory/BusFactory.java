package pattern.factory.methodfactory;

import pattern.factory.product.Bus;
import pattern.factory.product.Vehicle;

public class BusFactory implements MethodAbstractFactory{

    @Override
    public Vehicle create() {
        return new Bus();
    }
}
