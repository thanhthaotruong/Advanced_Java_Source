package Ex1_31;

/**
 * @author Thanh Thao
 * @version 1.0
 * @created 01-Sep-2016 2:11:57 PM
 */
public class CheongsamFactory implements TailorFactory {

	public Cheongsam m_Cheongsam;

	public CheongsamFactory(){

	}

	public void finalize() throws Throwable {

	}

	public Cheongsam getTailor(){
		return new Cheongsam();
	}

}