package poo;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleados empelado1 = new Empleados("Pepe Putez");
		Empleados empelado2 = new Empleados("Juanita La reina");
		Empleados empelado3 = new Empleados("Juan Bermudez");
 		Empleados empelado4 = new Empleados("Mariola Gutierresz");
		Empleados empelado5 = new Empleados("Pepito  Grillo");


		
		/*System.out.println("Trabajador1" + empelado1.devuelveDatos());
		
		System.out.println("Trabajador2" + empelado2.devuelveDatos());
		empelado1.setSeccion("RRHH");
	
		System.out.println("Trabajador3" + empelado3.devuelveDatos());
		System.out.println("Trabajador4" + empelado4.devuelveDatos());

		
		System.out.println(Empleados.dameSiguienteid());*/
		
		System.out.println(" Trabajador1: " + empelado1.devuelveDatos()+ "\n" + " Trabajador2: " + empelado2.devuelveDatos()
		+ "\n" + " Trabajador3: " + empelado3.devuelveDatos()+ "\n" + " Trabajador4: " + empelado4.devuelveDatos()) ;
		
		System.out.println(Empleados.dameSiguienteid());
		
		
		
	}

}	



class Empleados  {
	
	public Empleados( String nom) {
		nombre = nom;
		seccion = "Administracion";	
		id = idsiguiente ;
		idsiguiente ++;
		
	}

	public void setSeccion(String seccion) {

		this.seccion = seccion;
	
	}
	
	
	public String devuelveDatos() {
		return "El nombre es : " + nombre + " y la seccion es: " + seccion + ". El id es igual a " + id;	
	}
		

	public static String dameSiguienteid() {
		return "el Id siguiente es "  + idsiguiente;
	}
	
	
	
	private final String nombre;
	private String seccion;
	private final int id;
	private static int idsiguiente = 1;
	}