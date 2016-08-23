package Bai1_12;
/*
 * Author : Truong Thi Thanh Thao
 * Date : 22 August 2016
 * Version 1.0
 * Class for manage list textbook and reference book
 */
public class ManageBook {
	TextBook[] textbook;
	ReferenceBook[] referencebook;
	public ManageBook(TextBook[] textbook, ReferenceBook[] referencebook) {
		super();
		this.textbook = textbook;
		this.referencebook = referencebook;
	}
	public TextBook[] getTextbook() {
		return textbook;
	}
	public void setTextbook(TextBook[] textbook) {
		this.textbook = textbook;
	}
	public ReferenceBook[] getReferencebook() {
		return referencebook;
	}
	public void setReferencebook(ReferenceBook[] referencebook) {
		this.referencebook = referencebook;
	}
	//method for print information the Text Book
	public void outputTextBook(){
        for (int i = 0; i < textbook.length; i++) {
            if(textbook[i]!=null)
                System.out.println(textbook[i].toString());
        }
    }
	//method for print information the Reference book
	public void outputReferenceBook(){
        for (int i = 0; i < referencebook.length; i++) {
            if(referencebook[i]!=null)
                System.out.println(referencebook[i].toString());
        }
    }
	//method calculate the total price of TextBook new
	public double totalNew(){
		double money = 0.0;
        for (int i = 0; i < textbook.length; i++) {
            money+= textbook[i].totalPriceNew();
        }
        return money;
	}
	//method calculate the total price of Text Book Old
	public double totalOld(){
		double money = 0.0;
        for (int i = 0; i < textbook.length; i++) {
            money+= textbook[i].totalPriceOld();
        }
        return money;
	}
	//method calculate the total price of ReferenceBook
	public double totalReferenceBook(){
		double money = 0.0;
        for (int i = 0; i < referencebook.length; i++) {
            money+= referencebook[i].totalPrice();
        }
        return money;
	}
}
