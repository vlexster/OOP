package Pair_Problem3;

public final class Pair {
	private Object first;
	private Object second;
	// It wasn't specified what type these parameters should be, but since all primitives are children of the Object overlord superclass, shouldn't be an issue to just define them as objects and assign whatever type of primitive you want to, you rascals ;D

	public Pair(Object one, Object two){
		this.first = one;
		this.second = two;
	}
	
	public Object getFirst(){
		return this.first;
	}
	
	public Object getSecond(){
		return this.second;
	}
	
	@Override
	public String toString(){
		return "( " + this.first.toString() + ", " + this.second.toString() + " );";
	}
	
	public boolean equals(Pair toCompare){
		if (this.first.equals(toCompare.getFirst()) && this.second.equals(toCompare.getSecond())) return true;
		else return false;
	}


}
