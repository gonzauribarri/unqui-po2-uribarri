package ar.edu.unq.po2.tpsolid;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private String nombre;
	private List<Cliente> clientes = new ArrayList<Cliente>();
	
	public Banco(String nombre) {
		this.setNombre(nombre);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public List<Cliente> getClientes() {
		return this.clientes;
	}
	
	public void agregarCliente(Cliente cliente) {
		this.getClientes().add(cliente);
	}
}