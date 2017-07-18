package ex;

import java.util.Scanner;

public class longestprefix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		String s1[]=new String[100];
		String s2="";
		String chk;
		for(int i=0;i<s;i++)
		{
			s1[i]=sc.next();
		}
		if(s1.length>0)
		{
			s2=s1[0];
			for(int i=1;i<s1.length;i++)
			{
				chk=s1[i];
				for(int j=0;j<s1.length;j++)
				{
					if(s2.charAt(j)!=chk.charAt(j))
					{
						break;
					}
					s2=s1[i].substring(0,j);
					System.out.print(s2);
				}
			}
		}
		

	}

}
