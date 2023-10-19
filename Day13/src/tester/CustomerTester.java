package tester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import static customermgmtsystem.ValidationRules.*;
import customermgmtsystem.Customer;

public class CustomerTester {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			boolean exit = false;
			HashMap<String, Customer> customerList = new HashMap<>();
			//List<Customer> customerList = new ArrayList<>();
			while(!exit) {
				System.out.println("Customer Options:\n1. Sign up\n2. Sign in (login)\n3. Change Password\n4. Unsubscribe\n"
						+ "5. Display all\n6. Pay subscription \n7. customers who have not paid subscription(Last 3 months:)\n"
						+ "8. Remove customers whose subscription is pending(6 months) \n9. Sort by email \n10. Sort by DoB n reg amount\n0. Exit");
				System.out.println("Choose an option");
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Enter Customer Details: firstName, lastName, email, password, regAmount, dob, plan");
						Customer customer = validateAllRules(sc.next(), sc.next(), sc.next(), sc.next(), sc.nextDouble(), sc.next(), sc.next(),customerList);
						
						break;
					case 2:
						
						break;
					case 3:

						break;
					case 4:
						
						break;
					case 5:
						for(Customer cust : customerList.values())
							System.out.println(cust);
						break;
					case 0:
						exit = true;
						break;
					}
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
					sc.nextLine();
				}
			}
		}//sc.close()

	}
}
