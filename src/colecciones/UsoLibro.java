package colecciones;


public class UsoLibro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Libro libro1 = new Libro("PEPE", "Titulo1", 001);
		Libro libro2 = new Libro("PEPE", "Titulo12", 001);
		
		//libro1 = libro2;
		if (libro1.equals(libro2)) {
			System.out.println("SON IGUALES");
			System.out.println("Hashcode libro1: " + libro1.hashCode());
			System.out.println("Hashcode libro2: " + libro2.hashCode());
			
		}else {
			System.out.println("SON DIFERENTES");
			System.out.println("Hashcode libro1: " + libro1.hashCode());
			System.out.println("Hashcode libro2: " + libro2.hashCode());
			
		}
		//System.out.println("¿SON IGUALES?: " + libro1.equals(libro2));
		
	}

}
