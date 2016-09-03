package Ex1_30;

/**
 * @author Thanh Thao
 * @version 1.0
 * @created 01-Sep-2016 10:56:16 AM
 */
public class RectangleFactory implements ShapeFactory {

	public Rectangle m_Rectangle;

	public RectangleFactory(){

	}

	public void finalize() throws Throwable {

	}
	//method get a rectangle
	public Rectangle getShape(){
		return new Rectangle();
	}

}