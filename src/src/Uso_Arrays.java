package src;

public class Uso_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int [] mi_matriz = new int[5];
		
		mi_matriz[0] = 25;
		mi_matriz[1] = 15;
		mi_matriz[2] = 35;
		mi_matriz[3] = 45;
		mi_matriz[4] = 55;*/
		
		int [] mi_matriz = {25, 15, 35 *2 ,45, 45,45,14,23};
		
		
		
		
		System.out.println("elementos de matriz: " + mi_matriz.length);
		
		//int longitud = mi_matriz.length;
		
		
		for(int i = 0;  i < mi_matriz.length ; i++ ){
		
			System.out.println("elemento  numero " + i + "  de la matriz:"  + mi_matriz[i]);
			
		}
		
		
		
	}

}
