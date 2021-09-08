import java.util.Scanner;
public class task23
{
  public static void main (String []args)
  {
    Scanner snr = new Scanner(System.in);
    System.out.println("PLease enter the number of lines");
    int c = snr.nextInt();
    for(int r=1; r<=c; r++)
    {
      if(r==1)
      {
        for(int n=1; n<c-r+1; n++)
          System.out.print(" ");
        
        System.out.print("1");
      }
      else
      {
        for(int n2=1; n2<=c-r; n2++)
        {
          System.out.print(" ");
        }
        System.out.print("1");
        for(int n3=1; n3<=(r-1)*2-1; n3++)
        {
          System.out.print(" ");
        }
        System.out.print(r*2-1);
      }
      System.out.println();
    }
    for (int r1=1; r1<c; r1++)
    {
      if(r1!=c-1)
      {
        for(int n4=1; n4<=r1; n4++)
        {
          System.out.print(" ");
        }
        System.out.print("1");
        for(int n5=1; n5<=(c-r1)*2-3; n5++)
        {
          System.out.print(" ");
        }
        System.out.print((c-r1)*2-1);
      }
      else
      {
        for(int n6=1; n6<=r1; n6++)
        System.out.print(" ");
        System.out.print("1");
      }
      System.out.println();
    }
  }
}