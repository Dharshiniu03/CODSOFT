import java.util.*;

public class NumberGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int number = rand.nextInt(100) + 1;
        int guess;

        System.out.println("Guess a number between 1 and 100");

        while(true){
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();

            if(guess == number){
                System.out.println("Correct Guess!");
                break;
            }
            else if(guess > number){
                System.out.println("Too High!");
            }
            else{
                System.out.println("Too Low!");
            }
        }
    }
}
