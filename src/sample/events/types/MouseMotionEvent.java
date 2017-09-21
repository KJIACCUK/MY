package sample.events.types;

import sample.events.Event;

/**
 * Created by Alex on 31.08.2017.
 */
public class MouseMotionEvent extends Event {

    private int x,y;
    private boolean dragged;

    public MouseMotionEvent(int x, int y, boolean dragged){
        super(Type.MOUSE_MOVED);
        this.x = x;
        this.y = y;
        this.dragged = dragged;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isDragged() {
        return dragged;
    }
}
