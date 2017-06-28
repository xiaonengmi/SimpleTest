package queue;

public class QueueTest {
	
	private int initQueueSize = 100;
	private int loopTimes = 9;
	
	public void run()
	{
		Queue queue = new Queue(initQueueSize);
		for (int i = 1; i <= loopTimes; i++) {
			queue.push(i);
		}
//		System.out.print(queue.pop());
//		System.out.print(queue.pop());
//		System.out.print(queue.pop());
//		System.out.print(queue.pop());
//		for (int i = 1; i <= loopTimes; i++) {
//			queue.push(i);
//		}
		
		while (!queue.isEmpty()) 
		{
			System.out.print(queue.pop() + " ");
			queue.push(queue.pop());
		}
		System.out.print("\ntest finished!");
	}
}
