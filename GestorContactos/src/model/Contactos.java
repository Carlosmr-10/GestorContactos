package model;

public class Contactos {
	private String nombre;
	private String telefono;
	private String email;

	public Contactos(String n, String t, String e) {
		this.nombre = n;
		this.telefono = t;
		this.email = e;
	}
	
	

	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getTelefono() {
		return telefono;
	}



	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String toString() {
		return "Nombre: " + nombre + " | Tel: " + telefono + " | Email: " + email;
	}
}