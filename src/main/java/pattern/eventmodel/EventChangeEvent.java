package pattern.eventmodel;

import java.util.EventObject;

/**
 * Created by yangwan on 2019/4/10
 */
public class EventChangeEvent extends EventObject{

    private int value;

    public EventChangeEvent(Object source){
        this(source, 0);
    }

    public EventChangeEvent(Object source, int newValue) {
        super(source);
        value = newValue;
    }

    public int getValue(){
        return this.value;
    }


}
