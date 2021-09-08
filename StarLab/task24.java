import java.util.Scanner;
public class task24
{
  public static void main (String []args)
  {
    Scanner snr = new Scanner(System.in);
    System.out.println("PLease enter the number of lines");
    int c = snr.nextInt();
    for(int n=1; n<=c; n++)
    {
      System.out.print(n);
    }
    for(int n2=c-1; n2>0; n2--)
    {
      System.out.print(n2);
    }
    System.out.println();
  }
}