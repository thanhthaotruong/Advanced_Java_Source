

/**
 * @author Truong Thi Thanh Thao
 * @version 1.0
 * @created 29-Aug-2016 8:37:39 AM
 */
public class ATMCard extends Card implements IAuthMethod {

	private double balance;

	public ATMCard(){

	}

	public ATMCard(String cardID, String dateCreated, double balance) {
		super(cardID, dateCreated);
		this.balance = balance;
	}

	public ATMCard(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	public String getAuthMethod(){
		return "";
	}

}