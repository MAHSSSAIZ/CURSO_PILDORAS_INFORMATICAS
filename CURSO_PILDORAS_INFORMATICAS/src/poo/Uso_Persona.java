package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Persona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person[] las_Personas = new Person[2];
		las_Personas[0] = new Empleado2("Pepe Putez", 55000, 2010,02,25);
		las_Personas[1] = new Alumno ("Juan Bermudez", "Medicina");
		
		for(Person p: las_Personas) {
			System.out.println( p.dameNombre());
			System.out.println("Esta persona tiene la descripción: " + p.dameDescripcion());
		}
	}

}

/// INICIO CLASE PERSONA

//definicion de clase abstracta como patrón del diseño de la herencia
	abstract class  Person{
		public Person(String nom) {
			nombre = nom;
		}
		
		public String dameNombre() {
			return nombre;
		}
		//declaración del método abstracto dameDescripcion.
		public abstract String dameDescripcion();
			
		private String nombre;
		
	//public  abstract String dameDescripcion();
		
	}

/// FINAL CLASE persona

class Empleado2 extends Person{

	///metodos constructor
	
	public  Empleado2(String nom, double sue, int agno, int mes, int dia) {
		super(nom);
		sueldo = sue;
		GregorianCalendar calendario  = new GregorianCalendar(agno,mes - 1,dia);
		altaContrato = calendario.getTime();	
		Id = idSiguiente + 1;
		idSiguiente ++;
	}
	
	
	// atributos de la clase Empleado	
	
	private double sueldo;
	private Date altaContrato;
	private static int idSiguiente;
	private int Id;
	
	
	///metodos getter
	
	public int dameId() {
		return Id;
	}
	
	
	public double dameSueldo() {
		return sueldo;
	}
	
	public Date dameFechaContrato() {
		return altaContrato;
	}
	
	/// metodos setter
	
	public void subeSueldo(double porcentaje) {
		
		double aumento = sueldo * (porcentaje / 100) ;
		sueldo += aumento;
		
	}

	/// implementacion de clase abstract definida en clase padres
		
	@Override
	public String dameDescripcion() {
		// TODO Auto-generated method stub
		return "Este empleado tiene un id = " + Id + " con un sueldo = "+ sueldo;
	}
	
}

/// FINAL CLASE EMPLEADO


/// INICIO CLASE alumno

class Alumno extends Person{
	private String carrera;
	
	public Alumno(String nom, String car) {
		super(nom);
		carrera = car;
	}

	@Override
	public String dameDescripcion() {
		// TODO Auto-generated method stub
		return "Este alumno se llama :" + dameNombre() + " y estudia la carrera : "+ carrera;
	}
}

/// FINAL CLASE alumno


