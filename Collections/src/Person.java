import java.util.Objects;

public class Person {
	String email;
	String lastName;
	Position position;
	
	Person (String email, String lastName) {
		this.email = email;
		this.lastName = lastName;
	}

	@Override
	public int hashCode() {
		/* final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		return result; */
		
		// the above works by default, but this works too:
		return Objects.hash(email, lastName, position);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Person other = (Person) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		
		if (position == null) {
			if (other.position != null)
				return false;
		} else if (!position.equals(other.position))
			return false;
		
		return true;
	}
	
	
}
