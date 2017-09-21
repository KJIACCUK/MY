package sample.sendbox;

import sample.events.Dispatcher;
import sample.events.Event;
import sample.events.EventHandler;
import sample.events.types.MouseMotionEvent;
import sample.events.types.MousePressedEvent;
import sample.events.types.MouseReleasedEvent;
import sample.layers.Layer;

import java.awt.*;
import java.util.Random;


public class Example extends Layer {

    private String name;
    private Color color;
    private Rectangle  rect;
    private boolean dragging = false;
    private int px, py;

    private static final Random random = new Random();

    public Example(String name, Color color) {
        this.name = name;
        this.color = color;

        rect = new Rectangle(random.nextInt(100)+150,random.nextInt(100)+250,120,240);
    }

    public void onEvent(Event event){
        Dispatcher dispatcher = new Dispatcher(event);
        dispatcher.dispatch(Event.Type.MOUSE_PRESSED, (Event e) -> onPressed((MousePressedEvent)e));
        dispatcher.dispatch(Event.Type.MOUSE_RELEASED, (Event e) -> onReleased((MouseReleasedEvent)e));
        dispatcher.dispatch(Event.Type.MOUSE_MOVED, (Event e) -> onMoved((MouseMotionEvent)e));
    }

    public void onRender(Graphics g){
        g.setColor(color);
        g.fillRect(rect.x, rect.y, rect.width, rect.height);

        g.setColor(Color.red);
        g.drawString(name, rect.x +7, rect.y+40);
    }

    private boolean onPressed(MousePressedEvent event){
       if(rect.contains(new Point(event.getX(),event.getY())))
        dragging = true;
        return dragging;
    }

    private boolean onReleased(MouseReleasedEvent event){
        dragging = false;
        return dragging;
    }

    private boolean onMoved(MouseMotionEvent event){
        if(dragging){
            rect.x += event.getX() - px;
            rect.y += event.getY() - py;
        }
        px = event.getX();
        py = event.getY();
        //System.out.println("Mouse moved: "+event.getX()+" | "+event.getY());
        //return false;
        return dragging;
    }

}
