import java.util.ArrayList;

public class Generics {

	public static void main(String[] args) {
		// generics restrict the data types we work with
		// ArrayList<Integer> ages = new ArrayList<Integer>();
		// ages.add("string");   not working
		//ages.add(5);
		// before the restrictions, we could just add a bunch of data types together
		//ArrayList messages = new ArrayList();
		//messages.add("string");
		//messages.add(5);
		// let's say we expected people to only put integers here
		//System.out.println((String)messages.get(1));

		Item<Person> item = new Item<Person>();
		Person p = new Person("hello", "mate");
		item.setX(p);
		Person p2 = item.getX();
		
	}

}
