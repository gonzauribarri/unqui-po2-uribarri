package ar.edu.unq.po2.tp5;

public abstract class Bill implements Payable{
	
	private Agency agency;
	
	public Bill(Agency agency) {
		this.setAgency(agency);
	}
	
	protected void setAgency(Agency agency) {
		this.agency = agency;
	}
	
	protected Agency getAgency() {
		return this.agency;
	}

	public void register() {
		this.getAgency().registerPay(this);
	}
	
	public abstract double getPrice();
}
