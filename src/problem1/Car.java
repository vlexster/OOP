package problem1;

public abstract class Car {
	private String model;
	
	public Car(String model){
		this.setModel(model);
	}
	
	public void setModel(String modelToBeSet){
		this.model = modelToBeSet;
	}
	
	public String getModel(){
		return model;
	}
	
	@Override
	public String toString(){
		return "This car is " + this.getModel();
	}
	
}
