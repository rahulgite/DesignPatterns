package design.patterns.structural.adapter.classadapter;

import design.patterns.shape.Circle;
import design.patterns.shape.Drawing;
import design.patterns.shape.Rectangle;

public class ClassAdapterMain {

  public static void main(String[] args) {

        System.out.println("Creating drawing of shapes...");
        Drawing drawing = new Drawing();
        drawing.addShape(new Rectangle());
        drawing.addShape(new Circle());
        drawing.addShape(new TriangleAdapter());
        drawing.addShape(new RhombusAdapter());

        System.out.println("Drawing...");
        drawing.draw();
        System.out.println("Resizing...");
        drawing.resize();
    }

}