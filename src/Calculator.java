import java.util.Scanner;
public class Calculator{
          public static void main(String[] args){
          double num1, num2;
          double Ans = 0.0;
          char op;
          boolean validOperation = true;
          Scanner scanner = new Scanner(System.in);
          System.out.print("Input the first Number:");
          num1 = scanner.nextDouble();

          System.out.print("Input the operator: '+', '-', '*', '/' or '^'");
          op = scanner.next().charAt(0);

          System.out.print("Input the second Number:");
          num2 = scanner.nextDouble();

          switch(op){
            case '+' -> Ans = num1 + num2;
            case '-' -> Ans = num1 - num2;
            case '*' -> Ans = num1 * num2;
            case '/' ->{
                if(num2 == 0){
                    System.out.println("Cannot divide");
                    validOperation = false;
                    
                }
                else{
                    Ans = num1/num2;
                }
            }
            case '^' -> Ans = Math.pow(num1, num2);
            default -> {
                System.out.println("Invalid operator");
                validOperation = false;
            }
          }

         if(validOperation){
            System.out.println("Answer = "+Ans);
         }

          scanner.close();



          }




}