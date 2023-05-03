
public class Sim {

	public static void main(String[] args) {
		CallList list = new CallList(0, 0);
		SimClass sim = new SimClass(2345655);
		stampaDati(sim, list);
		
	}

	public static void stampaDati(SimClass sim, CallList list) {
		System.out.println("Numero: " + sim.number);
		System.out.println("Credito: " + sim.credit + " euro");
		System.out.println("Elenco delle ultime 5 chiamate:");
        System.out.println(list.callNumber());
	}
}
