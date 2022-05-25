package Assignment2;

public abstract class PriorityQueue<T> implements Comparable <T> {

	minHeap<T> test = new minHeap<T>();
	public <T> PriorityQueue() {
	}

	public void insert(T input) {
		test.insert(input);
	}
	
	public void delete() {
		test.delete();
	}
	
	public void sort() {
		test.sort();
	}
	
	public void print() {
		test.print();
	}
	
	public boolean isEmpty() {
		return (test.isEmpty());
	}

	}
	

	

