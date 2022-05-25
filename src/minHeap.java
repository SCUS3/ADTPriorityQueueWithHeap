package Assignment2;

import java.util.*;

//TO-DO: Make heapify ArrayList +figure out how comparator and using arraylist instead of an array  

public class minHeap<T> {

	// A generic ADT Heap should contain the following operations. When designing a
	// method, you should consider all
	// possible exceptions.
	// • insert: inserts an item into a heap.
	// • delete: retrieves and removes the item from the root of a heap.
	// • heapify: rebuild a heap to maintain the heap properties.
	// • isEmpty: determines if a heap is empty.
	// • sort: sorts the items in a heap using the heapsort algorithm.
	// • more

	ArrayList<T> pile = new ArrayList<T>();
	Comparator <T> compare;
	
	public minHeap() {
		compare = (Comparator<T>) Comparator.naturalOrder();
	}
	
	
	public void insert(T element) {
		pile.add(element);
		// heapify();
	}

	public void delete() {
		pile.remove(0);
		// heapify();
	}


	
	void heapify(int i, int n) {
		int smallest = -1; // Initialize and set largest to root
		int leftChild = 2 * i + 1; // left = 2*i + 1
		int rightChild = 2 * i + 2; // right = 2*i + 2

		// If left child is larger than root
		if (leftChild < n && compare.compare(pile.get(leftChild), pile.get(smallest)) > 0) {
			smallest = leftChild;
		}
		// If right child is larger than largest so far
		if (rightChild < n && compare.compare(pile.get(rightChild), pile.get(smallest)) > 0) {
			smallest = rightChild;
		}
		// If largest is not root
		if (smallest != i) {
			swap(i, smallest);
			// Recursively heapify the affected sub-tree
			heapify(n, smallest);
		}			
	}
	/**
	 * 
	 * @params pos1 and pos2(compared position)
	*/
	private void swap(int pos1, int pos2) {

        T temp = pile.get(pos1);
        pile.set(pos1, pile.get(pos2));
        pile.set(pos2, temp);
    }

	public boolean isEmpty() {
		if (pile.size() == 0) {
			return true;
		}
		return false;
	}

	public void sort() {
		int n = pile.size();

		// Build heap (rearrange array)
		for (int i = n / 2 - 1; i >= 0; i--)
			heapify(i, n);

		// One by one extract an element from heap
		for (int i = n - 1; i > 0; i--) {
			swap(i, n);

			// call min heapify on the reduced heap
			heapify(i, n);
		}
	}

	// prints array representation of Heap
	public void print() {
		for (int i = 0; i < pile.size(); i++)
			System.out.print(pile.get(i) + " ");

		System.out.println();
	}

}
