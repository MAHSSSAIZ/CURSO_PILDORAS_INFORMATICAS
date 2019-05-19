package src;

import javax.swing.JOptionPane;

public class CompuebaMail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arroba = 0;
		boolean punto = false;
		
		String mail = JOptionPane.showInputDialog("intoduce el email: ");
		
		//System.out.println(mail.length());
		
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
