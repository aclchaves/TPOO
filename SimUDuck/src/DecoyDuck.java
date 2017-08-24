
public class DecoyDuck extends Duck{
	
	public DecoyDuck() {
		flyBehavior = new FlyNoWay();
	}

	@Override
	public void display() {
		System.out.println("Eu sou um pato de madeira");
		
	}

}
