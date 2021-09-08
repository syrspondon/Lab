import java.util.Scanner;
public class task02
{
  public static void main (String []args)
  {
    Scanner snr = new Scanner(System.in);
    System.out.println("PLease enter a number");
    int c = snr.nextInt();
    for(int n=1; n<=c; n++)
    {
      System.out.print("*");
    }
    System.out.println();
  }
}
    