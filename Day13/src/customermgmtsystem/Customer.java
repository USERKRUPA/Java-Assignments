package customermgmtsystem;

import java.time.LocalDate;

public class Customer {
	private int custId;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private double regAmt;
	private LocalDate dob;
	private ServicePlan plan;
	private static int idGenerator;
	static {
		idGenerator = 0;
	}
	
	public Customer(int custId, String firstName, String lastName, String email, String password,double regAmt ,LocalDate dob,
			ServicePlan plan) {
		super();
		this.custId = ++idGenerator;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.dob = dob;
		this.plan = plan;
		this.regAmt = regAmt;
		
	}
	
	public Customer(String email) {
		super();
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", password=" + password + ", dob=" + dob + ", plan=" + plan + "]";
	}
	
	
	
}
