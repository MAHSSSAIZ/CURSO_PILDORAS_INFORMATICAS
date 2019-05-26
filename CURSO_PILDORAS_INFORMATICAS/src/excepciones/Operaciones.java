package excepciones;

public class Operaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Suma suma = new Suma();
		Multiplica multiplica = new Multiplica();
		Divide divide = new Divide();
		Resta resta = new Resta();
		
		System.out.println("El resultado es: " + suma.calculo(1, 2));
		System.out.println("El resultado es: " + multiplica.calculo(10, 2));
		System.out.println("El resultado es: " + resta.calculo(15, 2));
		System.out.println("El resultado es: " + divide.calculo(9, 3));
		
		
		
	}

}
