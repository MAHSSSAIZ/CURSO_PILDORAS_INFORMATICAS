package src;

public class Uso_Arrays_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] matrizaleatorios = new int [1500];

		for( int i = 0; i < matrizaleatorios.length; i++) {
			
			matrizaleatorios[i] = (int)Math.round(Math.random()*1000);
			
		}
		
		for(int numeros: matrizaleatorios) {
			System.out.println(numeros + " ");
		}
		
	}

}
