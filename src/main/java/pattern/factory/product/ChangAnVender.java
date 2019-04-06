package pattern.factory.product;

public class ChangAnVender implements Vender{
    @Override
    public void display() {
        System.out.println("This vehicle is produced  by ChangAn!");
    }
}
