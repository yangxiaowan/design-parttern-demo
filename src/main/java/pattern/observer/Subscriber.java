package pattern.observer;

/**
 * 消息订阅者-观察者
 */
public class Subscriber implements Observer{

    private String userName;

    public Subscriber(String userName){
        this.userName = userName;
    }

    public void update(String message) {
        System.out.println(userName + " get the message : " + message);

    }

    public String getUserName() {
        return userName;
    }
}
