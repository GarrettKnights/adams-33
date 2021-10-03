/*
 *  UCF COP3330 Fall 2021 Assignment 33 Solution
 *  Copyright 2021 Garrett Adams
 */


package Exercise33;

//Imports all java util
import java.util.*;

public class Solution33 {
    public static String MagicBall(){
        //Stores all possible answers
        String[] PossibleSystemResponses = {"Maybe","Ask again later","Yes","No"};
        //Creates UserInput
        String UserInput;
        //Sets up our random for later
        Random RandomNum = new Random();

        //Sets up our scanner
        Scanner ScanWord = new Scanner(System.in);

        //Prompts the user to enter their question
        System.out.println("What's your question?");
        //Just here so the user can type
        UserInput = ScanWord.nextLine();


        //Gets random value of the arrays length
        int RandomArrayStorage = RandomNum.nextInt(PossibleSystemResponses.length);
        //Returns the correlating String
        return PossibleSystemResponses[RandomArrayStorage];
    }

    public static void main(String[] args) {
        //Stores the return from MagicBall in SystemAnswer
        String SystemAnswer = Solution33.MagicBall();
        //Prints out the SystemAnswer
        System.out.println(SystemAnswer);
    }
}
