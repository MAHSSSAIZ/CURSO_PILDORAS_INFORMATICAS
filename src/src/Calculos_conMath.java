package src;

public class Calculos_conMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double raiz = Math.sqrt(82541.52);
		System.out.println("raiz cuadrada de 270 " + raiz);
		raiz = Math.round(raiz);
		System.out.println("raiz cuadrada de 270 redondeada " + raiz);
		double numeroPI = Math.PI;
		System.out.println("numero PI " + numeroPI);
		int pi_entero = (int)Math.PI;
		System.out.println("numero PI refundado: " + pi_entero);
		
		System.out.println("numero PI redondeado: " + Math.round(numeroPI));
		System.out.println("numero aleatorio: " + Math.round((Math.random()) * 10000000) );
		
		double base = 5;
		double potencia =3;
		int resultado_potencia;
		resultado_potencia = (int)Math.pow(base, potencia);
		char resultado_char = (char)Math.pow(base, potencia);
		System.out.println("potencia: " + resultado_potencia);
		System.out.println("potencia char: " + resultado_char);
		
	}
	
	

}
