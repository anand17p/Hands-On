package com.abc47;

public class TicketBooking implements Comparable<TicketBooking> {
	private String customerName;
	private Integer price;

	public TicketBooking() {

	}

	public TicketBooking(String customerName, Integer price) {
		super();
		this.customerName = customerName;
		this.price = price;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getCustomerName() {
		return customerName;
	}

	public Integer getPrice() {
		return price;
	}

	@Override
	public int compareTo(TicketBooking o) {
		int c = ((TicketBooking) o).getPrice();
		int a = (int) (this.getPrice() - c);
		return a;
	}

	public String toString() {

		return customerName + " spends amount of Rs." + price;

	}
}
