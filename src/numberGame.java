
// ~~~~~~~ IMPORTS ~~~~~~~ \\
import java.util.Scanner;

/**
 * A game in which the goal is for the user to guess a word
 * to save a ship from sinking.
 *
 * @author Foothill College, Travis R
 */

public class numberGame {
    /**
     * Stores a word for the user to guess. Then, prompts the user to enter
     * a single letter for their guess. Draws an ASCII representation of a
     * ship depending on whether the user guessed correctly.
     * @param args    not used
     */
    public static void main(String [] args) {
        // ~~~~~~~ VARIABLES ~~~~~~~ \\
        Scanner keyBoard = new Scanner(System.in);
        int guess;
        // Save a number that the user has to guess.
        int number = (int) (Math.floor(Math.random() * 10)+1);
        print(" ~~~~~~~ TESTING ~~~~~~~ \n     My number is "+number+"\n ~~~~~~~ TESTING ~~~~~~~ ");

        print("\n ******* ******* ******* ******* ");
        print(" ** Welcome to my Number Game. **\n  ******* ******* ******* *******\n  Between 1 and 10, Guess what Number I am thinking of, You get 2 tries.  \n");

        // PROMPT USER
        print("What number do you think it is?");
        guess = keyBoard.nextInt();
        print("You guessed "+guess);
        //        Guess 1:
        if(guess == number){
            print("GOOD JOB!  You got it right first try, \n    *** YOU WIN ***");
        }
        else if( guess < number){   // GUESS IS TOO LOW
            if(guess+3 > number){   //                  ... so +
                print("Your CLOSE, too Low.  \n  Try Again.");          // TRY AGAIN
                // ASK AGAIN
                print("What number do you think it is?");
                guess = keyBoard.nextInt();
                print("You guessed "+guess);
                //        Guess 2:
                if(guess == number){
                    print("GOOD JOB!  You got it right, \n    *** YOU WIN ***");
                }
                else if( guess < number){   // GUESS IS TOO LOW
                    if(guess+3 > number){   //                  ... so +
                        print("Your CLOSE, too Low.  \n  ~~~~~~~ GAME OVER ~~~~~~~ ");
                    }else {
                        print("NOPE, Your too Low.  \n  ~~~~~~~ GAME OVER ~~~~~~~ ");
                    }
                }
                else if(guess > number){    // GUESS IS TOO HIGH
                    if(guess-3 < number){   //                   ... so -
                        print("Your CLOSE, too HIGH.  \n  ~~~~~~~ GAME OVER ~~~~~~~ ");
                    }else {
                        print("NOPE, Your too HIGH.  \n  ~~~~~~~ GAME OVER ~~~~~~~ ");
                    }
                }
                // ASK AGAIN
            }else {
                print("NOPE, Your too Low.  \n  Try Again.");

            }
        }
        else if(guess > number){    // GUESS IS TOO HIGH
            if(guess-3 < number){   //                   ... so -
                print("Your CLOSE, too HIGH.  \n  Try Again.");         // TRY AGAIN
                // ASK AGAIN
                print("What number do you think it is?");
                guess = keyBoard.nextInt();
                print("You guessed "+guess);
                //        Guess 2:
                if(guess == number){
                    print("GOOD JOB!  You got it right, \n    *** YOU WIN ***");
                }
                else if( guess < number){   // GUESS IS TOO LOW
                    if(guess+3 > number){   //                  ... so +
                        print("Your CLOSE, too Low.  \n  ~~~~~~~ GAME OVER ~~~~~~~ ");
                    }else {
                        print("NOPE, Your too Low.  \n  ~~~~~~~ GAME OVER ~~~~~~~ ");
                    }
                }
                else if(guess > number){    // GUESS IS TOO HIGH
                    if(guess-3 < number){   //                   ... so -
                        print("Your CLOSE, too HIGH.  \n  ~~~~~~~ GAME OVER ~~~~~~~ ");
                    }else {
                        print("NOPE, Your too HIGH.  \n  ~~~~~~~ GAME OVER ~~~~~~~ ");
                    }
                }
                // ASK AGAIN
            }else {
                print("NOPE, Your too HIGH.  \n  Try Again.");          // TRY AGAIN
                // ASK AGAIN
                print("What number do you think it is?");
                guess = keyBoard.nextInt();
                print("You guessed "+guess);
                //        Guess 2:
                if(guess == number){
                    print("GOOD JOB!  You got it right, \n    *** YOU WIN ***");
                }
                else if( guess < number){   // GUESS IS TOO LOW
                    if(guess+3 > number){   //                  ... so +
                        print("Your CLOSE, too Low.  \n  ~~~~~~~ GAME OVER ~~~~~~~ ");
                    }else {
                        print("NOPE, Your too Low.  \n  ~~~~~~~ GAME OVER ~~~~~~~ ");
                    }
                }
                else if(guess > number){    // GUESS IS TOO HIGH
                    if(guess-3 < number){   //                   ... so -
                        print("Your CLOSE, too HIGH.  \n  ~~~~~~~ GAME OVER ~~~~~~~ ");
                    }else {
                        print("NOPE, Your too HIGH.  \n  ~~~~~~~ GAME OVER ~~~~~~~ ");
                    }
                }
                // ASK AGAIN
            }
        }
    }

    // ~~~~~~~ EASY PRINT ~~~~~~~ \\
    private static void print(String say){
        System.out.println(say);
    }
}

