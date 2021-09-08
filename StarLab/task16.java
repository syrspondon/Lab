import java.util.Scanner;
public class task16
{
  public static void main (String []args)
  {
    Scanner snr = new Scanner(System.in);
    System.out.println("PLease enter the number of lines");
    int c = snr.nextInt();
    for(int r=1; r<=c; r++)
    {
      if(r==1||r==c)
      {
        for(int x=1; x<=r; x++)
        {
          System.out.print("*");
        }
      }
      else
      {
        System.out.print("*");
        for(int k=1; k<r-1; k++)
        {
          System.out.print(" ");
        }
        System.out.print("*");
      }
      System.out.println();
    }
  }
}