package ar.edu.unq.po2.tpsolid;

public class Cliente {
	
	private String nombre;
	private String apellido;
	private String direccion;
	private int edad;
	private double sueldoNetoMensual;
	private double sueldoNetoAnual;
	
	public Cliente(String nombre, String apellido, String direccion, int edad, double sueldoNetoMensual) {
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setDireccion(direccion);
		this.setEdad(edad);
		this.setSueldoNetoMensual(sueldoNetoMensual);
		this.setSueldoNetoAnual();
	}

	private void setSueldoNetoAnual() {
		this.sueldoNetoAnual += this.getSueldoNetoMensual() * 12;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	private void setEdad(int edad) {
		this.setEdad(edad);
	}
	
	public void setSueldoNetoMensual(double sueldoNetoMensual) {
		this.sueldoNetoMensual = sueldoNetoMensual;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getApellido() {
		return apellido;
	}

	public String getDireccion() {
		return direccion;
	}
	
	public int getEdad() {
		return this.edad;
	}

	public double getSueldoNetoMensual() {
		return sueldoNetoMensual;
	}
	
	public double getSueldoNetoAnual() {
		return sueldoNetoAnual;
	}
}
