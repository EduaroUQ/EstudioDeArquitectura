package tareaUF8;

public class Hall extends Estancia {
	
	private boolean puertaBlindada;
	
	

	public Hall(String nombre, double metrosCuadrados, int puertas, int ventanas, boolean puertaBlindada) {
		super(nombre, metrosCuadrados, puertas, ventanas);
		this.puertaBlindada = puertaBlindada;
	}



	public double getmetrosCuadrados() {
		return metrosCuadrados;
	}

}
