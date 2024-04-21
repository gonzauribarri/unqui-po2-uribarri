package ar.edu.unq.po2.tp5;

import java.util.ArrayList;
import java.util.List;

public class CashMachine{
	
	private List<Payable> payables;
	private double totalAmountToPay;
	
	public CashMachine() {
		this.payables = new ArrayList<Payable>();
		this.totalAmountToPay = 0;
	}

	public List<Payable> getPayables() {
		return this.payables;
	}
	
	public void registerPayable(Payable payable) {
		payables.add(payable);
		this.setTotalAmountToPay(payable.getPrice());
		payable.register();
	}
	
	private void setTotalAmountToPay(double price) {
		this.totalAmountToPay += price;
	}

	public double getPrice() {
		return this.getTotalAmountToPay();
	}
	
	public double getTotalAmountToPay() {
		return this.totalAmountToPay;
	}
}
