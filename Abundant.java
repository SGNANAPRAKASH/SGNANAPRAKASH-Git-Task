import java.io.*;
import java.util.*;
class Abundant 
{
public static void main(String...poori)
{
Scanner s=new Scanner(System.in);
System.out.println("enter n value");
int n=s.nextInt();
int a[]=new int[100];
int j=0,sum=0,n1=n;
for(int i=1;i<n;i++)
{
if(n%i==0)
{
a[j]=i;
j++;
}
}
System.out.println("The divisors of given number are:");
for(int i=0;i<j;i++)
{
System.out.println(a[i]);
sum=sum+a[i];
}
System.out.println("Sum is:"+sum);
if(n1<sum)
{
System.out.println("The given number is an Abundant number");
}
else
{
System.out.println("The given number is not an Abundant number");
}
}
}