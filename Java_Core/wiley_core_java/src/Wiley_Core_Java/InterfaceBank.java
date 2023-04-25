package Wiley_Core_Java;

interface Bank{
	void account();
}

interface Bank1{
	void account();
}
interface ATM extends Bank,Bank1{	
	void insertCard();
	void selectOption();
	void enterPassword();
}
interface AA{
	void main();
}

class NewATM implements ATM,AA{

	@Override
	public void account() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void main() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertCard() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void selectOption() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterPassword() {
		// TODO Auto-generated method stub
		
	}
	
}
public class InterfaceBank extends NewATM{
	@Override
	public void insertCard() {
		// TODO Auto-generated method stub
		System.out.println("Insert Card");
	}

	@Override
	public void selectOption() {
		// TODO Auto-generated method stub
		System.out.println("Select option");
	}

	@Override
	public void enterPassword() {
		// TODO Auto-generated method stub
		System.out.println("Enter Passowrd");
	}

}
