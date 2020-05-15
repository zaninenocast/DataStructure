import java.util.Arrays;

class Stack {
	private int[] items = new int[5];
	private int count;
	public void push(int item) {
		if (count == items.length)
			throw new StackOverflowError();
		items[count++] = item;
    	
	}
	public int pop() {
		if (count == 0) {
			throw new IllegalStateException();
		}
		return items[--count];
	}
	public int peek() 
	{
	if (count == 0) {
		throw new IllegalStateException();
	}
	return items[count-1];
	
		
	}
	public boolean isEmpty() {
		return count == 0;
	}
	public String toString() {
		int[] content = Arrays.copyOfRange(items, 0, count);
		return Arrays.toString(content);
	}
}
public class Example7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stack = new Stack();
		stack.push(100);
		stack.push(200);
		stack.push(300);
		//stack.pop();
		System.out.println(stack);
		System.out.println("Last poped element"+stack.pop());
		System.out.println("last Element"+stack.pop());
		System.out.println(stack.peek());
        System.out.println(stack.isEmpty());	
	}

}
