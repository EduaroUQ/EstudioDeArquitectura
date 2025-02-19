package tareaUF8;

public class Salon extends Estancia {
	//atributos
	private int tomasDeRed;
	private double metrosCuadradosTerraza;
	
	//constructor
	public Salon(String nombre, double metrosCuadrados, int puertas, int ventanas, int tomasDeRed,
			double metrosCuadradosTerraza) {
		super(nombre, metrosCuadrados, puertas, ventanas);
		this.tomasDeRed = tomasDeRed;
		this.metrosCuadradosTerraza = metrosCuadradosTerraza;
	}
	
	public double getMetrosCuadradosTerraza() {
		return super.getMetrosCuadrados()+metrosCuadradosTerraza;
	}
	
	

}
