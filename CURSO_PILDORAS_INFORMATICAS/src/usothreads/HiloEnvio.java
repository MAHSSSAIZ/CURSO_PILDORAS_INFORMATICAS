//https://www.arquitecturajava.com/java-wait-notify-y-threads/


package usothreads;

public class HiloEnvio extends Thread {

	private Bolsa bolsa;

	public HiloEnvio(Bolsa bolsa) {
		super();
		this.bolsa = bolsa;
	}

	@Override
	public void run() {

		if (bolsa.estaLlena() != true) {

			try {
				synchronized (bolsa) {
					bolsa.wait();
				}

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println("Enviando la bolsa con " + bolsa.getSize() + "elementos");
		}

	}

	public Bolsa getBolsa() {
		return bolsa;
	}

	public void setBolsa(Bolsa bolsa) {
		this.bolsa = bolsa;
	}

}