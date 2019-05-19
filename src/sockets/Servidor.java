package sockets;



import javax.swing.*;

import java.awt.*;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoServidor mimarco=new MarcoServidor();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
	}	
}

class MarcoServidor extends JFrame implements Runnable{
	
	public MarcoServidor(){
		
		setBounds(1200,300,280,350);				
			
		JPanel milamina= new JPanel();
		
		milamina.setLayout(new BorderLayout());
		
		areatexto=new JTextArea();
		
		milamina.add(areatexto,BorderLayout.CENTER);
		
		add(milamina);
		
		setVisible(true);
		
		Thread hilo1 = new Thread(this);
		hilo1.start();
		
		}
	
	private	JTextArea areatexto;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//System.out.println("Estoy a al escucha");
		
		
		try {
			
			ServerSocket miServerSocket = new ServerSocket(9999);
			String nick, ip, mensaje;
			PaqueteEnvio envio_recibido = new PaqueteEnvio();
			
			while(true) {
			Socket miSocket = miServerSocket.accept();
			ObjectInputStream objeto_entrada = new ObjectInputStream(miSocket.getInputStream());
			envio_recibido = (PaqueteEnvio) objeto_entrada.readObject();
			nick = envio_recibido.getNick();
			ip = envio_recibido.getIp();
			mensaje = envio_recibido.getMensaje();
			
			areatexto.append("\n" + "nick: " + nick);
			areatexto.append("\n" + "ip: " + ip);
			//areatexto.append("\n" + "mensaje: " + mensaje);
			areatexto.append("\n" + mensaje);
			
			Socket enviaDestinatarioSocket = new Socket(ip, 9999);
			ObjectOutputStream paquete_reenvio = new ObjectOutputStream(enviaDestinatarioSocket.getOutputStream());
			paquete_reenvio.writeObject(envio_recibido);
			enviaDestinatarioSocket.close();
			miServerSocket.close();
			
			//DataInputStream flujo_entrada = new DataInputStream(miSocket.getInputStream());
			//String mensaje_texto = flujo_entrada.readUTF();
			//areatexto.append("\n" + mensaje_texto);
			//flujo_entrada.close();
			
			
			}
			
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Se ha producido el error en el servidor : " + e.getMessage()) ;
		}
		
		
		
	}
}
