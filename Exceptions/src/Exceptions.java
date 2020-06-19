import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Exceptions {

	public static void main(String[] args)  {
		// number format exception when parsing wrong input
		// int number = Integer.parseInt("pizza");
		
		// index outta bounds ~
		// ArrayList<Integer> x = new ArrayList();
		// x.get(5);
		
		// compilation errors => main() needs to throw the exception, its passed up the chain only
		doSomething();
		
		// works no problem => problem dealt already
		doSomethingElse();
	}
	
	static void doSomething() throws FileNotFoundException {
		// file not found exception - is special, we either deal with it 
		// or pass it to someone else to deal with it (throw declaration above / surround with try catch)
		FileInputStream f = new FileInputStream("");
	}
	
	static void doSomethingElse() {
		try {
			FileInputStream f = new FileInputStream("");
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
