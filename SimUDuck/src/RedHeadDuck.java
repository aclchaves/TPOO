
public class RedHeadDuck extends Duck {
	
	public RedHeadDuck(){
		super();
		flyBehavior = new FlyWithWings();
	}

	@Override
	public void display() {
		System.out.println("Eu sou Red head Duck real");
		
	}
	

}
