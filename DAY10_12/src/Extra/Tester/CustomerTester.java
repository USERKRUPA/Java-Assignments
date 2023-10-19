package Tester;

import java.time.LocalDate;
import java.util.Scanner;

import customermgmtsystem.ServicePlan;

public class CustomerTester {
	public static void main(String[] args) {
		boolean flag = false;
		try (Scanner sc = new Scanner(System.in)) {
			while (!flag) {
				System.out.println(
						"Enter your choice : \n 1.Sign up\n 2.Sign In\n 3. Change Password\n 4. Unsubscribe Customer\n 5.Display all\n 0.Exit");
				switch (sc.nextInt()) {
				case 1:
					System.out.println("Enter firstName,  lastName, email, password, dob, plan");
					validateAllRules ( sc.next(), sc.next(),sc.next(),sc.next(),sc.next(),sc.next());
					
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				case 0:
					flag = true;
					break;
				}

			}
		}
	}
}
