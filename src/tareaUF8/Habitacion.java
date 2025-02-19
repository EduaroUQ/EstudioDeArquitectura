package tareaUF8;

public class Habitacion extends Estancia {

	private int numeroPuertas;
	private boolean accesoBaño;
	
	public Habitacion(String nombre, double metrosCuadrados, int puertas, int ventanas, int numeroPuertas,
			boolean accesoBaño) {
		super(nombre, metrosCuadrados, puertas, ventanas);
		this.numeroPuertas = numeroPuertas;
		this.accesoBaño = accesoBaño;
	}
	
}
