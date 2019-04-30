package pattern.eventmodel;

/**
 * Created by yangwan on 2019/4/10
 */
public class EventProducer {

    private Integer value;

    ListenerRegister register = new ListenerRegister();

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        if(value != null && !value.equals(this.value)){
            this.value = value;
            EventChangeEvent eventChangeEvent = new EventChangeEvent(value);
        }
    }
}
