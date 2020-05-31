import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class CollectionFramework {

	List<String> namesList;

	public static void FileScanner(String filePath) throws FileNotFoundException 
	{
		Scanner scan =  new Scanner(new File(filePath));
		var framework = new CollectionFramework();
		framework.namesList = new ArrayList<String>();
			
		while (scan.hasNextLine())
		{
			framework.namesList.add(scan.nextLine());			
		}
		
		for (int i=0; i<framework.namesList.size(); i++)
		{
			System.out.println("name: " + framework.namesList.get(i));
		}
		
		scan.close();
		
		
	}
	
	public static void CollectionExecutor()
	{
		// FIFO - takes person out the queue and puts it in the console
		LinkedList<String> queuedNames = new LinkedList<String>();
		queuedNames.add("Alex");
		queuedNames.add("Suri");
		queuedNames.add("Teo");		
		System.out.println(queuedNames.remove()); 
		System.out.println(queuedNames.remove()); 
		
		// FILO - takes person out the stack and puts it in the console
		Stack<String> stackedNames = new Stack<String>();
		stackedNames.push("Alex");
		stackedNames.push("Suri");
		stackedNames.push("Teo");		
		System.out.println(stackedNames.pop()); 
		System.out.println(stackedNames.pop()); 
	}
}
