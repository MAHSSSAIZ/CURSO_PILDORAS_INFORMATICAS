package src;
import javax.swing.*;
public class PesoIdela {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String genero = " ";
		
		do {
			genero = JOptionPane.showInputDialog("Intoduce tu genero(H/M)");
		//} while (genero.equalsIgnoreCase("H")== false && genero.equalsIgnoreCase("M")== false);
		
	    } while (genero.equalsIgnoreCase("H")!= true && genero.equalsIgnoreCase("M")!= true);
	
		int  altura= Integer.parseInt(JOptionPane.showInputDialog("introduce tu altura en centimetros:"));
		int pesoideal = 0;
		if (genero.equalsIgnoreCase("H")){
			pesoideal = altura - 110;
		}
		else if(genero.equalsIgnoreCase("M")) {
			pesoideal = altura - 120;
		}
		
		System.out.println("Tu peso ideal es :"+ pesoideal + " kilos." );
		
	} 

}
