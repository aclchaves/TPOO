public abstract class Duck {
	
	FlyBehavior flyBehavior;
	
	public Duck(){};
	
	public abstract void display();
	
	public void perfomFly(){
		flyBehavior.fly();
	}
	
	public void swim(){
	 System.out.println("Todos os patos boiam, até os de madeiras");
	};
	

}
