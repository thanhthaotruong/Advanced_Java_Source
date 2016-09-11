package Ex_1_28;

import java.util.ArrayList;
import java.util.List;


/*
 * Author : Truong Thi Thanh Thao
 * Date : 05 Sept 2016
 * Version 1.0
 */
public class Account {
	private List<Observer> observers = new ArrayList<>();
	private double state;

	public double getState() {
		return state;
	}

	public void setState(double state) {
		this.state = state;
		notifyAllObservers();
	}

	public void attach(Observer observer) {
		observers.add(observer);
	}

	private void notifyAllObservers() {
		for (Observer observer : observers) {
			observer.update();
		}
	}

}
