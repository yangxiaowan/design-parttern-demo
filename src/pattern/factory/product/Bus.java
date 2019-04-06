package pattern.factory.product;

public class Bus implements Vehicle {

    public Bus(){
        System.out.println("Create a Bus!");
    }

    @Override
    public void description() {
        System.out.println("This is a Bus!");
    }
}
