package Stack_Problems_4_5;

public interface Stack {

	public void push(Object obj);
	
	public int search(Object obj);
	
	public void peek(Object obj);
	
	public Object pop();
	
	public Object pop(Object obj);
	
	public boolean isEmpty();
	
	public int length();
}
