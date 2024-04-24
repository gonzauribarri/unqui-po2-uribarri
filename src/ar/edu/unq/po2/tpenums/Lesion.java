package ar.edu.unq.po2.tpenums;

public enum Lesion {
	
	RED("Leve", "Grey"), 
	GREY("Grave", "Yellow"), 
	YELLOW("Severo", "Honey"), 
	HONEY("Mortal", "Red");
	
	//No es necesario indicar los modificadores a las variables
	String description;
	String next;
	
	//No es necesario indicar el modificador para el constructor
	Lesion(String description, String next) {
		this.setDescription(description);
		this.setNext(next);
	}

	void setDescription(String description) {
		this.description = description;
	}

	void setNext(String next) {
		this.next = next;
	}
	
	public String next() {
		return this.next;
	}
}
