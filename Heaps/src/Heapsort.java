public class Heapsort {
	public static void main(String args[])
	{
		int[] a = {2,5,3,1,4};
		a = heapsort(a);
		disp(a);
	}
	
	public static Maxheap heapify(Maxheap heap)
	{
		int length = heap.heapsize;
		for(int i = (length-2)/2; i>=0; i--)
		{
			heap.maxheapify(i);
		}
	return heap;
	}
	
	public static int[] heapsort(int[] a)
	{
		Maxheap heap = new Maxheap(a.length);
		heap.arr = a;
		heap.heapsize = a.length;
		heap = heapify(heap);
		while(heap.heapsize >=1)
		{
			int temp = heap.arr[0];
			heap.arr[0] = heap.arr[heap.heapsize - 1];
			heap.arr[heap.heapsize - 1] = temp;
			heap.heapsize--;
			heap.maxheapify(0);
		}
		a = heap.arr;
		return a;
	}
	
	public static void disp(int[] a)
	{
		for(int i = 0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}
