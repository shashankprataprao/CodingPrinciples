package strategyPrinciple;

public class MiddleWare {

	private MyStrategy strategy;

	public MiddleWare(MyStrategy strategy) {

		this.strategy = strategy;
	}

	public int DoCalculation(int num1, int num2) {
		return strategy.Myoperation(num1, num2);
	}

}
