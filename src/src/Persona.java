package src;

public class Persona {
	String nombre;
	String apellido;
	String direccion;

	public Persona() {
		this.nombre = "No informado";
		this.apellido = "No informado";
		this.direccion = "No informado";
	}

	public Persona(String nombre) {
		this();
		this.nombre = nombre;
	}

	public Persona(String nombre, String apellido, String direccion) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
	}

	public String toString() {
		return "Persona = " + this.nombre + " " + apellido + " - Dir: " + direccion;
	}
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p1 = new Persona();
		Persona p2 = new Persona("Edu");
		Persona p3 = new Persona("Pepe", "Garcia", "Gran Via 14");
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());

	}

}
