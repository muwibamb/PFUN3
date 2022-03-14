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
import java.util.*;
public class Coin
{  
private static Random r = new Random();
private CoinSide sideUp;
enum CoinSide
{
    HEADS,TAILS   
}   

public Coin()
{     
    sideUp = CoinSide.HEADS;
}
public boolean isHeads()
{
    if(sideUp == CoinSide.HEADS)
        return true; 
    else
        return false;
}
public boolean isTails()
{
    if(sideUp == CoinSide.TAILS)
        return true; 
    else
        return false;
}
public void flip()
{
    int number;
    number = r.nextInt(2);
    if (number == 1)
    {
        sideUp = CoinSide.HEADS; 
    }
    else
    {
        sideUp = CoinSide.TAILS; 
    }
 
}
public String toString()
{
    String toString = "Coins side up is: " + sideUp;
        return toString;
}
}
