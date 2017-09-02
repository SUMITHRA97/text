import java.util.*;
class subset
{
public static void main(String args[])
{
int count = 0;
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b =sc.nextInt();
int arr1[] = new int[b];
int arr[] = new int[a];
for(int i=0;i<a;i++)
arr[i] = sc.nextInt();
for(int i=0;i<b;i++)
arr1[i] = sc.nextInt();
for(int j=0;j<a;j++)
{
for(int k=0;k<b;k++)
{
if(arr[j]==arr2[k])
{count++;
break;}
}
}
if(count==a)
System.out.println(" subset ");
else
System.out.println("not subset");
}
}
