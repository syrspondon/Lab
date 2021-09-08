import java.util.Scanner;
public class task11
{
  public static void main (String []args)
  {
    Scanner snr = new Scanner(System.in);
    System.out.println("PLease enter the number of lines");
    int c = snr.nextInt();
    int b = 1;
    int n = c;
    int v = 1;
    int x = n;
    while(b<=c)
    {
      for(int m=1; m<=n-1; m++)
      {
        System.out.print(" ");
      }
      n--;
      for(int k=1; k<=v; k++)
      {
        System.out.print(x);
        x++;
      }
      x = n;
      v++;
      System.out.println();
      b++;
    }
  }
}