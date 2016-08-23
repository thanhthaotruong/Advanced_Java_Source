package Bai1_11;
/*
 * Author : Truong Thi Thanh Thao
 * Date : 22 August 2016
 * Version 1.0
 */
/*
 * enum Money for manage money and rank of it
 */
enum Money {

    USD(22260), EUR(24982), AUD(16764);
    double rank;

    private Money(double rank) {
        this.rank = rank;
    }

    public double getRank() {
        return rank;
    }
}
/*
 * Class MoneyTran is subclass of Transaction class
 */
public class MoneyTran extends Transaction{
	Money typeMoney;
    int buyOrSell;

    public MoneyTran() {
    }

    public MoneyTran(Money typeMoney, int buyOrSell, String id, String date, int amount, String typeTrade) {
        super(id, date, amount, typeTrade);
        this.typeMoney = typeMoney;
        this.buyOrSell = buyOrSell;
    }

    public Money getTypeMoney() {
        return typeMoney;
    }

    public void setTypeMoney(Money typeMoney) {
        this.typeMoney = typeMoney;
    }

    public int getBuyOrSell() {
        return buyOrSell;
    }

    public void setBuyOrSell(int buyOrSell) {
        this.buyOrSell = buyOrSell;
    }

    public double calBuyMoney() {
        double money = this.amount * typeMoney.getRank();
        return money;
    }

    public double calSellMoney() {
        double money = this.amount * typeMoney.getRank() + (this.amount * typeMoney.getRank()) * 0.01;
        return money;
    }
    
    /*
     * method for print information
     */
    @Override
    public String toString() {
        if(this.buyOrSell == 1){
            return "ID: " + id + " - Date: " + date + " - Amount: " + amount
                + " - Type Transaction: " + typeTrade + " - Type Money: " + typeMoney.name()+" - Buy: "+this.calBuyMoney();
        }
        if(this.buyOrSell ==2){
            return "ID: " + id + " - Date: " + date + " - Amount: " + amount
                + " - Type Transaction: " + typeTrade + " - Type Money: " + typeMoney.name()+" - Sell: "+this.calSellMoney();
        }
        return "";
    }
}
