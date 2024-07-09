package clientView;
import java.util.*;
import atmModal.modalView;
import serviceView.atmService;

public class Main {

	public static void main(String[] args) {
		String user_name = "admin";
		String password = "admin@123";
		
		atmService service = new atmService();
		int choice=0;
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Welcome to the Section...");
			System.out.println("Please Enter the Credentials to process...");
			System.out.println("Enter username : ");
			String username = sc.nextLine();
			System.out.println("Enter your password");
			String pass = sc.nextLine();
			if(username.equals(user_name)&&(pass.equals(password)))
			{
				choice = sc.nextInt();
				System.out.println("Enter the Student roll.no : ");
				int accountNo = sc.nextInt();
				modalView result = service.accountDetails(accountNo);
				if(result != null)
				{
					System.out.println("Student Name : "+result.getAccountDetails());
					System.out.println("Student Age : "+result.getAccountHolderName());
					System.out.println("Student Gender : "+result.getBalance());
				}
				else
				{
					System.out.println("There is no data based on the roll number");
				}
			}
			sc.close();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
