package problem1;

public class Audi extends Car{
	private float milage;
	
	public float getMilage(){
		return milage;
	}
	
	public Audi(String model, float mil){
		super(model);
		this.milage = mil;
	}
	
	@Override
	public String toString(){
		return super.toString() + ", currently @" + this.milage + " miles!";
	}
}
