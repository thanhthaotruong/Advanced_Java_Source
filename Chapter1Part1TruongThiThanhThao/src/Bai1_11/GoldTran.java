package Bai1_11;
/*
 * Author : Truong Thi Thanh Thao
 * Date : 22 August 2016
 * Version 1.0
 */

/*
 * enum Gold for manage type of gold
 */
enum Gold {

    Gold9999(3583000), Gold24K(3500000), GoldSJC(3694000);
    double rank;

    private Gold(double rank) {
        this.rank = rank;
    }

    public double getRank() {
        return rank;
    }
}
public class GoldTran extends Transaction{
	Gold gold;

    public GoldTran() {
    }

    public GoldTran(Gold gold, String id, String date, int amount, String typeTrade) {
        super(id, date, amount, typeTrade);
        this.gold = gold;
    }

    public Gold getGold() {
        return gold;
    }

    public void setGold(Gold gold) {
        this.gold = gold;
    }
    /*
     * method for get the rank of gold
     */
    public double calPriceGold() {
        double money = this.amount * gold.getRank();
        return money;
    }
    /*
     * method for print information
     */
    @Override
    public String toString() {
        return "ID: " + id + " - Date: " + date + " - Amount: " + amount +
                " - Type Transaction: " + typeTrade + " - Type Gold: " + gold.name() +
                " - Money: " + this.calPriceGold();
    }
}
