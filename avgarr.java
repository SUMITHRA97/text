import java.util.*;
class avgarr
{
    public static void main(String args[])
    {
        
        int a[]=new int[args.length];
        for(int d=0;d<args.length;d++)
        {
            a[d]=Integer.parseInt(args[d]);
        }
    
        ArrayList<Integer> a1=new ArrayList<Integer>();
        ArrayList<Integer> a2=new ArrayList<Integer>();
        int s1=0,s2=0,avg=0,avg1=0;
        for(int j=0;j<a.length-1;j++)
        {
            a1.add(a[j]);
        
        for(int k=j+1;k<a.length;k++)
        {
            a2.add(a[k]);
        }
        for(int z=0;z<a1.size();z++)
        {
            s1=s1+a1.get(z);
        }
        avg=s1/a1.size();
        for(int x=0;x<a2.size();x++)
        {
            s2=s2+a2.get(x);
        }
        avg1=s2/a2.size();
        if(avg==avg1){
            System.out.println(a1);
            System.out.println(a2);
          break;
        }
        
      if(a1.size()==a.length-1)
      {
          System.out.print("invalid input");
      }
        a2.clear();
            s1=0;
            s2=0;
            avg=0;
    }        avg1=0;
}   
}

