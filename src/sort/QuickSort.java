package sort;

public class QuickSort implements ISort{

	@Override
	public String getName() {
		return "QuickSort";
	}

	@Override
	public void sort(float[] data) {
		sortImpl(data, 0, data.length - 1);
	}
	
	private void sortImpl(float[] data, int left, int right)
	{
		if (left >= right)
			return;
		
		int i = left;
		int j = right;
		
		float key = data[left];
		while (i < j) 
		{
			while (i < j && key <= data[j])
				j--;
			
			while (i < j && data[i] <= key)
				i++;
			
			if (i < j)
			{
				float t = data[i];
				data[i] = data[j];
				data[j] = t;
			}
		}
		
		if (i != left)
		{
			float t = data[left];
			data[left] = data[i];
			data[i] = t;
		}
		sortImpl(data, left, i - 1);
		sortImpl(data, i + 1, right);
	}

}
