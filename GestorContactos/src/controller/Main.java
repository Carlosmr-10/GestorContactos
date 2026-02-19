package controller;

import model.Agenda;
import model.Contactos;

public class Main {

	public static void main(String[] args) {

		Contactos pepe = new Contactos("Pepe", "123456798", "pepe@pepe.es");
		Contactos davy = new Contactos("Davy", "987654321", "davy@davy.es");
		
		Agenda agenda = new Agenda();
		
		agenda.agregarContacto(davy);
		agenda.agregarContacto(pepe);
		
		agenda.listarContactos();
		
		agenda.eliminarContacto("Pepito");
		agenda.eliminarContacto("Pepe");
		
		agenda.buscarContactos("Pepe");
		agenda.buscarContactos("Davy");
		agenda.buscarContactos("Maria");
		
		agenda.listarContactos();
	}
}
