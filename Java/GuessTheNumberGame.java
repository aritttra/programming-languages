import java.util.Scanner;
import java.util.Random;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        Game myGame = new Game();
        myGame.takeUserInput();
        myGame.isCorrectNumber();
    }
}
class Game{
    int noOfGuesses;
    int random;
    int ip;

    public Game(){
        Random rn=new Random();
        random= rn.nextInt(100)+1;
    }
    public void takeUserInput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Take a guess between 0 to 100:");
        ip= sc.nextInt();
        sc.close();
    }
    public void isCorrectNumber (){
        if (ip==random){
            System.out.println("Your guess is right.");
            noOfGuesses++;
            System.out.printf("You guessed the number in %d chances.",noOfGuesses);
        }
        else if (ip>random) {
            System.out.println("Your guess is greater than the number.");
            noOfGuesses++;
            takeUserInput();
            isCorrectNumber();
        }
        else if (ip<random) {
            System.out.println("Your guess is less than the number.");
            noOfGuesses++;
            takeUserInput();
            isCorrectNumber();
        }
        else {
            System.out.println("Your guess is not in range.");
            noOfGuesses++;
            takeUserInput();
            isCorrectNumber();
        }
    }
}
