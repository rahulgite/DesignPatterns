package design.patterns.structural.adapter.object;

import design.patterns.shape.Circle;
import design.patterns.shape.Drawing;
import design.patterns.shape.Rectangle;
import design.patterns.shape.Rhombus;
import design.patterns.shape.Triangle;

public class ObjectAdapterMain {

      public static void main(String[] args) {

            System.out.println("Creating drawing of shapes...");
            Drawing drawing = new Drawing();
            drawing.addShape(new Rectangle());
            drawing.addShape(new Circle());
            drawing.addShape(new GeometricShapeObjectAdapter(new Triangle()));
            drawing.addShape(new GeometricShapeObjectAdapter(new Rhombus()));

            System.out.println("Drawing...");
            drawing.draw();
            System.out.println("Resizing...");
            drawing.resize();
      }

}