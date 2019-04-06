package pattern.factory.staticfactory;

public enum VehicleEnum {

    CAR("car", "小汽车"),
    BUS("bus", "巴士")
    ;

    private String type;

    private String description;

    VehicleEnum(String type, String description){
        this.type = type;
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }
}
