import java.util.*;
class target
{
    public static void main(String args[])
    {
        
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        int b[]=new int[args.length];
        int a1;
        for(int i=0;i<args.length;i++)
        {
            b[i]=Integer.parseInt(args[i]);
        
        }
        for(int i=0;i<args.length;i++)
        {
        for(int j=i;j<args.length;j++)
        {
            if(i!=j)
            {
                a1=b[i]+b[j];
                if(a1==target)
                {
                    System.out.print(b[i]+" "+b[j]);
                    break;
                }
}       }   }
         
    }
}



