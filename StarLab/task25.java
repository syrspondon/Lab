import java.util.Scanner;
public class task25
{
  public static void main (String []args)
  {
    Scanner snr = new Scanner(System.in);
    System.out.println("PLease enter the number of lines");
    int c = snr.nextInt();
    int i,j;
    for (i = 1; i <= c; i++)
    {
      for (j = i; j < c; j++)
      {
        System.out.print(" ");
      }
      for (j = 1; j <= i; j++)
      {
        System.out.print(j);
      }
      for (j = i - 1; j >= 1; j--)
      {
        System.out.print(j);
      }
      System.out.print("\n");
    }
  }
}