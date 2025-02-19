package tareaUF8;

public abstract class Estancia {
	
	//Atributos de la clase madre
	protected String nombre;
	protected double metrosCuadrados;
	protected int puertas;
	protected int ventanas;

	//Constructor de la clase
	public Estancia(String nombre, double metrosCuadrados, int puertas, int ventanas) {
		this.nombre = nombre;
		this.metrosCuadrados = metrosCuadrados;
		this.puertas = puertas;
		this.ventanas = ventanas;
	}
	

}
