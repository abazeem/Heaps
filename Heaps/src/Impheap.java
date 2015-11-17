
public class Impheap {

	public static void main(String args[])
	{
		Minheap heap = new Minheap(3);
		heap.insert(20);
		heap.insert(10);
		heap.insert(30);
		int min = heap.extractmin();
		System.out.println(min);
	}
}
