package Assignment2;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class helper {
//	Create an empty priority queue and save its reference.
//	Pass the reference to create method.
//	Pass the reference to display method.
//	Sort the queue.
//	Display the queue again.
//	Delete from the queue.
//	Display the queue again
	
	public static void start() {
		
	}

//Make employee objects from the testing data in a file.
//Insert the employee objects into the queue.
	public static void create(PriorityQueue create) throws IOException {
		File file = new File("Test.txt"); //File passed for reading
		String arr[] = new String[3];
		Double payRate;
		String name;
		Scanner scan = new Scanner(file);
		while (scan.hasNextLine()) {
			String s = scan.nextLine();
			arr = s.split(" ");
			name = arr[0] + " " + arr[1];
			payRate = Double.parseDouble(arr[2]);
		}

	}

//Displays objects in the queue.
	public static void display(PriorityQueue display) {
		
	}
}