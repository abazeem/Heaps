public class Maxheap {

	int[] arr;
	int capacity;
	int heapsize;
	
	public Maxheap(int c)
	{
		capacity = c;
		heapsize = 0;
		arr = new int[c];
	}
	
	public int parent(int i)
	{
		return (i-1)/2;
	}
	public int left(int i)
	{
		return (2*i +1);
	}
	public int right(int i)
	{
		return (2*i +2);
	}
	
	public void maxheapify(int i)
	{
		int l = left(i);
		int r = right(i);
		int max = i;
		if(l<heapsize && arr[l]>arr[i])
			max = l;
		if(r<heapsize && arr[r]>arr[max])
			max = r;
		if(max!= i)
		{
			int temp = arr[max];
			arr[max] = arr[i];
			arr[i] = temp;
			maxheapify(max);
		}
	}
}