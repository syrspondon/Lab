import java.util.Scanner;
public class task03
{
  public static void main (String []args)
  {
    Scanner snr = new Scanner(System.in);
    System.out.println("PLease enter the number of lines");
    int c = snr.nextInt();
    System.out.println("How many stars in a line");
    int v = snr.nextInt();
    int b = 1;
    while(b<=c)
    {
      for(int n=1; n<=v; n++)
      {
        System.out.print("*");
      }
      System.out.println();
      b++;
    }
  }
}