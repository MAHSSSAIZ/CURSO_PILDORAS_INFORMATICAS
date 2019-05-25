package serializacion;
import java.util.*;
import java.io.*;


public class Serializando {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Administrador jefe  = new Administrador("Juan", 45000, 2018, 12, 31);
		jefe.setIncentivo(3500);
		
		Empleado[] personal = new Empleado [3];
		personal[0] = jefe;
		personal[1] = new Empleado("Pepito", 15000, 2008, 12, 31);
		personal[2] = new Empleado("Jaime", 25000, 2008, 12, 31);
		
		try {
			//Crear coriente de datos externo
			ObjectOutputStream escribiendo_fichero = new ObjectOutputStream (new FileOutputStream("C:/MAHS/Empleado.txt"));
			//escribir el objeto
			escribiendo_fichero.writeObject(personal);
			escribiendo_fichero.close();
			
			for(Empleado e: personal) {
				
				System.out.println("personal_serializado " + e.toString());
			}
			
			
			//Crear corriente de datos externo
			ObjectInputStream leyendo_fichero = new ObjectInputStream (new FileInputStream("C:/MAHS/Empleado.txt"));
			Empleado[] personal_recuperado = (Empleado[]) leyendo_fichero.readObject();
			leyendo_fichero.close();
			
			for(Empleado e: personal_recuperado) {
				
				System.out.println("Personal_recuperado " + e);
			}
			
			
		}catch(Exception e){
			
		}
		
		
	}

	
}

class Empleado implements Serializable {
	private String nombre = null;
	private double sueldo;
	private Date fechaContrato;
	
	public Empleado(String n, double s, int agno, int mes, int dia) {
		nombre = n;
		sueldo = s;
		GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);
		fechaContrato = calendario.getTime();
	}
	
	
	public String getnombre() {
		return nombre;
	}
	
	public double getsueldo() {
		return sueldo;
	}
	
	public Date getFechacontrato() {
		return fechaContrato;
	}
	
	public void subirSueldo(double porcentaje) {
		double aumento = sueldo * porcentaje/100;
	}
	
	public String toString() {
		
		return "El nombre Nombre: " + nombre + "y el sueldo: " + sueldo + "fechaContrato: "+ fechaContrato;
		
		
	}
	
}






 class Administrador extends Empleado{

	private double incentivo;
	 
	Administrador(String nombre, int sueldo, int agno, int mes, int dia) {
		super(nombre, sueldo, agno, mes, dia);
		
	}
	
	public double getSueldo() {
		double sueldoBase = super.getsueldo();
		return sueldoBase + incentivo; 
	}
	
	public void setIncentivo(double incentivo) {
		this.incentivo = incentivo;
	}
	
	public String toString() {
		return super.toString() + "Incentivo " + incentivo;
	}
}
