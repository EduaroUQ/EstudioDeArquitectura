package tareaUF8;

public class Baño extends Estancia {

	private boolean bañoDucha;

	public Baño(String nombre, double metrosCuadrados, int puertas, int ventanas, boolean bañoDucha) {
		super(nombre, metrosCuadrados, puertas, ventanas);
		this.bañoDucha = bañoDucha;
	}
	
}
