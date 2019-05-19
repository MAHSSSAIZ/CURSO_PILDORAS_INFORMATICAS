package src;

public class Persona_cp {
	String nombre;
	String apellido;
	String direccion;

	public Persona_cp() {
		this.nombre = "No informado";
		this.apellido = "No informado";
		this.direccion = "No informado";
	}

	public Persona_cp(String nombre) {
		this();
		this.nombre = nombre;
	}

	public Persona_cp(String nombre, String apellido, String direccion) {
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
		Persona_cp p1 = new Persona_cp();
		Persona_cp p2 = new Persona_cp("Edu");
		Persona_cp p3 = new Persona_cp("Pepe", "Garcia", "Gran Via 14");
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());

	}

}
