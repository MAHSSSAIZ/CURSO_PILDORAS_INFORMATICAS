import java.sql.Time;
import java.util.Date;
import java.util.Random;

class HolaMundo{
	public static void main(String args[]){
		System.out.println("Hola mundo, esto es Java 2");
		System.out.println("Raiz cuadrada de 9: "+ Math.sqrt(9));
		System.out.println(new Date());
		//System.out.println(new Time(0));
		//System.getProperties().list(System.out);
		System.out.println(System.getProperty("user.name"));
		
//		for (int i = 0; i < 128; i++) {
//			
//			if (Character.isLowerCase(i))
//				System.out.println("valor: "+ (int)i + " caracter: "  + i+ "  " + Character.valueOf((char) i));
//		}

		Random rand = new Random(47);
		float f[] = new float[10];
		for (int i = 0; i < f.length; i++) {
			f[i] = rand.nextFloat();
			}
		for(float x : f)
			System.out.println(x);
//		
//		if (Character.isLowerCase(i))
//			System.out.println("valor: "+ (int)i + " caracter: "  + i+ "  " + Character.valueOf((char) i));
//	}
		
		
		
	}
}