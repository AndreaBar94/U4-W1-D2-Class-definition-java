import java.util.Arrays;

public class ECommerce {

	public static void main(String[] args) {
		Cliente andrea = new Cliente(12534, "Andrea", "Barocchi", "andreabarocchi@gmail.com", "22/22/22");
		Articolo pc = new Articolo(2456, "MacBook Pro", 1999.99, 7);
		Articolo telefono = new Articolo(23457, "iPhone", 999.00, 8);
		Object[] carrelloAndrea = {pc.description, telefono.description};
		double[] prices = {pc.price, telefono.price};
		Carrello cart = new Carrello("Andrea", carrelloAndrea, prices) ;
		
		System.out.println(andrea.toString());
		System.out.println(cart.toString());
	}
	
	
}
