package model;

import java.util.ArrayList;

public class Agenda {

	private ArrayList<Contactos> listaContactos;

    public Agenda() {
        this.listaContactos = new ArrayList<>();
    }	
	
    public void agregarContacto(Contactos c) {
        listaContactos.add(c);
        System.out.println("Contacto añadido con éxito.");
    }
	
	private void eliminarContacto(String nombre) {

		
	}

	private boolean buscarContactos(String nombre) {

		boolean existe = false;
		
		return existe;
	}
	
	public void listarContactos() {
        System.out.println("\n LISTA DE CONTACTOS ");
        for (Contactos c : listaContactos) {
            System.out.println(c);
        }
    }
}
