package src;
import java.util.*;


public class Adivina_numero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println(Math.random()*100);
		
		

		int aleatorio = (int)(Math.random()*100);
		
		
		Scanner entrada = new Scanner(System.in);
		int numero = 0;
		int intentos = 0;
		do {
			
			System.out.println("introduce un numero");
			numero = entrada.nextInt();
			
			if (aleatorio < numero) {
				System.out.println("El numero aleatorio es menor que el introducido");
				
			}
			else if(aleatorio > numero){
				System.out.println("El numero aleatorio es mayor que el introducido");
				
			}
			++ intentos ;
			
		}while (numero != aleatorio);
		
		System.out.println("correcto");
		System.out.println("intentos "+  intentos);
		
		
		
	}

}
