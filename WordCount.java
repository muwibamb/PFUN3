import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * This class counts the number of words, sentence and letters
 *
 * @author Marie Louise Uwibambe
 *
 * Andrew ID: muwibamb
 *
 * On my honor, as a Carnegie-Mellon Africa student, I have neither given nor received unauthorized assistance on this work.
 *
 */
public class WordCount 
{
    


public static void main(String[] args)throws IOException
{
    String words[];
    String sentences[];
    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
    int numLine = 0;
    String[] lines;
    lines=new String[10];
    
    System.out.print("Enter line "+ (numLine+1) +": ");
    lines[numLine] = keyboard.readLine();
    while(!lines[numLine].equals(""))
    {
        if (numLine >= 9)
        {
            break;
        }
        else
        { 
            System.out.print("Enter line "+ (numLine+2) +": ");
            String l = keyboard.readLine();
            if(l.equals(""))
            {
                break;
            }
            else
            {
                numLine++;
                lines[numLine]=l;
            }
        }
    }
    System.out.println("");
    System.out.println("Thank you for entering " + (numLine+1) + " lines of data. Here are your results: "); 
    
    for (int i = 0; i <= numLine; i++)
    {
        System.out.println("**line " +(i+1)+": "+lines[i]);
        System.out.println("");
        splitLetters(lines[i]);  
        words=lines[i].split("[,.; ][,.; ]*");    
        sentences=lines[i].split("[.;][.; ]*");
        System.out.println("Counts (letters, words, sentences): (" +lines[i].length()+", "+words.length+", "+sentences.length +")");
        printArray("Letter",splitLetters(lines[i]));
        System.out.println("");
        printArray("word",words);
        System.out.println("");
        printArray("sentence",sentences);
        System.out.println("");
    }   
}

public static Character [] splitLetters(String lines)
{
    char charLetters[]=lines.toCharArray();
    Character letters[];
    letters= new Character[charLetters.length];
 
    for(int i = 0; i<charLetters.length; i++)
    {
        letters[i]=Character.valueOf(charLetters[i]);
    }
    return letters;
}

public static void printArray(String label, Object array[])
{
    for(int i = 0; i < array.length; i++)
    {
        System.out.println(label +"["+i+ "]:"+ array[i]);
    }
}
}


    