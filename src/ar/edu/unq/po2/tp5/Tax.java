package ar.edu.unq.po2.tp5;

public class Tax extends Bill{

	private double cost;
	
	public Tax(Agency agency, double cost) {
		super(agency);
		this.setCost(cost);
	}
	
	private void setCost(double cost) {
		this.cost = cost;
	}

	public double getPrice() {
		return this.cost;
	}
}
