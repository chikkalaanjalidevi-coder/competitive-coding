import java.util.*;
class PrimeNumbers
{
public static void  main(String args[])
{
int  n,p,i,j;
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
n=sc.nextInt();
System.out.println("prime numbers are");
for(i=2; i<=n; i++)
{
p=0;
for(j=1;j<=i;j++)
{
if(i%j==0)
p++;
}
if(p==2)
{
System.out.println(i);
}
}
}
}