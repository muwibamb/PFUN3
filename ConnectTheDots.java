/**
 * This class draws lines from the dots received from the user
 *
 * @author Marie Louise Uwibambe
 *
 * Andrew ID: muwibamb
 *
 * On my honor, as a Carnegie-Mellon Africa student, I have neither given nor received unauthorized assistance on this work.
 *
 */
import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.util.*;


public class ConnectTheDots extends JPanel
{
private Point dots[];
private int numDots = 0;

public ConnectTheDots(Point pointList[], int n)
{
    dots = pointList;
    numDots = n;
}

public void paintComponent (Graphics g)
{
    super.paintComponent(g);

    g.setColor(Color.black);
    
    for(int i=0; i <numDots-1 ; i++)
    {
        connect(g, dots[i], dots[i+1]);
    }
    connect(g, dots[0], dots[ numDots-1 ]);
}

public void connect(Graphics g, Point p1, Point p2)
{
    int x1, y1;
    int x2, y2;
    x1 = p1.x;; 
    y1 = p1.y; 
    x2 = p2.x; 
    y2 = p2.y; 
    g.drawLine(x1, y1, x2, y2);
}

public static void main(String argv[]) throws IOException
{
    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
    JFrame frame = new JFrame(); 
    String coords[];
    Point points [];
    points= new Point[25];
    int numPoints = 0; 
    String str;
    int x, y;
    System.out.print("Enter point " + (numPoints + 1) + " in x,y format: ");
    str = keyboard.readLine();
    while (!str.equals(""))
    {         
        coords=str.split(","); 
        x = Integer.parseInt(coords[0]);
        y = Integer.parseInt(coords[1]);
        Point p=new Point(x,y);
        points[numPoints]=p;
        numPoints++;
        if(numPoints == 25)
        {
            System.out.println("You've filled in all your 25 points! Your drawing is ready."); 
            break; 
        }

        System.out.print("Enter point " + (numPoints + 1) + " in x,y format: ");
        str = keyboard.readLine();
    }
    printArray("Dots", points, numPoints); 
    System.out.println("Now I will connect your " + numPoints + " dots");
    ConnectTheDots art = new ConnectTheDots(points, numPoints); 
    frame.add(art);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(250, 250);
    frame.setVisible(true);
}

public static void printArray(String label, Object array[])
{
    printArray(label, array, array.length);
}

public static void printArray(String label, Object array[], int n)
{
    for(int i=0; i < n; i++)
        System.out.println(label +"["+i+ "]:"+ array[i]);
}
}