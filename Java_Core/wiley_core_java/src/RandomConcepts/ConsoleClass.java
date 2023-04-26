package RandomConcepts;

import java.io.Console;

public class ConsoleClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Console console = System.console();
		if(console == null) {
			System.out.println("Console is not available");
			System.exit(1);
		}
		String name = console.readLine("Enter your name :");
		char[] password = console.readPassword("Enter password :");
		
		console.printf("Hello %s\n", name);
		console.printf("Your Password is %s", new String(password));
		
	}

}
