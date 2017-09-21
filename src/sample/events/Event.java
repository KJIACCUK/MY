package sample.events;

/**
 * Created by Alex on 31.08.2017.
 */
public class Event {

    public enum Type{
        MOUSE_MOVED, MOUSE_PRESSED, MOUSE_RELEASED,
    }

    private Type type;
    public boolean handled;

    protected Event(Type type){
        this.type = type;
    }

    public Type getType(){
        return type;
    }
}
