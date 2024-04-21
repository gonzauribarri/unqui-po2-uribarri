package ar.edu.unq.po2.tp5;

public class Product implements Payable{
	
	protected double price;
	protected int stock;
	
	public Product(double price, int stock) {
		this.setPrice(price);
		this.setStock(stock);
	}

	private void setPrice(double price) {
		this.price = price;
	}
	
	private void setStock(int stock) {
		this.stock = stock;
	}
	
	public int getStock() {
		return this.stock;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public void register() {
		if(this.getStock() == 0) {
			System.out.println("No hay mas stock de este producto");
		}
		else {
			this.setStock(this.getStock() - 1);
		}
	}
}