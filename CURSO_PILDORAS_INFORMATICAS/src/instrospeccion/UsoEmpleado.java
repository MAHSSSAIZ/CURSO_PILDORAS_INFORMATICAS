package instrospeccion;

public class UsoEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Persona antonio = new Persona("Antonio");
		System.out.println("El nombre es: " + antonio.getNombre());
		Empleado ana = new Empleado("Ana", 3500);
		System.out.println("El nombre es: " + ana.getNombre()+ ". El salario es: "+ ana.getSalario());
		System.out.println("Nombre de la clase: " + antonio.getClass().getName());*/
		
		/*Class cl2 = antonio.getClass();
		System.out.println("Nombre de la clase cl2 : " + cl2.getName());*/
		
		String nombreClase = "instrospeccion.UsoEmpleado";
		Class cl1;
		try {
			cl1 = Class.forName(nombreClase);
			System.out.println("(ForName)Nombre de la clase: " + cl1.getName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		nombreClase = "instrospeccion.Empleado";
		
		try {
			cl1 = Class.forName(nombreClase);
			System.out.println("(ForName)Nombre de la clase: " + cl1.getName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}


class Persona {
	private String nombre;
	public Persona(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
}


class Empleado extends Persona{
	private double salario;
	public Empleado(String nombre, double salario) {
		super(nombre);
		this.salario = salario;
	}
	
	void setIncentivo(double inc) {
		salario = salario + inc ;
	}
	
	public String getSalario() {
		return "El salario es : " + salario;
	}
	
}