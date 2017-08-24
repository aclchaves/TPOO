
public class MallardDuck extends Duck{

	public MallardDuck(){
		super();
		flyBehavior = new FlyWithWings();
	}
	
	public void display(){
		System.out.println("Eu sou um Mallard ");
	}
}
