
public class Sim {

	public static void main(String[] args) {
		SimClass sim = new SimClass(2345644, 0.2);
		stampaDati(sim);

	}
	public static void stampaDati(SimClass sim) {
		System.out.println("Numero: " + sim.number);
		System.out.println("Credito: " + sim.credit);
	}
}
