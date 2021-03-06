package sample.events;

/**
 * Created by Alex on 31.08.2017.
 */
public class Dispatcher {

    private Event event;

    public Dispatcher(Event event){
        this.event = event;
    }

    public void dispatch(Event.Type type, EventHandler handler){
        if(event.handled)
            return;

        if(event.getType() == type)
            event.handled = handler.handle(event);

    }
}
