package es.studium.trivial;

public class InicioJuego {
	public static void main(String[] args) {

		VistaMenuJuego VistaMenuJuego = new VistaMenuJuego();
		ModeloMenuJuego ModeloMenuJuego = new ModeloMenuJuego();
		new ControladorMenuJuego(ModeloMenuJuego, VistaMenuJuego);
	}
}
