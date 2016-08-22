package Bai1_9;


public class ManageComputer {
	Desktop[] desk;
	Laptop[] lap;
	
	public ManageComputer(Desktop[] desk, Laptop[] lap) {
		this.desk = desk;
		this.lap = lap;
	}

	public ManageComputer() {
	}

	public Desktop[] getDesk() {
		return desk;
	}

	public void setDesk(Desktop[] desk) {
		this.desk = desk;
	}

	public Laptop[] getLap() {
		return lap;
	}

	public void setLap(Laptop[] lap) {
		this.lap = lap;
	}
	
	public void outputDesktop(){
        for (int i = 0; i < desk.length; i++) {
            if(desk[i]!=null)
                System.out.println(desk[i].displayInformation());
        }
    }
	public void outputLaptop(){
        for (int i = 0; i < lap.length; i++) {
            if(lap[i]!=null)
                System.out.println(lap[i].displayInformation());
        }
    }
	
	public double totalPriceOfDesktop(){
        double money = 0.0;
        for (int i = 0; i < desk.length; i++) {
            money+= desk[i].price*desk[i].quantities;
        }
        return money;
    }
	public double totalPriceOfLaptop(){
        double money = 0.0;
        for (int i = 0; i < lap.length; i++) {
            money+=lap[i].price*lap[i].quantities;
        }
        return money;
    }
}
