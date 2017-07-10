import java.util.*;
class removeduplicate
{
    public static void main(String args[])
    {
        Scanner d=new Scanner(System.in);
        String a=d.next();
        int i;
        Set<Character> s=new LinkedHashSet<Character>();
        for(i=0;i<a.length();i++)
        {
    s.add(a.charAt(i));
    
        }
        for(char f:s)
System.out.print(f);
    }
}

