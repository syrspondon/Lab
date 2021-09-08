import java.util.Scanner;
public class task19
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
        for(int n=1; n<=c-r; n++)
        {
          System.out.print(" "); 
        }
        for(int i=c-r+1; i<=c; i++)
        {
          System.out.print(i);
        }
      }
      else
      {
        for(int n2=1; n2<=c-r; n2++)
        {
          System.out.print(" ");
        }
        System.out.print(c+1-r);
        for(int n3=1; n3<r-1; n3++)
        {
          System.out.print(" ");
        }
        System.out.print(c);
      }
      System.out.println();
    }
  }
}