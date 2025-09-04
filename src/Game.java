import java.util.Random;
import java.util.Scanner;

public class Game {


    public static void main(String[] args){

        System.out.println("Guess the number");
        Random r = new Random();
        int num = r.nextInt(101);
        Scanner sc = new Scanner(System.in);
        int guess = sc.nextInt();
        if (guess > num)System.out.println("Too high");
        else if (guess < num)System.out.println("Too low");
        else System.out.println("Correct, the number is" + num);


    }
}
