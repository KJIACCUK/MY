package sample.events.types;

/**
 * Created by Alex on 31.08.2017.
 */
public class MousePressedEvent extends MouseButtonEvent {

    public MousePressedEvent(int keyCode, int x, int y) {
        super(Type.MOUSE_PRESSED, keyCode, x, y);
    }
}
