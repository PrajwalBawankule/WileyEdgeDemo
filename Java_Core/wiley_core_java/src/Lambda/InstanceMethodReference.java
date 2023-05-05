package Lambda;

interface H1{
	public void say();
}
public class InstanceMethodReference {

	public void hello() {
		System.out.println("Hello instance method i am");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InstanceMethodReference imr = new InstanceMethodReference();
		H1 isv = imr :: hello;
		isv.say();
	}

}
