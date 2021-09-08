import java.util.Scanner;
public class task15
{
  public static void main (String []args)
  {
    Scanner snr = new Scanner(System.in);
    System.out.println("PLease enter the number of lines");
    int c = snr.nextInt();
    System.out.println("How many stars in a line");
    int v = snr.nextInt();
    for(int r=1; r<=c; r++)
    {
      if(r==1||r==c)
      {
        for(int x=1; x<=v; x++)
        {
          System.out.print(x);
        }
      }
      else
      {
        System.out.print("1");
        for(int k=1; k<v-1; k++)
        {
          System.out.print(" ");
        }
        System.out.print(v);
      }
      System.out.println();
    }
  }
}