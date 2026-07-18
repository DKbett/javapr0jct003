import java.util.Scanner;
import java.util.Random;
 public class Game{
    public static void main(String[] args){

        int randomNum;
        int guessNum, choice;
        int trial = 1;
        boolean validChoice = true;

        
        Random random = new Random();

        randomNum = random.nextInt(1, 100);
        System.out.println("Welcome to the number guessing game:");

        System.out.println("I'm thinking of a number between 1 and 100.\n"+"You are supposed to guess the number.");

        System.out.println("Choose the difficulty level of the game:\n"+"1.EASY(10 Guessing chances)\n"+
        "2.Hard(5 Guessing chances");
        Scanner scanner = new Scanner(System.in);

        choice = scanner.nextInt();
        
        if(choice == 1){
             System.out.println("You have 10 guessing chances");
             while(trial<11 && validChoice){
                System.out.print("Input your guess: ");
                guessNum =  scanner.nextInt();

                if( guessNum < 1 || guessNum > 100){
                    System.out.println("The number should be within 1 and 100");
                }else if(randomNum < guessNum){
                     System.out.println("Incorrect! The number is less than "+guessNum);
                }else if(randomNum > guessNum){
                     System.out.println("Incorrect! The number is more than "+guessNum);
                }else if(randomNum == guessNum){
                    System.out.println("Congratulations! You guessed the correct Number which is: "+randomNum);
                     validChoice = false;
                    }
                trial++;
             }
        }else if(choice == 2){
             System.out.println("You have 5 guessing chances");

              while(trial < 6 &&  validChoice ){
                System.out.print("Input your guess: ");
                guessNum =  scanner.nextInt();
                if(guessNum < 1 || guessNum > 100){
                    System.out.println("The number should be within 1 and 100");
                }else if(randomNum < guessNum){
                     System.out.println("Incorrect! The number is less than "+guessNum);
                }else if(randomNum > guessNum){
                     System.out.println("Incorrect! The The number is more than "+guessNum);
                }else if(randomNum == guessNum){
                    System.out.println("Congratulations! You guessed the correct Number which is: "+randomNum);
                     validChoice = false;
                    }
                trial++;
             }
             
        }else{
            System.out.println("Invalid choice!");
            validChoice = false;
        }

        if(validChoice){
            System.out.println("You have lost!\n"+"The correct Number is:"+randomNum);
        }
        scanner.close();
    }
 }
