package tareaUF8;

public abstract class Estancia {
	
	//Atributos de la clase madre
	protected String nombre;
	protected double metrosCuadrados;
	protected int puertas;
	protected int ventanas;
	
	//Métodos de la clase
	public abstract int calcularMetrosCuadrados();
}
