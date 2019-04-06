package pattern.factory.product;

public class Car implements Vehicle {

    public Car(){
        System.out.println("Create a Car!");
    }

    @Override
    public void description() {
        System.out.println("This is a Car!");
    }
}
