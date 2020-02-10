
public class Counter {
	//instance variables
	private int result = 0;
	
	//methods
	public int getResult() {
		return this.result;
	}
	
	public void count() {
		for (int i = 0; i < 100; i++) {
			result += i + 1;
		}
	}

}
