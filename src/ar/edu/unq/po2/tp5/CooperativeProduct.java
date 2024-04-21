package ar.edu.unq.po2.tp5;

public class CooperativeProduct extends Product{
	
	public CooperativeProduct(double price, int stock) {
		super(price, stock);
	}
	
	public double getPrice() {
		return this.price * 0.9;
	}
}