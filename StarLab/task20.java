import java.util.Scanner;
public class task20
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
        for(int n=1; n<c-r+1; n++)
        {
          System.out.print(" ");
        }
        for(int n2=1; n2<r*2; n2++)
        {
          System.out.print("*");
        }
      }
      else
      {
        for(int n3=1; n3<=c-r; n3++)
        {
          System.out.print(" ");
        }
        System.out.print("*");
        for(int n4=1; n4<=(r-1)*2-1; n4++)
        {
          System.out.print(" ");
        }
        System.out.print("*");
      }
      System.out.println();
    }
  }
}