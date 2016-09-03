package Ex1_31;

/**
 * @author Thanh Thao 
 * @version 1.0
 * @created 01-Sep-2016 2:11:57 PM
 */
public class StylizedFactory implements TailorFactory {

	public Stylized m_Stylized;

	public StylizedFactory(){

	}

	public void finalize() throws Throwable {

	}

	public Stylized getTailor(){
		return new Stylized();
	}

}