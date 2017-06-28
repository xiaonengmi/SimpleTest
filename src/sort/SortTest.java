package sort;

import java.util.Random;
import java.util.logging.Logger;

import test.PerformanceCounter;

public class SortTest {
	private final int sampleCount = 100000;
	private final int range = 1000;
	private PerformanceCounter mCounter = new PerformanceCounter();
	private final boolean printOutArray = false;
	
	public void run()
	{
		Random random = new Random();
		
		float[] data = new float[sampleCount];
		for (int i = 0; i < data.length; i++) {
			data[i] = (random.nextFloat() * range);
		}
		if (printOutArray) {
			System.out.print("src array: \n");
			printArray(data);
		}
		
		float[] tmp = new float[sampleCount];
		System.arraycopy(data, 0, tmp, 0, sampleCount);
		ISort s = new BubbleSort();
		mCounter.start();
		s.sort(tmp);
		long ms = mCounter.end();
		if (printOutArray) {
			System.out.print("\n" + s.getName() + " result: \n");
			printArray(tmp);
		}
		System.out.print("\n" + s.getName() + " running time = " + ms + " ms\n");
		checkSort(tmp);
		
		System.arraycopy(data, 0, tmp, 0, sampleCount);
		s = new QuickSort();
		mCounter.start();
		s.sort(tmp);
		ms = mCounter.end();
		if (printOutArray) {
			System.out.print("\n" + s.getName() + " result: \n");
			printArray(tmp);
		}
		System.out.print("\n" + s.getName() + " running time = " + ms + " ms\n");
		checkSort(tmp);
	}
	
	private boolean checkSort(float[] data)
	{
		for (int i = 0; i < data.length - 1; i++) {
			if (data[i] > data[i + 1]) {
				System.err.print("error found in pos " + i + ", " + "[i] = " + data[i] + ", [i+1] = " + data[i + 1] + "\n");
				return false;
			}
		}
		
		System.out.print("check passed!!!\n");
		return true;
	}
	
	private void printArray(float[] data)
	{
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + ", ");
		}
	}
}
