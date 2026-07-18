import java.util.Scanner;
public class Main{
     
    public static void main(String[] args){
	
	String Name = "DKBett";
	char Grade = 'B';
	int age = 19;
	boolean isStudent = true;
	double weight = 65.937393;
	
	System.out.printf("My name is %s\n", Name);
	System.out.printf("My Calculus grade is %c\n", Grade);
	System.out.printf("My age is %d\n", age);
	System.out.printf("My weight is %.2f kg\n", weight);
	System.out.printf("Student status: %b\n", isStudent);

    String email, domain, userName;
    Scanner scanner = new Scanner(System.in);
    System.out.print("Input your official email: ");

    email = scanner.nextLine();
    userName = email.substring(0,email.indexOf("@"));
    domain = email.substring(email.indexOf("@")+1);
    System.out.println("Your official userName is: "+userName);
    System.out.println("domain: "+domain);


   scanner.close();
    }
}