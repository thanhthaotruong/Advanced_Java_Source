package Bai1_11;

/*
 * Author : Truong Thi Thanh Thao
 * Date : 22 August 2016
 * Version 1.0
 * Class ManageTransaction for manage the transaction 
 */
public class ManageTransaction {
	GoldTran[] tG;
    MoneyTran[] tM;

    public ManageTransaction() {
    }

    public ManageTransaction(GoldTran[] tG, MoneyTran[] tM) {
        this.tG = tG;
        this.tM = tM;
    }

    public GoldTran[] gettG() {
        return tG;
    }

    public void settG(GoldTran[] tG) {
        this.tG = tG;
    }

    public MoneyTran[] gettM() {
        return tM;
    }

    public void settM(MoneyTran[] tM) {
        this.tM = tM;
    }
    /*
     * method for print array money transaction
     */
    public void outputArrMoney() {
        for (MoneyTran tM1 : tM) {
            if (tM1 != null) {
                System.out.println(tM1.toString());
            }

        }
    }
    /*
     * method for print array gold transaction
     */
    public void outPutArrGold() {
        for (GoldTran tG1 : tG) {
            if (tG1 != null) {
                System.out.println(tG1.toString());;
            }
        }
    }
}
