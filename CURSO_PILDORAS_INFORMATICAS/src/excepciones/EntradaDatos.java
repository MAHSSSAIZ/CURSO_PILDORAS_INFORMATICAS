//ejemplo de lanzar manualmente una excepcion mediante throw

package excepciones;

import java.io.EOFException;

import javax.swing.JOptionPane;

public class EntradaDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		String mail = JOptionPane.showInputDialog("intoduce el email: ");
		try {
		
		examina_email(mail);
		
		}
		catch(EOFException  e) {
			System.out.println("la longitud del email no es correcta");
			
		}
	}
	
	static void examina_email ( String mail)throws EOFException{
	
		int arroba = 0;
		boolean punto = false;
		
		
		if ( mail.length() <= 3) {
			// en primer lugar se instancia la excepcion y luego se lanza
			//ArrayIndexOutOfBoundsException mi_excepcion = new ArrayIndexOutOfBoundsException();
			//throw mi_excepcion;
			
			throw new EOFException();
			
		}else {
		
		//for(int i = 0; i < mail.length(); i++) {
		for(int i = 0; i < mail.length(); i++) {
			
			
			if (mail.charAt(i) == '@') {
				arroba ++;
			}
				
			if (mail.charAt(i) == '.') {
				punto = true;
			}
				
		}
		
		if (arroba == 1 && punto == true ) {
			System.out.println("el email es correcto");
		}
		else {
			System.out.println("el email no es correcto");
		}
	}
	}
}
