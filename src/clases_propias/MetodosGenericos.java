package clases_propias;
import java.util.*;
public class MetodosGenericos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombres[] = {"Pepe", "Maria", "Maria", "Azucena"};
		System.out.println("Elemento menor : " + MisMatrices.getMenor(nombres));

		GregorianCalendar fechas[] = {
				new GregorianCalendar(2018,10,31),
				new GregorianCalendar(2018,07,31),
				new GregorianCalendar(2018,05,31),
		};
		
		//System.out.println("Fecha menor : " + MisMatrices.getMenor(fechas));

		GregorianCalendar fechaMenor = MisMatrices.getMenor(fechas);
		System.out.println(fechaMenor.toString());
		
		
		/*Empleado listaEmpleados[] = 
			{new Empleado("jorge", 45, 35000),
			 new Empleado("jorg2", 45, 35000),
			 new Empleado("jorg3", 45, 35000),
			 new Empleado("jorg4", 45, 35000)};

		
		System.out.println(MisMatrices.getMenor(listaEmpleados));*/

		
		
		/*String elementos = MisMatrices.getElementos(nombres);
		System.out.println("Longitud de los elementos :" + elementos);*/
	
		/*Empleado listaEmpleados[] = 
			{new Empleado("jorge", 45, 35000),
			 new Empleado("jorg2", 45, 35000),
			 new Empleado("jorg3", 45, 35000),
			 new Empleado("jorg4", 45, 35000)};

		
		System.out.println(MisMatrices.getElementos(listaEmpleados));*/
		
	}

}


class MisMatrices {
	/*public static <T> String getElementos(T[]a) {
		
		return "El array tiene: " + a.length + " elementos.";
	}*/
	
public static <T extends Comparable> T getMenor(T[]a) {
		
		if (a==null || a.length == 0) {
			return null;
		}
		T elementoMenor = a[0];
		for(int i = 1; i <a.length; i ++ ) {
			if (elementoMenor.compareTo(a[i]) > 0) {
				elementoMenor = a[i];
			}
		}
		
		return elementoMenor;
		
		
		
	
		//return "El array tiene: " + a.length + " elementos.";
	}
	
}