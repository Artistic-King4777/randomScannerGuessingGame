package randomScannerGuessingGame;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class ScannerGame {
    public static void main(String[] args) throws InputMismatchException {

        Random random = new Random();
        int numGuess = random.nextInt(11); //holds the integer that player hs to guess
        int numTries = 0; // variable for holding number of guesses /starts at 0 for each new play
        Scanner input = new Scanner(System.in); //for player to input a number
        int guess; //holds wat the player inserts for their guess
        boolean win = false;
        String yourName = "";
//        String yesNo = "";


        try {
            System.out.println("Hey there ready to play a game a fun guessing game!? XD" + "\n" + "GREAT!! Please enter your name below!");
            yourName = input.nextLine();

            System.out.println("Okay " + yourName + "!" + "\n" + "Guess a number between 1 annnnnd 10!: "); //first question

            while (win == false) {
                guess = input.nextInt();
                numTries++;

                if (guess == numGuess) {
                    win = true;
                    System.out.println(yourName + " your right!! You win!");
                    // System.out.println("The correct number was " + numGuess);
                    System.out.println("It took you " + numTries + " tries. Great Job " + yourName + "!!");

                } else if (guess < numGuess) {
                    System.out.println("Oh no " + yourName + "! Your guess is too low! Try Again ;D");

                } else if (guess > numGuess) {
                    System.out.println("Whoops " + yourName + "! Your guess is too high! Try Again ;D");
                }
            }
        }catch (InputMismatchException e) {
            System.out.println("Sorry " + yourName + ". That is not a valid submission." + "\n" + "Please press play and start again!");
        }

    }






















    // TODO - Changes I wanna make in the future:
    /**
     * First ask "Hey there ready to play a game!? 8D"
     * If yes say "Great first, what is your name" prompt for name then: "Great 'yN'! Pick a numba between 1 annnd ....lets say 10!" prompt for your guess
     IF NOOO "Sorry come back again when your ready!"
     * Make the user choose the Numbers to guess between
     * If guess wrong say "Wrong Number \n Goodbye \n *something comes up behind you and all u see is a shadow b4 everything goes black* \n YOU DIED\nTRY AGAIN!
     * If guess right "YAY GREAT JOB yN \n YOU WIN!! *confetti cannon everywhere * \n It took yN this many times to win: insert numTries"
     *
     * MAKE IT GUESS THE BIJUU  ---  ICHIBI - JUUBI!
     * ICHIBI NIBI SANBI YONBI GOBI ROKUBI NANABI HACHIBI KYUUBI JUUBI
     *    1     2    3     4    5     6       7      8      9     10
     */
}
