package src;

public class Arrays_Bidimensionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] matrix =  {
			{10,15,225,336,45},
			{70,75,325,376,55},
			{80,85,425,386,65},
			{90,95,525,396,75}
			};

		for(int fila[]: matrix) {
			System.out.println(" " );
			
			for( int z: fila) {
				System.out.print( z + " ");
			}
			
			
		}
			
			
		/*for(int i = 0; i<4; i++) {
			System.out.println(" " );
			for(int j = 0; j<5; j++) {
				System.out.print( matrix[i][j] + " ");
			
				
			//	System.out.print("Valor de la posiscion: " + i + " " + j + "  " + "es:  " + matrix[i][j]);
			}
		}*/
		
		
	}

}
