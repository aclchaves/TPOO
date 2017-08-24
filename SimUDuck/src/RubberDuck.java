
public class RubberDuck extends Duck {
	
	public RubberDuck() {
		flyBehavior = new FlyNoWay();
	}

	@Override
	public void display() {
		System.out.println("Eu sou um pato de borracha");
		
	}

}
