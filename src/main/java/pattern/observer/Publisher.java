package pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Publisher implements Observerable{

    private List<Observer> observerList;

    private String message;

    public Publisher(){
        observerList = new ArrayList<Observer>();
    }

    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    public void removeObserver(Observer observer) {
        if(observerList != null && !observerList.isEmpty()){
            observerList.remove(observer);
        }
    }

    public void notifyObserver() {
        if(observerList != null && observerList.size() > 0){
            observerList.forEach(item  -> {
                item.update(this.message);
            });
        }
    }

    public void setSendMessage(String message){
        this.message = message;
        this.notifyObserver();
    }

}
