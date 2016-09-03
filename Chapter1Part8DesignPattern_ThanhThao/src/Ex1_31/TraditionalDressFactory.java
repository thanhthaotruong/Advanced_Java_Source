package Ex1_31;

/**
 * @author Thanh Thao
 * @version 1.0
 * @created 01-Sep-2016 2:11:56 PM
 */
public class TraditionalDressFactory implements TailorFactory {

	public TraditionalDress m_TraditionalDress;

	public TraditionalDressFactory(){

	}

	public void finalize() throws Throwable {

	}

	public TraditionalDress getTailor(){
		return new TraditionalDress();
	}

}