public class Kthlargestelement {
	
	public static void main (String args[])
	{
		int[] a = {2,6,3,7,4,10};
		int k = 3;
		findk(a,k);
		//findk2(a,a.length);
	}
	public static void findk(int[] a, int k)
	{
		int l = a.length;
		Minheap heap = new Minheap(k);
		for(int i = 0;i<k;i++)
			heap.insert(a[i]);
		for(int i = k; i<l; i++)
		{
			if(heap.getmin()<a[i])
			{
				int temp = heap.arr[0];
				heap.arr[0] = a[i];
				a[i]= temp;
				heap.minheapify(0);
			}
		}
		for(int i = 0;i<k;i++)
			System.out.println(heap.arr[i]);	
	}
	
	public static void findk2(int[] a ,int k)
	{
		int l = a.length;
		Maxheap heap = new Maxheap(l);
		heap.heapsize =l;
		heap.arr = a;
		heap = heapify(heap);
		while(k>0)
		{
			int x = heap.arr[0];
			heap.arr[0] = heap.arr[heap.heapsize - 1];
			heap.arr[heap.heapsize - 1] = x; 
			heap.heapsize--;
			heap.maxheapify(0);
			System.out.println(x);
			k--;
		}
		
		
	}
	public static Maxheap heapify(Maxheap heap)
	{
		int i;
		for(i = (heap.heapsize - 2)/2;i>=0;i--)
		{
			heap.maxheapify(i);
		}
		return heap;
	}
}
