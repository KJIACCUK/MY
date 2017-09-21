package sample.events.types;

/**
 * Created by Alex on 31.08.2017.
 */
public class MouseReleasedEvent extends MouseButtonEvent {
    public MouseReleasedEvent(int keyCode, int x, int y) {
        super(Type.MOUSE_RELEASED, keyCode, x, y);
    }
}
