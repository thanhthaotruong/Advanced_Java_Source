package Ex1_30;

/**
 * @author Thanh Thao
 * @version 1.0
 * @created 01-Sep-2016 10:56:14 AM
 */
public class CircleFactory implements ShapeFactory {

	public Circle m_Circle;

	public CircleFactory(){

	}

	public void finalize() throws Throwable {

	}
	//method get a circle
	public Circle getShape(){
		return new Circle();
	}

}