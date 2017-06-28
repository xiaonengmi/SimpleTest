package sort;

public class BubbleSort implements ISort {

	@Override
	public String getName() {
		return "BubbleSort";
	}

	@Override
	public void sort(float[] data) {
		int n = data.length;
		for (int j = n - 1; j > 0; j--) 
		{
			for (int i = 0; i < j; i++) 
			{
				if (data[i] > data[i + 1])
				{
					float t = data[i];
					data[i] = data[i + 1];
					data[i + 1] = t;
				}
			}
		}
	}


}
