import java.util.Arrays;

public class Carrello {
	String corrUser;
	Object[] cart;
	double[] total;
	
	public Carrello(String corrUser, Object[] cart, double[] total) {
		this.corrUser = corrUser;
		this.cart = cart;
		this.total = total;
	}
@Override	
	public String toString() {
		return "Carrello: " + Arrays.toString(cart) + ", totale: " + Arrays.toString(total);
	}


}
