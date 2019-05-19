package sockets;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.*;


public class Cliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoCliente mimarco=new MarcoCliente();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}


class MarcoCliente extends JFrame{
	
	public MarcoCliente(){
		
		setBounds(600,300,280,350);
				
		LaminaMarcoCliente milamina=new LaminaMarcoCliente();
		
		add(milamina);
		
		setVisible(true);
		}	
	
}

class LaminaMarcoCliente extends JPanel implements Runnable{
	
	public LaminaMarcoCliente(){
		
		camponick = new JTextField(5);
		add(camponick);
		
		JLabel texto=new JLabel("CHAT");
		add(texto);
	
		campoip = new JTextField(8);
		add(campoip);
		
		campochat = new JTextArea(12,20);
		campochat.setEditable(false);
		add(campochat);
		
		campotexto=new JTextField(20);
		add(campotexto);		
	
		miboton=new JButton("Enviar");
		
		EnviaTexto miEvento = new EnviaTexto();
		miboton.addActionListener(miEvento);
		add(miboton);	
		Thread mihilo = new Thread();
		mihilo.start();
		
	}
	
	private class EnviaTexto implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
		
			//System.out.println(campotexto.getText());
			campochat.append("\n" + campotexto.getText());
			try {
				// HACE EL ENVIO DE LOS DATOS TECLEADOS AL SERVIDOR
				
				Socket misocket = new Socket("192.168.1.41", 9999);
				PaqueteEnvio envio = new PaqueteEnvio();
				
				envio.setMensaje(campotexto.getText());
				//System.out.println("Texto introducido:" + campotexto.getText());
				envio.setIp(campoip.getText());
				envio.setNick(camponick.getText());
				ObjectOutputStream paquete_datos = new ObjectOutputStream(misocket.getOutputStream());
				paquete_datos.writeObject(envio);
				misocket.close();
				
				/*DataOutputStream flujo_salida = new DataOutputStream(misocket.getOutputStream());
				
				flujo_salida.writeUTF(campotexto.getText());
				
				flujo_salida.close();*/
				
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println("Se ha producido el error en el cliente : " + e.getMessage()) ;
			}
			
		}
		
	}
	private JTextField campotexto;
	private JButton miboton;
	private	JTextArea campochat;
	private	JTextField camponick;
	private	JTextField campoip;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		try {
			// ESPERA EL ENVIO DE LOS DATOS TECLEADOS EN EL OTRO EXTREMO
			
			ServerSocket miServerSocket = new ServerSocket(9999);
			Socket cliente;
			PaqueteEnvio paqueteRecibido;
			while(true) {
				cliente = miServerSocket.accept();
				ObjectInputStream flujoEntrada = new ObjectInputStream(cliente.getInputStream());
				paqueteRecibido = (PaqueteEnvio) flujoEntrada.readObject();
				campochat.append("\n" + paqueteRecibido.getNick() + ":" + paqueteRecibido.getMensaje() );
			}
			
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

class PaqueteEnvio implements Serializable{
	private String nick, ip, mensaje;
	public PaqueteEnvio() {
		}
	
	public PaqueteEnvio(String nick, String ip, String mensaje) {
		super();
		this.nick = nick;
		this.ip = ip;
		this.mensaje = mensaje;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	} 
	
}