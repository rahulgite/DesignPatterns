package design.patterns.structural.decorator;

import design.patterns.shape.Shape;

public class RedShapeDecorator extends ShapeDecorator {
 
    public RedShapeDecorator(Shape decoratedShape)
    {
        super(decoratedShape);
    }
 
    @Override public void draw()
    {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }
 
    private void setRedBorder(Shape decoratedShape)
    {
      // Display message whenever function is called
        System.out.println("Border Color: Red");
    }

	@Override
	public void resize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isHide() {
		// TODO Auto-generated method stub
		return false;
	}
}