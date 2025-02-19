package tareaUF8;

public class Cocina extends Estancia {

	private double metrosCuadradosTendedero;
	
	public Cocina(String nombre, double metrosCuadrados, int puertas, int ventanas, double metrosCuadradosTendedero) {
		super(nombre, metrosCuadrados, puertas, ventanas);
		this.metrosCuadradosTendedero = metrosCuadradosTendedero;
	}
		
	public double getMetrosCuadradosTendedero() {
		return super.getMetrosCuadrados() + metrosCuadradosTendedero;
	}


}
