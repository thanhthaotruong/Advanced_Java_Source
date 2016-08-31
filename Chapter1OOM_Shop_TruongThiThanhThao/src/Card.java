

/**
 * @author Truong Thi Thanh Thao
 * @version 1.0
 * @created 29-Aug-2016 8:37:40 AM
 */
public class Card extends Information {

	protected String cardID;
	protected String dateCreated;

	public Card(){

	}

	public Card(String cardID, String dateCreated) {
		this.cardID = cardID;
		this.dateCreated = dateCreated;
	}

	public String getCardID() {
		return cardID;
	}

	public void setCardID(String cardID) {
		this.cardID = cardID;
	}

	public String getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}

	public void finalize() throws Throwable {
		super.finalize();
	}

}