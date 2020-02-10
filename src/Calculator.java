
public class Calculator {
	//instance variables
	private int[] memory;
	
	//methods
	public int addTwoInts(int x, int y) {
		int result = 0;
		
		this.memory[0] = x;
		this.memory[1] = y;
		
		for (int i = 0; i <= 2; i++) {
			result += this.memory[i];
		}
		
		return result;
	}

}
