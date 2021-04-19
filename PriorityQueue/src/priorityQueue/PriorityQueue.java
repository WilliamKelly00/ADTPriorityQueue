package priorityQueue;

import java.util.ArrayList;
import java.util.Comparator;

import heap.Heap;

/**
 * This class is a PriorityQueue data structure implemented using a minimum heap data structure
 * @author William Kelly
 *
 * @param <T> The type of objects held in the priority queue
 */
public class PriorityQueue<T> implements IPriorityQueue<T>{
	
	/**
	 * The heap used to hold the elements in the priority queue
	 */
	Heap<T> prioQ;
	
	
	/**
	 * Constructor used to create a heap with the Comparator comparator
	 * 
	 * @param comparator the comparator used to sort the priority queue
	 */
	public PriorityQueue(Comparator<T> comparator){
		prioQ = new Heap<T>(comparator);
	}
	
	
	
	/**
	 * Constructor used to create a priority queue consisting of the elements in objects, sorted using the Comparator comparator
	 * 
	 * @param objects		ArrayList holding the objects to be added to the priority queue
	 * @param comparator	comparator used to sort the priority queue
	 */
	public PriorityQueue(ArrayList<T> objects, Comparator<T> comparator){
		prioQ = new Heap<T>(objects, comparator);
	}

	
	
	@Override
	public void add(T t) {
		prioQ.insert(t);
	}

	@Override
	public void delete(T t) {
		prioQ.delete(t);
	}

	@Override
	public T peek() {
		return prioQ.peek();
	}

	@Override
	public T extract() {
		return prioQ.delete(prioQ.peek());
	}

	@Override
	public void sort() {
		prioQ.heapSort();
	}

	@Override
	public int size() {
		return prioQ.getSize();
	}

	@Override
	public boolean isEmpty() {
		return prioQ.isEmpty();
	}
	
	
	/**
	 * Prints the priority queue as a string
	 * @return the string representation of the priority queue
	 */
	public String getString() {
		return prioQ.getString();
	}


}
