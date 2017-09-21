package sample;

import java.awt.*;

import sample.core.Window;
import sample.sendbox.Example;


public class Main{

    public static void main(String[] args) {
        Window window = new Window("Перетаскивание прямоугольников", 960, 640);
        window.addLayer(new Example("Прямоугольник - 1", Color.CYAN));
        window.addLayer(new Example("Прямоугольник - 2", Color.yellow));
        window.addLayer(new Example("Прямоуголик - 3", Color.GREEN));
       // window.addLayer(new Example("Layer-3", Color.GRAY));
    }
}
