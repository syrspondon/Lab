import java.util.Scanner;
public class task10
{
  public static void main(String[] args) 
  {
    Scanner snr = new Scanner(System.in);
    System.out.print("Enter number of rows : ");
    int c = snr.nextInt();
    for (int r = 1; r <= c; r++) 
    {
      int b = 1;
      for (int m = c - r; m > 0; m--) 
      {
        System.out.print(" ");
      }
      for (int v = 1; v <= r; v++) 
      {
        System.out.print(v);
        b++;
      }
      for (int k = 2; k <= r; k++) 
      {
        System.out.print(b);
        b++;
      }
      System.out.println();
    }
  }
}