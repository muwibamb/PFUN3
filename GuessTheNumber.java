/**
 * This class builds a game of guessing a number.
 *
 * @author Marie Louise Uwibambe
 *
 * Andrew ID: muwibamb
 *
 * On my honor, as a Carnegie-Mellon Africa student, I have neither given nor received unauthorized assistance on this work.
 *
 */
import java.io.*;
import java.util.*;
public class GuessTheNumber 
{
    static Random r=new Random();
    
public static void main(String args[]) throws IOException
{
    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));   
    int maxRange;
    int numGuess;
    String str = "yes";    
    
    String name=promptForName(keyboard);    
    while(checkYes(str) == true)
    {    
        maxRange =1+ r.nextInt(10000);
        System.out.print("Hi "+ name +". I am thinking a number from 1-"+ maxRange +" - guess the number: "); 
        numGuess =  guess( maxRange,keyboard); 
        System.out.println("Congratulations, you guessed the number in "+numGuess+" guesses!");
        if(numGuess <= log2(maxRange))
        {
            System.out.println("You know the secrete!"); 
        }
        else 
        {
            System.out.println("You should be able to do better!");  
        }
        System.out.println("Thanks for playing my Guess-the-Number Game " + name +"!");
        System.out.println("Do you wanna play again?");
        str=keyboard.readLine();
    } 
}
public static String promptForName(BufferedReader keyboard) throws IOException
{
    String name;
    System.out.print("Please enter your name: ");
    name=keyboard.readLine();
        return name;
}
public static int guess(int maxRange,BufferedReader keyboard)throws IOException
{ 
    int numGuess = 0;
    int guess;
    int number = 1+r.nextInt(maxRange);
    while(true)
    {  
        String str=keyboard.readLine();
        guess = Integer.parseInt(str);
        numGuess++;

        if(guess == number)
        {
            break;
        }
        if(guess < number)
        {
            System.out.println("Too low");
        }
        if(guess >number)
        {
            System.out.println("Too high");
        }
        System.out.println("Try again");
    }
    return numGuess;        
}
public static int log2(int n)
{
    int log= (int) Math.round(Math.log10(n) / Math.log10(2.));
    return log;
}

public static boolean checkBlank(String str)
{
    str = str.replaceAll("[ \t]","");
    if(str.equals(""))
        return true;
    else 
        return false;
}
public static boolean checkYes(String str)
{
    if(checkBlank(str) == true)
    {
        return true;
    }
    else if(str.equalsIgnoreCase("yes") ||str.equalsIgnoreCase("yep") || str.equalsIgnoreCase("y")) 
    {
        return true;
    }
    else 
    {
        return false;
    } 
}
}
