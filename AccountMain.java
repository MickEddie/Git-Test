//Creating and manipulating an Account object.


import java.util.Scanner;

public class AccountMain {

	private String name; // instance variable

	// method to set the name in the object
	public void setName(String name) {
	this.name = name; // store the name
	}

	// method to retrieve the name from the object
	public String getName() {
	return name; // return value of name to caller
	}
	public static void main(String[] args) {
		// create a Scanner object to obtain input 
		Scanner input = new Scanner(System.in);

		// create  an Account object and assign it to myAccount
		AccountMain myAccount = new AccountMain();

		//display initial value of name (null)
		System.out.printf("Initial name is %s%n%n", myAccount.getName());

		//prompt for and read name		
		System.out.println("Please enter the name");
		String theName = input.nextLine();
		myAccount.setName(theName);
		System.out.println();

		//display the name stored in object myAccount
		System.out.printf("Name in object myAccount is: %n%s%n", myAccount.getName());
	}
}