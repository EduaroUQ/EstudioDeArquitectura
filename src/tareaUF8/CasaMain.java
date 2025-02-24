package tareaUF8;

import java.util.*;

public class CasaMain {

	public static void main(String[] args) {
//		String nombre, double metrosCuadrados, int puertas, int ventanas, double metrosCuadradosTendedero
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe el nombre del hall");
		String nombreHall = sc.nextLine();
		System.out.println("¿Cuántos metros cuadrados tiene?");
		double metrosHall = Double.parseDouble(sc.nextLine());
		System.out.println("¿Cuántas puertas tiene?");
		int puertasHall = Integer.parseInt(sc.nextLine());
		System.out.println("¿Cuántas ventanas tiene?");
		int ventanasHall = Integer.parseInt(sc.nextLine());
		System.out.println("¿Tiene puerta blindada?");
		String puertaHall = sc.nextLine();
		boolean valorHall = puertaHall.equals("sí");
		
		Hall h1= new Hall(nombreHall,metrosHall,puertasHall,ventanasHall,valorHall);
		
		System.out.println("Escribe el nombre de la cocina");
		String nombreCocina = sc.nextLine();
		System.out.println("¿Cuántos metros cuadrados tiene?");
		double metrosCocina = Double.parseDouble(sc.nextLine());
		System.out.println("¿Cuántas puertas tiene?");
		int puertasCocina = Integer.parseInt(sc.nextLine());
		System.out.println("¿Cuántas ventanas tiene?");
		int ventanasCocina = Integer.parseInt(sc.nextLine());
		System.out.println("¿Cuántos metros cuadrados tiene el tendero?");
		double tenderoCocina = Double.parseDouble(sc.nextLine());
		
		Cocina c1=new Cocina(nombreCocina,metrosCocina,puertasCocina,ventanasCocina,tenderoCocina);
		
		System.out.println("Escribe el nombre del salón");
		String nombreSalon = sc.nextLine();
		System.out.println("¿Cuántos metros cuadrados tiene?");
		double metrosSalon = Double.parseDouble(sc.nextLine());
		System.out.println("¿Cuántas puertas tiene?");
		int puertasSalon = Integer.parseInt(sc.nextLine());
		System.out.println("¿Cuántas ventanas tiene?");
		int ventanasSalon = Integer.parseInt(sc.nextLine());
		System.out.println("¿Cuántas tomas de red tiene?");
		int tomasSalon = Integer.parseInt(sc.nextLine());
		System.out.println("¿Cuántos metros cuadrados tiene la terraza?");
		double terrazaSalon = Double.parseDouble(sc.nextLine());
		
		Salon s1=new Salon(nombreSalon,metrosSalon,puertasSalon,ventanasSalon,tomasSalon,terrazaSalon);
		
		System.out.println("Escribe el nombre de la habitación");
		String nombreHab = sc.nextLine();
		System.out.println("¿Cuántos metros cuadrados tiene?");
		double metrosHab = Double.parseDouble(sc.nextLine());
		System.out.println("¿Cuántas puertas tiene?");
		int puertasHab = Integer.parseInt(sc.nextLine());
		System.out.println("¿Cuántas ventanas tiene?");
		int ventanasHab = Integer.parseInt(sc.nextLine());
		System.out.println("¿Cuántas puertas de armario empotrado tiene?");
		int puertasEmpoHab = Integer.parseInt(sc.nextLine());
		System.out.println("¿Tiene acceso directo al baño?");
		String bañoHab = sc.nextLine();
		boolean valorHab= bañoHab.equals("Sí");
		
		Habitacion hab1= new Habitacion(nombreHab,metrosHab,puertasHab,ventanasHab,puertasEmpoHab,valorHab);
		
		System.out.println("Escribe el nombre del baño");
		String nombreBa = sc.nextLine();
		System.out.println("¿Cuántos metros cuadrados tiene?");
		double metrosBa = Double.parseDouble(sc.nextLine());
		System.out.println("¿Cuántas puertas tiene?");
		int puertasBa = Integer.parseInt(sc.nextLine());
		System.out.println("¿Cuántas ventanas tiene?");
		int ventanasBa = Integer.parseInt(sc.nextLine());
		System.out.println("¿Tiene bañera o ducha?");
		String bañera = sc.nextLine();
		boolean valorBa= bañera.equals("bañera");
		
		Baño b1= new Baño(nombreBa,metrosBa,puertasBa,ventanasBa,valorBa);
		
		System.out.println("La suma de los metros cuadrados totales es: "+ sumaMetros(h1,c1,s1,hab1,b1));
		
	}
	
	public static double sumaMetros(Hall h, Cocina c, Salon s, Habitacion ha, Baño b) {
		double suma= (h.getmetrosCuadrados()+c.getMetrosCuadradosTendedero()+s.getMetrosCuadradosTerraza()+ha.getMetrosCuadrados()+b.getMetrosCuadrados());
		return suma;
	}
}
