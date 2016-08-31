/**
 * @author Truong Thi Thanh Thao
 * @version 1.0
 * @created 29-Aug-2016 8:37:36 AM
 */
public class Order {

	private String orderDate;
	private boolean printOrder;
	private int status;
	public OrderDetail[] m_OrderDetail;
	public Card m_Card;

	public Order() {

	}

	public Order(String orderDate, boolean printOrder, int status,
			OrderDetail[] m_OrderDetail, Card m_Card) {
		this.orderDate = orderDate;
		this.printOrder = printOrder;
		this.status = status;
		this.m_OrderDetail = m_OrderDetail;
		this.m_Card = m_Card;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public boolean isPrintOrder() {
		return printOrder;
	}

	public void setPrintOrder(boolean printOrder) {
		this.printOrder = printOrder;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public OrderDetail[] getM_OrderDetail() {
		return m_OrderDetail;
	}

	public void setM_OrderDetail(OrderDetail[] m_OrderDetail) {
		this.m_OrderDetail = m_OrderDetail;
	}

	public Card getM_Card() {
		return m_Card;
	}

	public void setM_Card(Card m_Card) {
		this.m_Card = m_Card;
	}

	public void finalize() throws Throwable {

	}

	// Total price of order
	public double calSubTotal() {
		double sum = 0.0;
		for (int i = 0; i < m_OrderDetail.length; i++) {
			sum += m_OrderDetail[i].calLineTotal();

		}
		return sum;
	}

	/*
	 * tax for printOrder/ no print order if customer request print order -->
	 * tax = 0.1*totalPrice of order if customer request no print order --> tax
	 * = 0
	 */
	public double calTax() {
		double tax = 0;
		if (printOrder == false) {
			return tax;
		} else {
			tax = 0.1 * calSubTotal();
			return tax;
		}
	}

	// total price that customer must be pay (=totalPrice of order + tax)
	public double calTotalAmount() {
		return calSubTotal() + calTax();
	}

	@Override
	public String toString() {
		String s = "STT" + "\t" + "PRODUCT" + "\t\t\t" + "PRICE" + "\t\t" +"QUANTITY"+"\n";
		for (int i = 0; i < m_OrderDetail.length; i++) {
			s += (i + 1) + "\t" + m_OrderDetail[i].m_Product.getName() + "\t\t\t"
					+ m_OrderDetail[i].m_Product.getPrice() + "\t\t"
					+ m_OrderDetail[i].getQuantity() + "\n" ;
		}
		return s;

	}
}