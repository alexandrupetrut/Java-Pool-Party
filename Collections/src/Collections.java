import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Collections {

	public static void main(String[] args) {
		// HashEx.RunHashCodeExamples();
		// HashEx.RunHashMapExamples();
		
		/*
		Person p = new Person("email@email.com", "Alex");
		// hoping each account / person would have an unique email
		Person q = new Person("other@email.com", "Ben");
		Person r = new Person("email@email.com", "Alex");
		
		// is p and q the same ?
		System.out.println(p.equals(q));  // false
		System.out.println(p.equals(r));  // false UNLESS we overwrite equals
		
		Position pos1 = new Position(10,10);
		p.position = pos1;
		
		Position pos2 = new Position(10,10);
		r.position = pos2;
		
		System.out.println(p.hashCode()); 
		System.out.println(p.hashCode()); 
		System.out.println(p.equals(r)); 
		*/
		
		/* */
		String hello = "hello";
		String bye = "bye";
		// hash set is not ordered => the for will print meow, hello, bye (random order)
		// use array list , tree set or whatever else for sorting
		HashSet<String> words = new HashSet<String>();	
		words.add(hello);  words.add(bye);  words.add("meow");
		for (String s : words) {
			System.out.println(s);
		}
		
		/* */
		Person newPerson = new Person("real@email.com", "Alex");
		Position newPos = new Position(10,10);
		newPerson.position = newPos;
		// hash maps allow for duplicate data / values, but unique keys
		HashMap<String, Person> peeps = new HashMap<String, Person>();
		peeps.put("real@email.com", newPerson);
		System.out.println("Hashmap: " + peeps.containsKey("real@email.com"));
	}
}
