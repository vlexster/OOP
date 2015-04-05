package Stack_Problems_4_5;


public class StackImplWODupl extends StackImpl{
	
	@Override
	public void push(Object obj){
		if (search(obj) != -1) System.out.println("Duplication of the parameter \""+obj.toString() +"\" detected - no duplication allowed!");
		else super.push(obj);
	}
}
