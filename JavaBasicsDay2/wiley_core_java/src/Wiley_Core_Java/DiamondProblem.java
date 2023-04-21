package Wiley_Core_Java;

interface Person{
	public void getRole();
}

interface Student extends Person{
	
}

class Teacher implements Person{

	public void getRole() {
		System.out.println("Teaching");
	}
}

class ClassRoom extends Teacher implements Student{
	public void getRole() {
		System.out.println("Classroom teaching");
	}
}
public class DiamondProblem {
	public static void main(String[] args) {
		
		ClassRoom c = new ClassRoom();
		c.getRole();
		Teacher t = new Teacher();
		t.getRole();
	}
}
