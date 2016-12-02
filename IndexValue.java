import java.util.*;
class IndexValue
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n;
n=sc.nextInt();
System.out.println("Enter Array:");
int[] a=new int[n];
int i;
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(i=0;i<n;i++)
{
if(a[i]==i)
{
System.out.println("Integer is:"+i);
}
}
}
}

