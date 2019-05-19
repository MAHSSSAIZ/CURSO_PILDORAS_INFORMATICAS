package clases_propias;

public class Empleado{
	private String nombre;
	private int edad;
	private double sueldo;
	
	public Empleado(String nombre, int edad, double sueldo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sueldo = sueldo;
		
	}
	
	public String dameDatos() {
		
		return "El empleado se llama " + nombre + " y tiene una edad de: " + edad + " años, con un sueldo de :" + sueldo;
		
	}
}
