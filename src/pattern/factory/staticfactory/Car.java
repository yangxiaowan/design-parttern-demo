package pattern.factory.staticfactory;

public class Car implements Vehicle{

    @Override
    public void description() {
        System.out.println("This is a Car!");
    }
}
