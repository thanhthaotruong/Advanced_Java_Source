package Ex_1_28;
/*
 * Author : Truong Thi Thanh Thao
 * Date : 05 Sept 2016
 * Version 1.0
 */
public class EmailObserver extends Observer {

	public EmailObserver(Account account) {
		this.account = account;
		this.account.attach(this);
	}

	@Override
	public String update() {
		return "Email: Welcome to ABC Bank. Your account is changed.\nBalance is: "
				+ String.format("%.2f", account.getState()) + " VND";
	}

}
