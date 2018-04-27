/**
 * A driver for the Sam magpie lab
 * @author Maximillian C Post
 * @version April 17, 2018
 */

import java.util.Scanner;

public class MagpieRunner
{
  public static void main(String[] args)
  {
    Sam sam = new Sam();

    System.out.println(sam.getGreeting());
    Scanner in = new Scanner(System.in);
    String statment = in.nextLine();

    while(!statment.equals("Bye"))
    {
      System.out.println(sam.getResponse(statment));
      statment = in.nextLine();
    }
  }
}
