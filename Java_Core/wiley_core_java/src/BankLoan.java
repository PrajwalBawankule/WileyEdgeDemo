import java.util.*;

public class BankLoan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("--------BANKING LOAN APPLICATION---------");
		System.out.println();
		while (true) {
			System.out.println("1.Create Account \n2. Login\n3.Exit");
			System.out.println("-----------------------------------------");
			int ch = sc.nextInt();
			sc.nextLine();

			switch (ch) {
			case 1:
				System.out.println(
						"Enter account type :\n    Savings account\n    Current account\n    Home loan account");
				String account_type = sc.nextLine();

				System.out.println("Enter your name : ");
				String name = sc.nextLine();
				System.out.println("Enter mobile number : ");
				String mobile_no = sc.nextLine();
				System.out.println("Enter your address : ");
				String address = sc.nextLine();
				System.out.println("Enter your gender : ");
				String gender = sc.nextLine();
				System.out.println("Enter your PAN Card number :");
				String pan_number = sc.nextLine();
				System.out.println("Enter your date of birth :");
				String dob = sc.nextLine();

				System.out.println("Account created successfully");
				break;

			case 2:
				System.out.println("Enter account number :");
				int acc_no = sc.nextInt();
				sc.nextLine();

				System.out.println("1.Apply for Loan\n2.Process Loan\n4.EMI Details\n5.Exit\n");
				System.out.println("Enter your choice : ");
				int choice = sc.nextInt();
				sc.nextLine();
				switch (choice) {
				case 1:
					System.out.println("Enter loan application date :");
					String application_date = sc.nextLine();
					System.out.println("Enter loan duration in months:");
					int duration = sc.nextInt();
					sc.nextLine();

				case 2:

				}

				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				System.out.println("Exiting Application");
				break;
			default:
				System.out.println("Enter valid choice");
			}
		}
	}

}
