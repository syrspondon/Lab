import java.util.Scanner;
public class task12
{
  public static void main(String[] args) 
  {
    Scanner snr = new Scanner(System.in);
    System.out.print("Enter number of rows : ");
    int c = snr.nextInt();
    for (int r = 1; r <= c; r++)
    {
      for (int m = c - r; m > 0; m--) 
      {
        System.out.print(" ");
      }
      for (int v = 1; v <= r; v++) 
      {
        System.out.print("*");
      }
      for (int k = 2; k <= r; k++) 
      {
        System.out.print("*");
      }
      System.out.println();
    }
    for(int r2=1; r2<c; r2++) 
    {
      for(int m2=0; m2<r2; m2++)
      {
        System.out.print(" ");
      }
      for(int m3=1; m3<=(c-r2)*2-1; m3++)
      {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}