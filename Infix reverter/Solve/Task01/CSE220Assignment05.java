import java.util.Scanner;

public class CSE220Assignment05{
    public static int i = 0;
    public static char c = ' ';
    public static boolean parenthesescheck(String s){
        Stack d = new ArrayStack();
        for (i = 0; i<s.length(); i++)
        {
            c = s.charAt(i);
            if (c=='('||c=='{'||c=='[')
            {
                d.push((char)i);
                d.push(c);
            }
            else if (c==')'||c=='}'||c==']')
            {
                if (d.empty())
                    return false;
                if (c==')')
                {
                    if (d.peek()!='(')
                    {
                        c = d.pop();
                        i = d.pop();
                        return false;
                    }
                    d.pop();
                    d.pop();
                }
                else if (c=='}')
                {
                    if (d.peek()!='{')
                    {
                        c = d.pop();
                        i = d.pop();
                        return false;
                    }
                    d.pop();
                    d.pop();
                }
                else if (c==']')
                {
                    if (d.peek()!='[')
                    {
                        c = d.pop();
                        i = d.pop();
                        return false;
                    }
                    d.pop();
                    d.pop();
                }
            }
        }
        return d.empty();
    }
    public static void main(String[]args){
        String exp=new Scanner(System.in).next();
        boolean z = parenthesescheck(exp);
        i++;
        if (z==true)
            System.out.println("This expression is correct.");
        else
        {
            System.out.println("This expression is NOT correct.");
            if (c=='('||c=='{'||c=='[')
                System.out.println("Error at character # "+i+". ‘"+c+"‘- not closed.");
            else
                System.out.println("Error at character # "+i+". ‘"+c+"‘- not opened.");
        }
    }
}