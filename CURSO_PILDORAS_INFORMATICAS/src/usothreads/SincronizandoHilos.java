package usothreads;

public class SincronizandoHilos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HilosVarios hilo1 = new HilosVarios();
		
		HilosVarios2 hilo2= new HilosVarios2(hilo1);
		
		
		hilo2.start();
		hilo1.start();
		System.out.println("Terminada la tarea");
		
		/*HilosVarios hilo3 = new HilosVarios();
		hilo3.start();
		System.out.println("Terminada la tarea");*/
	}

}

class HilosVarios extends Thread{

	public void run() {
		
		System.out.println(" Comienzo del HilosVarios: " + getName());
		for(int i = 0 ; i< 15; i++) {
			
			System.out.println("ejecutando hilo: "   + getName()+ "  "+ i);
			
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

class HilosVarios2 extends Thread{
	private Thread hilo;
	
	public HilosVarios2(Thread hilo) {
		this.hilo = hilo;
	}
	
	
	
	public void run() {
		
		System.out.println(" Comienzo del HilosVarios2: " + getName());
		try {
			hilo.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		for(int i = 0 ; i< 15; i++) {
			
			System.out.println("ejecutando hilo2: "   + getName()+ "  "+ i);
			
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}