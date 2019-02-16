package es.studium.trivial;

public class InicioJuego {
	public static void main(String[] args) {
		// Crear la vista inicial, la de Login
		VistaMenuJuego vmj = new VistaMenuJuego();
		// Crear el modelo de Login
		ModeloMenuJuego mmj = new ModeloMenuJuego();
		// Crear el controlador de Login
		new ControladorMenuJuego(mmj, vmj);
	}
}
