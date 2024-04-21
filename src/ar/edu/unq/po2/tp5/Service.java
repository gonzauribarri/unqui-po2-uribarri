package ar.edu.unq.po2.tp5;

public class Service extends Bill{
	
	private double costPerUnit;
	private int unitsAmount;
	
	public Service(Agency agency, double costPerAmount, int unitsAmount) {
		super(agency);
		this.setCostPerUnit(costPerAmount);
		this.setUnitsAmount(unitsAmount);
	}

	private void setUnitsAmount(int unitsAmount) {
		this.unitsAmount = unitsAmount;
	}

	private void setCostPerUnit(double costPerAmount) {
		this.costPerUnit = costPerAmount;
	}
	
	public double getPrice() {
		return (this.getUnitsAmount() * this.getCostPerUnit()); 
	}

	private int getUnitsAmount() {
		return this.unitsAmount;
	}

	private double getCostPerUnit() {
		return this.costPerUnit;
	}
}
