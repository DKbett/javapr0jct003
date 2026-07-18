import java.util.Scanner;
public class Temp{
       public static void main(String[] args){
	   
	   double speed;
	   double newSpeed;
	   int choice ;
	   
	   Scanner scanner = new Scanner(System.in);
	   System.out.println("What is the units of your speed:");
	   System.out.print("1.MPS\n"+"2.KPH:  \n");
	   choice = scanner.nextInt();
	   
	   System.out.println("Input the speed");
	   speed = scanner.nextDouble();
	   newSpeed = (choice==1)? speed*0.2778:speed*3.6;
       if(choice==1){
        System.out.println("Your new Speed is "+newSpeed+"km/h");
       }else if(choice==2){
        System.out.println("Your new Speed is "+newSpeed+"m/s");
       }else{
        System.out.println("Invaid input");
       }
	   
	   
	    scanner.close();
	   }
    }