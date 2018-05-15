package strategyPrinciple;

public class Subtract implements MyStrategy{

	@Override
	public int Myoperation(int num1, int num2) {
		
		return num1-num2;
	}

}
