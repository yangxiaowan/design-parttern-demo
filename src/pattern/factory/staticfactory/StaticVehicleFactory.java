package pattern.factory.staticfactory;

/**
 * 静态工厂/简单工厂
 * 根据创建信息返回对应实例
 */
public class StaticVehicleFactory {

    public static Vehicle create(VehicleEnum vehicleEnum){
        if(VehicleEnum.CAR == vehicleEnum){
            return new Car();
        }else if(VehicleEnum.BUS == vehicleEnum){
            return new Bus();
        }else{
            return null;
        }
    }

}
