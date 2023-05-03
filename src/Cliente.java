
public class Cliente {
	long userId;
	String firstName;
	String secondName;
	String email;
	String date;
	
	public Cliente(long userId, String firstName, String secondName, String email, String date) {
		this.userId = userId;
		this.firstName = firstName;
		this.secondName = secondName;
		this.email = email;
		this.date = date;
	}
	
	public String toString() {
        return "Nome Cliente: " + firstName;
    }
}
