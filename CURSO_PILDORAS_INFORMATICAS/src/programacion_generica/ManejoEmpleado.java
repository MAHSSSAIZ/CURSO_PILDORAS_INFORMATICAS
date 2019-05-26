package programacion_generica;
import java.util.*;

public class ManejoEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Empleado listaEmpleados[] = new Empleado[3];
		listaEmpleados[0] = new Empleado("Juan", 53, 2500);
		listaEmpleados[1] = new Empleado("Pedro", 25, 2510);
		listaEmpleados[2] = new Empleado("Daniel", 33, 2570);*/
		
		ArrayList <Empleado> listaEmpleados = new ArrayList<Empleado>();
		
		listaEmpleados.add(new Empleado("Juan", 53, 2500));
		listaEmpleados.add(new Empleado("Pedro", 25, 2510));
		listaEmpleados.add(new Empleado("Daniel", 33, 2570));
		//listaEmpleados.add("pape");
		
		
		System.out.println("Tamaño del ArrayList: " + listaEmpleados.size());
		
		System.out.println("¿está vacio? " + listaEmpleados.isEmpty());
		
		
		/*for(Empleado e: listaEmpleados) {
			
			System.out.println(e.dameDatos());
			
		}*/

		Iterator <Empleado> iterador = listaEmpleados.iterator();
		
		while(iterador.hasNext()) {
			System.out.println("Iterator");
			System.out.println("Siguiente elemento " +iterador.next().dameDatos());
		}
		
		/*listaEmpleados.clear();
		
		System.out.println("¿está vacio? " + listaEmpleados.isEmpty());
		
		for(int i = 0; i < 15; i++) {
			
			listaEmpleados.add(new Empleado("Empleado"+i , 18+i, 2500*(i+1)));
			
		}

		System.out.println("Tamaño del ArrayList después del bucle: " + listaEmpleados.size());
		
		System.out.println("¿está vacio? " + listaEmpleados.isEmpty());
		for(Empleado e: listaEmpleados) {
			
			System.out.println(e.dameDatos());
			
		}
		
		System.out.println("¿quien está en posicion 5? " + listaEmpleados.get(5).dameDatos());
		listaEmpleados.set(5, new Empleado("Suplantador", 77, 2570));

		for(Empleado e: listaEmpleados) {
			
			System.out.println(e.dameDatos());
			
		}
		
		Empleado nuevaLista[] = new Empleado[listaEmpleados.size()];
		listaEmpleados.toArray(nuevaLista);
		
		for(Empleado e: nuevaLista) {
			
			System.out.println(e.dameDatos());
			
	}*/
		
		
		
		
	}
}


	



///////////// FINAL CLASE ManejoEmpleado   


class Empleado{
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
	
