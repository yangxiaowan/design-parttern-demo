package pattern.observer;

public interface Observerable {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObserver();

}
