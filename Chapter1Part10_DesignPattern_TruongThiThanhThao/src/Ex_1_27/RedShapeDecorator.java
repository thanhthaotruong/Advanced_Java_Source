package Ex_1_27;
/*
 * Author : Truong Thi Thanh Thao
 * Date : 05 Sept 2016
 * Version 1.0
 */
public class RedShapeDecorator extends ShapeDecorator{

	public RedShapeDecorator(Shape shape) {
		super(shape);
	}
	//method draw() override via draw() in ShapeDecorator 
	@Override
	public String draw() {
		return this.shape.draw() + " and "+setRedBorder(shape);
	}

	private String setRedBorder(Shape shape){
		return "Border Color: Red";
	}
}
