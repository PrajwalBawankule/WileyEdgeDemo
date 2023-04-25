package Wiley_Core_Java;

class Employee{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}

class EmployeeImp{
	public void show(Employee emp) {
		System.out.println("Calling show Method");
		System.out.println("Name: "+emp.getName()+" Age: "+emp.getAge());
	}
}
public class EmployeeEncapsulation {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setName("Prajwal");
		emp.setAge(15);
		EmployeeImp eimp = new EmployeeImp();
		eimp.show(emp);
		System.out.println("Name: "+emp.getName()+" Age: "+emp.getAge());
	}
}
