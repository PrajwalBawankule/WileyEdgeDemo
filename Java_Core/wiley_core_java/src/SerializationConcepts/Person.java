package SerializationConcepts;

import java.io.Serializable;

public class Person implements Serializable{
	private static final long SerialVersionUID = 1L;
	int personID;
	String personName;
	
	public Person(int personID, String personName) {
		super();
		this.personID = personID;
		this.personName = personName;
	}

}
