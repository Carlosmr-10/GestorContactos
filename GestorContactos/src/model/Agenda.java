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

		for (int i = 0; i < listaContactos.size(); i++) {
			
			if (nombre.equalsIgnoreCase(listaContactos.get(i).getNombre)) {
				
				listaContactos.remove(i);
			}
		}
	}

	private boolean buscarContactos(String nombre) {

		boolean existe = false;

		for (int i = 0; i < listaContactos.size(); i++) {
			
			if (nombre.equalsIgnoreCase(listaContactos.get(i).getNombre)) {
				
				existe = true;
				System.out.println("Contacto encontrado");
				return listaContactos.get(i);
			}
			else {
			
				System.out.println("Contacto no encontrado");
			}
		}
		
		return existe;
	}
	
	public void listarContactos() {
        System.out.println("\n LISTA DE CONTACTOS ");
        for (Contactos c : listaContactos) {
            System.out.println(c);
        }
    }
}
