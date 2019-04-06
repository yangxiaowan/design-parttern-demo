package pattern.factory.staticfactory;

/**
 * 简单工厂测试方法
 */
public class StaticFactoryMainTest {

    public static void main(String args[]){
        Vehicle vehicle1 = StaticVehicleFactory.create(VehicleEnum.CAR);
        vehicle1.description();
        Vehicle vehicle2 = StaticVehicleFactory.create(VehicleEnum.BUS);
        vehicle2.description();
    }

}
