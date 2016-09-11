package Ex_1_27;
/*
 * Author : Truong Thi Thanh Thao
 * Date : 05 Sept 2016
 * Version 1.0
 */
public abstract class ShapeDecorator implements Shape{
	protected Shape shape;

	public ShapeDecorator(Shape shape) {
		this.shape = shape;
	}

	public Shape getShape() {
		return shape;
	}

	public void setShape(Shape shape) {
		this.shape = shape;
	}

	//method draw() override via draw() in Shape 
	@Override
	public String draw() {
		return shape.draw();
	}
	
	
}
