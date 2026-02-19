package model;

public class Agenda {

	private Contactos contacto;
	
	public Agenda(Contactos contacto) {

		this.contacto = contacto;
	}
	
	private void agregarContacto(Contactos c) {

		
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
	
	private void listarContactos() {
		
	}
}
