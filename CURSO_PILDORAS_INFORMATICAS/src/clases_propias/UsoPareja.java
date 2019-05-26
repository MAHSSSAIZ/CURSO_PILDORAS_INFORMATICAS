package clases_propias;

public class UsoPareja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Pareja <Persona> juan = new Pareja <Persona>();
		Pareja <String> una = new Pareja <String>();
		una.setPrimero("nuevo valor de tipo String");
		System.out.println(una.getPrimero());
		
		Persona persona1 = new Persona("Ana");
		Pareja <Persona> persona2 = new Pareja<Persona>();
		persona2.setPrimero(persona1);
		System.out.println(persona2.getPrimero().toString());
		
	}

}


class Persona{
	private String nombre;
	public Persona(String nombre) {
		this.nombre = nombre;
		
	}
	
	public String toString() {
		return nombre;
	}
	
}
