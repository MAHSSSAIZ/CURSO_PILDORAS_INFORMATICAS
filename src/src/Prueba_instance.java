package src;

import java.math.BigInteger;
import java.awt.*;

import sun.security.jca.GetInstance.Instance;

public class Prueba_instance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = new String("esto es una clase de texto");
		int i = new Integer(1);
		
		
		if (s instanceof String) {
			System.out.println("la clase es texto");
		}
		else if(s instanceof Integer) {
			System.out.println("la clase no es texto");
		}
		
	}

}
