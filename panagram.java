import java.util.*;
class panagram
{
    public static void main(String args[])
    {
        int i;
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        if(s.length()>=26)
        {
            Set<Character> st=new HashSet<Character>();
        for(i=0;i<s.length();i++)
        
            st.add(s.charAt(i));
            if(st.size()==26)
            
                System.out.println("panagram");
            
            else 
            {
                System.out.print("not panagram");
            }
        
        }
}
}






