/**
 * This class calculate the percentage of heads and tails when a coin is flipped
 *
 * @author Marie Louise Uwibambe
 *
 * Andrew ID: muwibamb
 *
 * On my honor, as a Carnegie-Mellon Africa student, I have neither given nor received unauthorized assistance on this work.
 *
 */
public class CoinToss
{

public static void main(String[] args) 
{
    if(args.length != 0)
    {    
        int i;
        int argument=Integer.valueOf(args[0]) ;
        Coin c=new Coin();
        int heads=0;
        int tails=0;
    
        for(i=0;i<argument;i++)
        {
            c.flip();
            if(c.isHeads() == true)
                heads++;
            else
                tails++;
        }
        System.out.println("Tossed a coin "+argument +" times.");
        System.out.println("Heads: "+heads+" Tails: "+tails);
        System.out.println("Heads: "+formatPercent(heads,argument)+"%"+" Tails: "+formatPercent(tails,argument)+"%");
    }
}
public static String formatPercent(double number, double total)
{
    double percent= (number/total)*100;
    String percentage = String.valueOf(percent);
        return percentage;
}
}

