package pattern.observer;

public class ObserverPatternMainTest {

    public static void main(String[] args) {
        Subscriber subscriber1 = new Subscriber("yangwan");
        Subscriber subscriber2 = new Subscriber("wanwan");
        Subscriber subscriber3 = new Subscriber("lanlan");
        Publisher publisher = new Publisher();
        publisher.registerObserver(subscriber1);
        publisher.registerObserver(subscriber2);
        publisher.registerObserver(subscriber3);
        publisher.setSendMessage("大家好，我是发布者。");
        publisher.removeObserver(subscriber1);
        publisher.setSendMessage(subscriber1.getUserName() + " 取消了订阅");
    }

}
