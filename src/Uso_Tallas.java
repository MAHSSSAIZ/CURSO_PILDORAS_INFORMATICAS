import java.util.*;
public class Uso_Tallas {

	///Enumerador no puede estar dentro del metodo main
	
	//enum Talla {MINI, MEIDANO, GRANDE, MUY_GRANDE};
		
	enum Talla{
		MINI("S"), MEDIANO("M"), GRANDE("L"), MUY_GRANDE("XL");
	 	
		private Talla(String abreviatura) {
			this.abreviatura = abreviatura;
		}
		private String abreviatura;
		
		public String dameabreviatura(){
			return abreviatura;
		}
	}
	
	public static void main(String[] args) {
		
		//enum Tamaño{PEQUEÑA,MEDIANO,GRANDE};
		
		
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe una talla:MIMI, MEDIANO, GRANDE, MUY_GRANDE");
		String entradaDatos = entrada.next().toUpperCase();
		
		Talla la_talla = Enum.valueOf(Talla.class, entradaDatos);
		
		System.out.println("Talla va ser: " + la_talla);
		System.out.println("abreviatura = " + la_talla.dameabreviatura());
		
		
		
	}

}
