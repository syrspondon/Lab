import java.util.Scanner;
public class task06
{
  public static void main (String []args)
  {
    Scanner snr = new Scanner(System.in);
    System.out.println("PLease enter the number of lines");
    int c = snr.nextInt();
    int b = 1;
    while(b<=c)
    {
      for(int v=1; v<=b; v++)
      {
        System.out.print(v);
      }
      System.out.println();
      b++;
    } 
  }
}