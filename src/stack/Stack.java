package stack;

public class Stack {
	private int top = 0;
	private int[] data;
	private int size = 10;
	
	public Stack()
	{
		data = new int[size];
	}
	
	private void resize(int n)
	{
		int[] tmp = data;
		data = new int[n];
		if (top > 0)
			System.arraycopy(tmp, 0, data, 0, top);
		size = n;
	}
	
	public void push(int i)
	{
		if (top == size)
		{
			resize(2 * size);
		}
		
		data[top++] = i;
	}
	
	public int pop()
	{
		if (empty())
			throw new RuntimeException("try to pop from empty stack!!");
			
		return data[--top];
	}
	
	public boolean empty()
	{
		return top == 0;
	}
}
