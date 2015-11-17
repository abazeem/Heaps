public class Minheap {
	int[] arr;
	int heapsize;
	int capacity;
	
	public Minheap(int c)
	{
		arr = new int[c];
		capacity = c;
		heapsize = 0;
	}
	
	public int getmin()
	{
		return arr[0];
	}
	
	public int parent(int i)
	{	
		return((i-1)/2);
	}
	
	public int left(int i)
	{	
		return(2*i + 1);
	}
	
	public int right(int i)
	{	
		return(2*i + 2);
	}
	
	public void insert(int val)
	{
		if(heapsize == capacity)
		{
			System.out.println("Heap full");
			return;
		}
		heapsize++;
		int i = heapsize -1;
		arr[i] = val;
		while(i!=0 && arr[parent(i)]>arr[i])
		{
			int temp = arr[parent(i)];
			arr[parent(i)]=arr[i];
			arr[i]= temp;
			i = parent(i);
		}
	}
	
	public int extractmin()
	{
	int min = arr[0];
	int x =	arr[heapsize-1];
	heapsize--;
	arr[0] = x;
	minheapify(0);
	return min;
	}
	
	public void minheapify(int i)
	{
		int l = left(i);
		int r = right(i);
		int smallest = i;
		if(l<heapsize && arr[l]<arr[i])
				smallest = l;
		if(r<heapsize && arr[r]<arr[smallest])
			smallest = r;
		if(smallest!=i)
		{
			int temp = arr[smallest];
			arr[smallest]=arr[i];
			arr[i]= temp;
			minheapify(smallest);
		}
	}
	
	public void decreasevalue(int i, int val)
	{
		arr[i] = val;
		while(i!=0 && arr[parent(i)]>arr[i])
		{
			int temp = arr[parent(i)];
			arr[parent(i)]=arr[i];
			arr[i]= temp;
			i = parent(i);
		}
	}
}
