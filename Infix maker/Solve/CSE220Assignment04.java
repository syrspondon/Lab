import java.util.Scanner;
import java.util.Stack;

public class CSE220Assignment04
{
    public static String postFixBuilder(String s)
    {
        String q = "";
        char[] a = s.toCharArray();
        Stack<Character> d = new Stack<Character>();
        for (int i = 0; i<a.length; i++)
        {
            if (Character.isDigit(a[i]))
                q+=a[i];
            else if (a[i]=='+'||a[i]=='-'||a[i]=='*'||a[i]=='/'||a[i]=='%')
            {
                if (d.isEmpty()||d.peek()=='&')
                    d.push(a[i]);
                else
                {
                    if (d.peek()=='-')
                    {
                        while (d.peek()=='-')
                        {
                            q += d.pop();
                            if (d.empty())
                                break;
                        }
                        d.push(a[i]);
                    }
                    else if (d.peek()=='*'||d.peek()=='/'||d.peek()=='%')
                    {
                        while (d.peek()=='*'||d.peek()=='/'||d.peek()=='%')
                        {
                            q+=d.pop();
                            if (d.empty())
                                break;
                        }
                        d.push(a[i]);
                    }
                    else
                    {
                        d.push(a[i]);
                    }
                }
            }
            else if (a[i]=='('||a[i]==')'||a[i]=='{'||a[i]=='}'||a[i]=='['||a[i]==']')
            {
                if (a[i]=='('||a[i]=='{'||a[i]=='[')
                    d.push('&');
                else
                {
                    while (d.peek()!='&')
                        q+=d.pop();
                    if (d.peek()=='&')
                        d.pop();
                }
            }
        }
        while (!d.empty())
            q+=d.pop();
        return q;
    }

    public static int postFixEvaluator(String s)
    {
        int z = 0;
        Stack<Integer> d = new Stack<Integer>();
        char[] a = s.toCharArray();
        for (int i = 0; i<a.length; i++)
        {
            if (Character.isDigit(a[i]))
                d.push((int)((a[i])-'0'));
            else
            {
                int n = d.pop();
                int m = d.pop();
                if (a[i]=='+')
                    z = m+n;
                else if (a[i]=='-')
                    z = m-n;
                else if (a[i]=='*')
                    z = m*n;
                else if (a[i]=='/')
                    z = m/n;
                else if (a[i]=='%')
                    z = m%n;
                d.push(z);
            }
        }
        z = d.pop();
        return z;
    }

    public static void main(String[] args)
    {
        String exp=new Scanner(System.in).next();
        String postFixExp = postFixBuilder(exp);
        System.out.println("Post Fix Expression: "+postFixExp);
        int result = postFixEvaluator(postFixExp);
        System.out.println("Answer: "+result);
    }
}