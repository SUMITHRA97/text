import java.util.*;
class palindrom
{
    public static void main(String args[])
    {
        int m=0;
        Scanner sc=new Scanner(System.in);
        StringBuffer s=new StringBuffer(sc.next());
        StringBuffer temp=new StringBuffer("");
        StringBuffer temp1=new StringBuffer("");
        StringBuffer temp2=new StringBuffer("");
        for(int i=0;i<s.length();i++)
        {
            for(int j=i+1;j<s.length();j++)
            {
                temp=new StringBuffer(s.substring(i,j));
                temp1=new StringBuffer(s.substring(i,j));
          temp.reverse();   
          if(temp1.toString().equals(temp.toString())&&temp.length()>m)
            {
        m=temp1.length();
        temp2=temp1;
        
    }
}
}
    System.out.print(temp2);
    
    }
}

