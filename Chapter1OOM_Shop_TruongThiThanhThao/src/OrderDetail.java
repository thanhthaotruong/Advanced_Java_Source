/**
 * @author Truong Thi Thanh Thao
 * @version 1.0
 * @created 29-Aug-2016 8:37:41 AM
 */
public class OrderDetail {

	private int quantity;
	public Product m_Product;

	public OrderDetail(){

	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Product getM_Product() {
		return m_Product;
	}

	public void setM_Product(Product m_Product) {
		this.m_Product = m_Product;
	}

	public OrderDetail(int quantity, Product m_Product) {
		super();
		this.quantity = quantity;
		this.m_Product = m_Product;
	}

	public void finalize() throws Throwable {

	}
	//Price of each product
	public double calLineTotal(){
		return quantity * m_Product.getPrice();
	}

}