import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class CollectionFramework {

	List<String> namesList;

	public static void FileScanner(String filePath) throws FileNotFoundException {
		Scanner scan = new Scanner(new File(filePath));
		var framework = new CollectionFramework();
		framework.namesList = new ArrayList<String>();

		while (scan.hasNextLine()) {
			framework.namesList.add(scan.nextLine());
		}

		for (int i = 0; i < framework.namesList.size(); i++) {
			System.out.println("name: " + framework.namesList.get(i));
		}

		scan.close();

	}

	public static void CollectionExecutor() {
		// FIFO - takes person out the queue and puts it in the console
		Queue<String> queuedNames = new LinkedList<String>();
		LinkedList<String> queuedNamesGeneric = new LinkedList<String>();
		queuedNamesGeneric.add("Alex");
		queuedNamesGeneric.add("Suri");
		queuedNamesGeneric.add("Teo");
		System.out.println(queuedNamesGeneric.remove());
		System.out.println(queuedNamesGeneric.removeLast());

		// FILO - takes person out the stack and puts it in the console
		Stack<String> stackedNames = new Stack<String>();
		LinkedList<String> stackedNamesGeneric = new LinkedList<String>();
		stackedNamesGeneric.push("Alex");
		stackedNamesGeneric.push("Suri");
		stackedNamesGeneric.push("Teo");
		System.out.println(stackedNamesGeneric.removeFirst());
		System.out.println(stackedNamesGeneric.pop());
		System.out.println(stackedNamesGeneric.removeFirst());
	}

	public static void IteratorExercise() {
		LinkedList<String> names = new LinkedList<String>();
		names.push("faye");
		names.push("grumpy");
		names.push("elton");
		// as long as there's something to iterate through => print em
		Iterator<String> it = names.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// add wherever in the list and show the stack count
		names.add(2, "Liam");
		// for each loop
		for (String s : names) {
			System.out.println(s);
		}
	}

	public static void ListIteratorExercise() {
		LinkedList<String> names = new LinkedList<String>();
		names.push("faye");
		names.push("grumpy");
		names.push("elton");

		// ListIterator => add element based on where we are in the sequence
		var it = names.listIterator();
		it.next(); // elton
		it.next(); // grumpy
		it.add("susan"); // make susan as 2nd, grumpy will be 3rd

		// for each loop
		for (String s : names) {
			System.out.println(s);
		}
	}
}
