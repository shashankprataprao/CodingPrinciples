package strategyPrinciple;

public class Multiply implements MyStrategy {

	@Override
	public int Myoperation(int num1, int num2) {
		
		return num1 * num2;
	}

}
