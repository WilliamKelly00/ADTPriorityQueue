package heap;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * This class is a min-heap data structure implemented using an ArrayList of type T
 * 
 * @author William Kelly
 * @param <T> The type of objects contained in the heap
 */
public class Heap<T> implements IHeap<T>{
	
	
	/**
	 * ArrayList of type T to hold the elements in the heap
	 */
	private ArrayList<T> heap = new ArrayList<T>();
	
	
	/**
	 * Comparator used to sort the heap
	 */
	private Comparator<T> comparator;

	/**
	 * Constructor used to make an empty heap with the comparator of type T
	 * 
	 * @param comparator  Comparator used to sort the heap
	 */
	public Heap(Comparator<T> comparator){
		this.comparator = comparator;

	}

	/**
	 * Constructor used to make a heap with the elements contained in the array T, and the comparator of type T
	 * 
	 * @param objects	  ArrayList of objects to be added to the heap on initialization
	 * @param comparator  Comparator used to sort the heap
	 */
	public Heap(ArrayList<T> objects, Comparator<T> comparator){
		this.comparator = comparator;

		for (T object : objects) {
			insertUnsorted(object);
		}


	}


	/**
	 * Inserts elements into the heap without sorting 
	 * @param t	Element to be added to the end of the heap
	 */
	public void insertUnsorted(T t) {
		heap.add(t);
	}
	
	public void insert(T t) {
		heap.add(t);
		
			int parentIndex = 0;
			int currentIndex = heap.size() - 1;
			if(currentIndex > 0) {
				parentIndex = getParentIndex(currentIndex);	
			}
			
			while((currentIndex > 0) && comparator.compare(heap.get(currentIndex), heap.get(parentIndex)) < 0) {
				swap(currentIndex, parentIndex);
				currentIndex = parentIndex;
				parentIndex = getParentIndex(currentIndex);
			}	
	}
	
	

	@Override
	public boolean isEmpty() {
		return heap.isEmpty();
	}

	/**
	 * Returns the index of the parent node, of the node at index
	 * 
	 * @param 	index	index of the node to find the parent index of
	 * @return	index of the parent node
	 */
	public int getParentIndex(int index) {
		return (index - 1)/2 ;
	}

	/**
	 * Returns the index of the left child node, of the node at index
	 * 
	 * @param 	index	index of the node to find the left child index of
	 * @return	index of the left child node
	 */
	public int getLChildIndex(int index) {
		return (index * 2)+ 1 ;
	}
	/**
	 * Returns the index of the right child node, of the node at index
	 * 
	 * @param 	index	index of the node to find the right child index of
	 * @return	index of the right child node
	 */
	public int getRChildIndex(int index) {
		return (index * 2) + 2 ;
	}


	/**
	 * Swaps the elements at index1 and index2
	 * 
	 * @param index1 index of the first element to be swapped
	 * @param index2 index of the second element to be swapped
	 */
	public void swap(int index1, int index2) {
		T temp;

		temp = heap.get(index1);
		heap.set(index1, heap.get(index2));
		heap.set(index2, temp);
	}


	/**
	 * Returns the size of the heap
	 * @return Heap size
	 */
	public int getSize() {
		return heap.size();
	}

	@Override
	public void heapify(int index, int size) {

		int smallest = index;
		int lc = getLChildIndex(index);
		int rc = getRChildIndex(index);

		if((lc < size) && (comparator.compare(heap.get(lc), heap.get(smallest)) > 0)) {
			smallest = lc;
		}
		if((rc < size) && (comparator.compare(heap.get(rc), heap.get(smallest)) > 0)) {
			smallest = rc;
		}

		if(smallest != index) {
			swap(index, smallest);
			heapify(smallest, size);
		}	
	}


	/**
	 * Function used to build a heap from an unordered array
	 * Time complexity is O(n)
	 */
	public void buildHeap() {
		int n = heap.size();

		for(int i = n-1; i>0; i--) {
			heapify(i,n);
		}

	}


	@Override
	public void heapSort() {

		buildHeap();

		for(int i = heap.size()-1; i>0; i--) {
			swap(0,i);
			heapify(0,i);
		}


	}

	@Override
	public T delete(T t) {
		int index = heap.indexOf(t);

		if(heap.isEmpty()) throw new IllegalArgumentException("Deleting from an empty heap");

		swap(index, heap.size()-1);		
		heap.remove(heap.size()-1);


		for(int i = heap.size()-1; i>0; i--) {
			swap(0,i);
			heapify(i,0);
		}

		return t;
	}

	@Override
	public T peek() {
		return heap.get(0);
	}

	/**
	 * Returns a String representation of the heapkk
	 * @return String representation of the heap
	 */
	public String getString() {
		return heap.toString();

	}

}
