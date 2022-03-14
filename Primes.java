/**
 * This class finds all the prime numbers from 1 to 1001
 *
 * @author Marie Louise Uwibambe
 *
 * Andrew ID: muwibamb
 *
 * On my honor, as a Carnegie-Mellon Africa student, I have neither given nor received unauthorized assistance on this work.
 *
 */

public class Primes 
{

public static void main(String[] args)
{
    boolean [] primeNumber;
    primeNumber=new boolean [1001];
    int i;
    for(i=1; i <=1000 ; i++)
    {
        primeNumber[i] = true ;
    }
    
    for(int a=2; a <= 1000 ; a++)
    {
        for(i=2; i <= 1000; i++)
        {
            if(a*i <= 1000)
            {
                primeNumber[ i * a ]=false;
            }
        }
    }
    
    System.out.println("This is the list of prime numbers between 1 and 1000");
    
    for(i=1; i <= 1000 ; i++)
    {
        if(primeNumber[i] == true)
            System.out.println(i);
    }
}
}
