package src;

public class ManipulaCadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre ="Miguel Angel Julian";
		
		int ultima_letra;
		ultima_letra = nombre.length();
		
		System.out.println("mi nombre es " + nombre);
		System.out.println("mi nombre tiene " + nombre.length() + " caracteres");
		System.out.println("mi nombre en matusculas " + nombre.toUpperCase() + " caracteres");
		System.out.println("mi nombre es " + nombre);
		System.out.println("mi primera letra de " + nombre + " es: " + nombre.charAt(0));
		System.out.println("mi ultima letra de " + nombre + " es: " + nombre.charAt(ultima_letra - 1));
		
		System.out.println("mi ultima letra de " + nombre + " es: " + nombre.charAt(ultima_letra - 1));
		
		
	}

}
