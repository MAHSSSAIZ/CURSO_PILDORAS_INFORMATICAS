package poo;

import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Empleado empleado1 = new Empleado("Pepe Putez", 36500, 1968, 05, 15);
		Empleado empleado2 = new Empleado("Juan Gomierre", 95100, 1995, 01, 27);
		Empleado empleado3 = new Empleado("Juanita la Fantastica", 75000, 1973, 03, 31);
		
		
		System.out.println("el sueldo del empleado1 es:" + empleado1.dameSueldo());
		empleado1.subeSueldo(5.2);
		
		System.out.println("el nombre del empleado1 es:" + empleado1.dameNombre());
		System.out.println("el sueldo del empleado1 es:" + empleado1.dameSueldo());
		System.out.println("la fecha de alta es :" + empleado1.dameFechaContrato());
		
		
		System.out.println("el sueldo del empleado2 es:" + empleado2.dameSueldo());
		empleado2.subeSueldo(2.5);
		
		System.out.println("el nombre del empleado2 es:" + empleado2.dameNombre());
		System.out.println("el sueldo del empleado2 es:" + empleado2.dameSueldo());
		System.out.println("la fecha de alta es :" + empleado2.dameFechaContrato());
		
		
		System.out.println("el sueldo del empleado3 es:" + empleado3.dameSueldo());
		empleado3.subeSueldo(1.4);
		System.out.println("el nombre del empleado3 es:" + empleado3.dameNombre());
		System.out.println("el sueldo del empleado3 es:" + empleado3.dameSueldo());
		System.out.println("la fecha de alta es :" + empleado2.dameFechaContrato());
		*/
		
		//urilizacion de un array de objetos para guardar los ampleados
		
		Jefatura jefe_RRHH = new Jefatura("Jefe categoria", 80000, 2001, 01, 15);
		jefe_RRHH.estableceincentivo(200000);
		
		Empleado[] misEmpleados = new Empleado[6];
		misEmpleados[0] = new Empleado("Pepe Putez", 20000, 1968, 05, 15);
		misEmpleados[1] = new Empleado("Juan Gomierre", 45000, 1995, 01, 27);
		misEmpleados[2] = new Empleado("Juanita la Fantastica", 40000, 1973, 03, 31);
		misEmpleados[3] = new Empleado("Rita la Cantaora");
		misEmpleados[4] = jefe_RRHH; // POLIMORFISMO EN ACCION Se a;ade un objeto de tipo Jefatura que hereda de la clase Empleado
		misEmpleados[5] = new Jefatura("Jefa de Finanzas", 100000, 2000, 10, 05); 
		
		Jefatura jefa_Finanzas = (Jefatura) misEmpleados[5]; ///casting para convertir el objeto empleado situado en misEmpleados[5] a tipo de objeto Jefatua 
		jefa_Finanzas.estableceincentivo(500);
		System.out.println("El jefe : " + jefa_Finanzas.dameNombre() + " tiene un bonus de "+ jefa_Finanzas.establece_bonus(500));
		System.out.println("El empleado : "+ misEmpleados[3].dameNombre() + " tiene un bonus de " + misEmpleados[3].establece_bonus(500));
		
		/*for(int i = 0 ; i < 3; i++) {
			misEmpleados[i].subeSueldo(5.2);
		}*/
		
		Empleado director_comercial = new Jefatura("Sandra", 75000, 2005, 10, 15); 
		Comparable ejemplo = new Empleado("Benito camela", 43000, 2007, 03, 31);
		
		//// UTILIZACION DE instanceOF
		
		/*if(director_comercial instanceof Empleado) {
			System.out.println("director_comercial es de tipo Jefatura");
		}
		if (ejemplo instanceof Comparable) {
			System.out.println("implementa la interfaz Comparable");
		}
		
		
		for (Empleado e: misEmpleados) {
			
			e.subeSueldo(10);
		}*/
		
		
		/*for(int i = 0 ; i < 3; i++) {
			System.out.println("Nombre:" + misEmpleados[i].dameNombre() + "sueldo:"+ misEmpleados[i].dameSueldo()+ "Fecha de alta:"+ misEmpleados[i].dameFechaContrato());
			misEmpleados[i].subeSueldo(5.2);
		}*/

		Arrays.sort(misEmpleados);
		System.out.println(jefa_Finanzas.tomar_decisiones("Reducir al sueldo"));
		jefa_Finanzas.establece_bonus(500);		
		//misEmpleados[3].tomar_decisiones("faltar al tgrabajo");
		
		
		
		for (Empleado e: misEmpleados) {
			
			System.out.println("Nombre: " + e.dameNombre() + " Id: " +e.dameId() +" Sueldo: "+ e.dameSueldo()+ " Fecha de alta: "+ e.dameFechaContrato());
						
		}
		
		
		
		
		 /*for (elemento:misEmpleados) {
			misEmpleados[elemento].
			
			
		}*/
		
		
		
		//tratamiento de POLIMORFISMO
		

		
	}

}
//definicion de clase abstracta como patrón del diseño de la herencia
	abstract class People{
	public abstract   String dameDescripcion();
		
	}
	
		
	class Empleado extends People implements Comparable, Trabajadores {

		///metodos constructor

		public Empleado(String nom, double sue, int agno, int mes, int dia) {
		
			nombre = nom;
			sueldo = sue;
			GregorianCalendar calendario  = new GregorianCalendar(agno,mes - 1,dia);
			altaContrato = calendario.getTime();	
			Id = idSiguiente + 1;
			idSiguiente ++;
		}
		
		public Empleado(String nom) {
			// con este this se está llmando al constructor Empleado con los parámetros recibidos
			this(nom,30000,2001,01,01);
			
			
		}
		
		
		// atributos de la clase Empleado	
		
		private String nombre;
		private double sueldo;
		private Date altaContrato;
		private static int idSiguiente = 0;
		private int Id =0 ;
		
		///metodos getter
		
		public int dameId() {
			return Id;
		}
		
 		public String dameNombre() {
			return nombre;
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

		@Override
		public String dameDescripcion() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public int compareTo(Object miObjeto) {
			// TODO Auto-generated method stub
			
			Empleado otroEmpleado = (Empleado) miObjeto;
			if (this.sueldo <  otroEmpleado.sueldo) {
				return - 1;
			}
			if (this.sueldo > otroEmpleado.sueldo) {
				return 1;
			}
			
			return 0;
		}

		@Override
		public double establece_bonus(double gratificacion) {
			// TODO Auto-generated method stub
			return Trabajadores.bonus_base + gratificacion;
		}
		

		
	}
	
	
	////clase JEFATURA que hereda de Empleado
	///final class Jefatura extends Empleado{
		
	 final class Jefatura extends Empleado  implements Jefes{
		//atributos
		private double incentivo;
				
		public Jefatura(String nom, double sue, int agno, int mes, int dia) {
			super(nom, sue, agno, mes,dia);
		}
		
		public void estableceincentivo(double incentivo) {
			this.incentivo = incentivo;
		}
		
		public double dameSueldo() {
 			double sueldoJefe = super.dameSueldo();
			return sueldoJefe + incentivo;
		}

		@Override
		public String tomar_decisiones(String decision) {
			// TODO Auto-generated method stub
			return "Un miembro de la dirección ha tomado la siguiente decisión :" + decision;
		}

		@Override
		public double establece_bonus(double gratificacion) {
			// TODO Auto-generated method stub
			double prima = 2000;
			return Trabajadores.bonus_base + prima + gratificacion;
		}
		
		
		
	}

	 
	 
/*	class Director extends Jefatura{

		public director(String nom, double sue, int agno, int mes, int dia) {
			super(nom, sue, agno, mes, dia);
			// TODO Auto-generated constructor stub
		}
		
		
		
	}*/
	
	
	 	
