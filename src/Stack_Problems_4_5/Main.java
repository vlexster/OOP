package Stack_Problems_4_5;

public class Main {

	public static void main(String[] args) {
		StackImpl stack = new StackImpl();
		stack.push("string");
		stack.push("string2");
		System.out.println(stack.length());
		stack.pop();
		stack.push(3f);
		System.out.println(stack.toString());
		
		StackImplWODupl stack2 = new StackImplWODupl();
		stack2.push("string1");
		stack2.push("string2");
		stack2.push("string1"); // test to see the exception being thrown
		System.out.println(stack2.length());
		System.out.println(stack2.toString());
		

	}

}
