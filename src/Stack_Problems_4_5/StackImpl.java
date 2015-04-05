package Stack_Problems_4_5;

public class StackImpl implements Stack{

	private Object[] st;
	
	public StackImpl(Object... arg){
		st = new Object[arg.length];
		for (Object el : arg){
			push(el);
		}
	}
	
	public void push(Object obj){
		Object[] dummy = new Object[st.length+1];
		for (int i = 0; i<st.length; i++){
			dummy[i] = st[i];
		}
		dummy[st.length] = obj;
		st = dummy;
	}
	
	public int search(Object obj){
		int index = -1;
		for (int i=0; i<st.length; i++){
			if (st[i].equals(obj)) index = i; 
		}
		return index;
	}
	
	public void peek(Object obj){
		Object[] dummy = new Object[st.length];
		dummy = st;
		st = null;
		st[0] = st[search(obj)];
		for (int i=0; i<dummy.length; i++){
			if (i!=search(obj)) push(dummy[i]);  
		}
	}
	
	public Object pop(){
		Object result = st[0];
		Object[] dummy = new Object[st.length-1];
		for (int i=0; i< dummy.length; i++){
			dummy[i] = st[i+1];
		}
		st = dummy;
		return result;
	}
	
	public Object pop(Object obj){ //adding an additional method to pop a random element
		if (search(obj)!=-1){
			peek(obj);
			return pop();
		}
		else return null;
	}
	
	public boolean isEmpty(){
		if (st.length == 0) return true; 
		else return false;
	}
	
	public int length(){
		return st.length;
	}
	
	public String toString(){
		String result = "( ";
		for (int i = 0; i< st.length; i++) {
			result += st[i].toString();
			if (i<st.length-1) result +=", ";
		}
		result += ");";
		return result;
	}
	
}
