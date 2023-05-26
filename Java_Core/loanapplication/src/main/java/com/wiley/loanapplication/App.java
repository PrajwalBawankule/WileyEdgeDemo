package com.wiley.loanapplication;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
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
				System.out.println("Enter account type :\n1. Savings account\n    2.Current account\n    3.Home loan account");
				int account_type = sc.nextInt();sc.nextLine();

				System.out.println("Enter user id :");
				int user_id = sc.nextInt();sc.nextLine();
				System.out.println("Enter account number :");
				String acc_no = sc.nextLine();
				System.out.println("Enter your name : ");
				String name = sc.nextLine();
				System.out.println("Enter mobile number : ");
				String mobile = sc.nextLine();
				System.out.println("Enter your address : ");
				String address = sc.nextLine();
				System.out.println("Enter your gender : ");
				String gender = sc.nextLine();
				System.out.println("Enter your PAN Card number :");
				String pan_number = sc.nextLine();
				System.out.println("Enter your date of birth :");
				String dob = sc.nextLine();

				UserDAOImpl udi = new UserDAOImpl();
				User user = new User(user_id, acc_no, name,mobile,address,gender,pan_number,dob,account_type);
				udi.addUser(user); 
				
				System.out.println("Account created successfully");
				break;

//			case 2:
//				System.out.println("Enter account number :");
//				int acc_no = sc.nextInt();
//				sc.nextLine();
//
//				System.out.println("1.Apply for Loan\n2.Process Loan\n4.EMI Details\n5.Exit\n");
//				System.out.println("Enter your choice : ");
//				int choice = sc.nextInt();
//				sc.nextLine();
//				switch (choice) {
//				case 1:
//					System.out.println("Enter loan application date :");
//					String application_date = sc.nextLine();
//					System.out.println("Enter loan duration in months:");
//					int duration = sc.nextInt();
//					sc.nextLine();
//
//				case 2:
//
//				}
//
//				break;
//			case 3:
//				break;
//			case 4:
//				break;
//			case 5:
//				System.out.println("Exiting Application");
//				break;
			default:
				System.out.println("Enter valid choice");
			}
		}
    }
}
