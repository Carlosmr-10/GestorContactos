package controller;

import model.Agenda;
import model.Contactos;

public class Main {
	public static void main(String[] args) {
		Agenda miAgenda = new Agenda();

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
		Contactos c1 = new Contactos("Pepe", "600111222", "pepe@mail.com");
		Contactos c2 = new Contactos("Lola", "677333444", "lola@mail.com");

		miAgenda.agregarContacto(c1);
		miAgenda.agregarContacto(c2);

		miAgenda.listarContactos();

		System.out.println("\nBuscando a Pepe");
		String resultado = miAgenda.buscarContactos("Pepe");
		System.out.println("Resultado: " + resultado);

		System.out.println("\nEliminando a Pepe");
		miAgenda.eliminarContacto("Pepe");

		miAgenda.listarContactos();
	}
}
