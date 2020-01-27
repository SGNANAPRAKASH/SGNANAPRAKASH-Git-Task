import java.io.*;
import java.util.*;
import java.math.*;
class Absolute
{
public static void main(String...poori)
{
Scanner s=new Scanner(System.in);
System.out.println("enter n value");
int n=s.nextInt();
System.out.println("enter minimum absolute value");
int x=s.nextInt();
int sum=0;
int a[]=new int[n];
System.out.println("enter array elements");
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
for(int i=0;i<n;i++)
{
a[i]=Math.abs(a[i]-x);
sum=sum+a[i];
}
System.out.println("The sum is:"+sum);
}
}