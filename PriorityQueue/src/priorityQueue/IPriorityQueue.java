package priorityQueue;

public interface IPriorityQueue<T> {
	/**
	 * Inserts element into the priority queue
	 * @param t Element to be inserted
	 */
	public void add(T t);
	
	/**
	 * Removes an element from the priority queue
	 * @param t Element to be removed
	 */
	public void delete(T t);
	
	/**
	 * Returns the first element of the priority queue without modifying the queue
	 * @return	first element in the priority queue
	 */
	public T peek();
	
	/**
	 * Removes and returns the first element of the priority queue
	 * @return	first element in the priority queue
	 */
	public T extract();
	
	/**
	 * Sorts the priority queue
	 */
	public void sort();
	
	/**
	 * Returns the number of elements in the priority queue
	 * @return 	number of elements in the queue
	 */
	public int size();
	
	/**
	 * Returns true if the priority queue is empty
	 * @return	true if the queue is empty
	 */
	public boolean isEmpty();

}
