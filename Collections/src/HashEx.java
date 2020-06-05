import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class HashEx {
	public static void RunHashMapExamples()
	{
		// collection
		ArrayList<Integer> ages = new ArrayList<Integer>();
		ages.add(5);
		
		// hashing and hash maps
		HashMap<String, Integer> ids = new HashMap<String, Integer>();
		ids.put("Alex P", 5);
		ids.put("Lia T", 2);
		
		// prints 2
		System.out.println(ids.get("Lia T"));
		
		// prints 0
		ids.put("Alex P", ids.getOrDefault("Alex P", 0) + 1);
		System.out.println(ids.get("Alex P"));
		
		// ids.keySet() for string keys, other variants => ids.entrySet(); ids.values();
		Set<String> keys = ids.keySet();		
		for (String key : keys) {
			System.out.println(key);
			System.out.println(ids.get(key));
		}
	}
	
	public static void RunHashCodeExamples()
	{
		String s = "Hello";
		String t = "Hello";
		System.out.println(s.equals(t));
		// String inherits from Object class and the Object class has the hashCode method
		// certain classes overwrite the default hashCode() , like String class to use a custom implementation
		System.out.println(s.hashCode());
		// by creating custom classes - we will have to overwrite the hashCode() method to do something special ~
		// both equals method and hashcode methods use the same address, good thing String overwrote it to check the content
		// but we must also overwrite these 2 methods so they won't consider checking the same address for our custom objects
		System.out.println(t.hashCode());
		
		Object a = "Hello";
		Object b = "bye";
		Object c = "bye";
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(c.hashCode());
	}
}
