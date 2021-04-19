package heap;

/** 
 * Interface used to implement a Heap of type T
 * 
 * @author William Kelly
 * @param <T>	Type of objects held in the Heap
 */

public interface IHeap<T> {
	
	/**
	 * Inserts an element into the heap
	 * @param 	t - Element to be inserted into the heap
	 */
	public void insert(T t);
	/**
	 * Deletes an element from the heap
	 * @param 	t - Element to be deleted from the heap
	 * @return 	The object that was deleted
	 */
	public T delete(T t);
	
	/**
	 * Gets the first object on the heap without modifying the heap
	 * @return	First object on the heap
	 */
	public T peek();
	
	/**
	 * Returns true if the heap is empty
	 * @return true if the heap has no elements
	 */
	public boolean isEmpty();
	
	/**
	 * Returns the number of elements in the heap
	 * @return number of elements
	 */
	public int getSize();
	
	/**
	 * Function that corrects a single violation of the heap property in a subtree's root, this function has the time complexity of O(lg n)
	 * @param index The index that heapify starts
	 * @param size  The size of the heap
	 */
	public void heapify(int index, int size);
	
	/**
	 *	Produces a heap from an unordered array, then traverses through the heap using heapify to correct violations of the heap property
	 *	This function has the time complexity of O(nlg n)
	 */
	public void heapSort();
	
	

}
