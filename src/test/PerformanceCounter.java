package test;

public class PerformanceCounter {
	
	private long timing;
	
	public void start()
	{
		timing = System.nanoTime();
	}
	
	// ms
	public int end()
	{
		long current = System.nanoTime();
		return (int) ((current - timing) / 1000000);
	}
}
