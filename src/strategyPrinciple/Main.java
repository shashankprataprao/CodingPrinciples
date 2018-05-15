package strategyPrinciple;

public class Main {

	public static void main(String[] args) {
		MiddleWare m = new MiddleWare(new Add());
		System.out.println(" sum :"+m.DoCalculation(10, 20));
		
		
		
		MiddleWare n = new MiddleWare(new Subtract());
		System.out.println("subtract :"+n.DoCalculation(10,20));
		
		MiddleWare o = new MiddleWare(new Multiply());
		System.out.println("multiply :"+o.DoCalculation(10, 20));

	}

}
