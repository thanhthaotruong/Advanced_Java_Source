package Ex1_30;

/**
 * @author Thanh Thao
 * @version 1.0
 * @created 01-Sep-2016 10:56:15 AM
 */
public class SquareFactory implements ShapeFactory {

	public Square m_Square;

	public SquareFactory(){

	}

	public void finalize() throws Throwable {

	}
	//method get a square
	public Square getShape(){
		return new Square();
	}

}