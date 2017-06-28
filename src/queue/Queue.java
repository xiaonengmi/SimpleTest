package queue;

public class Queue {
	private int[] data;
	private int head;
	private int tail;
	private int size;
	
	public Queue(int n)
	{
		size = n;
		data = new int[size];
		head = 0;
		tail = 0;
	}
	
	public boolean isEmpty()
	{
		return head == tail;
	}
	
	public void push(int i)
	{
		if (tail == size)
		{
			System.err.print("\nqueue out of boundary!!\n");
			size *= 2;
			int[] tmp = data;
			data = new int[size];
			
			System.arraycopy(tmp, head, data, 0, tail - head);
			tail = tail - head;
			head = 0;
		}
		
		data[tail++] = i;
	}
	
	public int pop()
	{
		return data[head++];
	}
}
