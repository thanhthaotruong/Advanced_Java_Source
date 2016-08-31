

/**
 * @author Truong Thi Thanh Thao
 * @version 1.0
 * @created 29-Aug-2016 8:37:38 AM
 */
public class CreditCard extends Card implements IAuthMethod {

	private String  expirationDate;
	private double maxDebt;
	private String type;

	public CreditCard(){

	}

	public CreditCard(String cardID, String dateCreated, String expirationDate,
			double maxDebt, String type) {
		super(cardID, dateCreated);
		this.expirationDate = expirationDate;
		this.maxDebt = maxDebt;
		this.type = type;
	}

	public CreditCard(String expirationDate, double maxDebt, String type) {
		this.expirationDate = expirationDate;
		this.maxDebt = maxDebt;
		this.type = type;
	}

	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	public double getMaxDebt() {
		return maxDebt;
	}

	public void setMaxDebt(double maxDebt) {
		this.maxDebt = maxDebt;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	public String getAuthMethod(){
		return "";
	}

}