
public class CallList {
	long number;
	double duration;
	
	public CallList(long number, double duration) {
		this.number = number;
		this.duration = duration;
	}
	
	public long callNumber() {
		return this.number;
	}
	public double callDuration() {
		return this.duration;
	}
	
}	
