import java.util.Scanner;
class adam
{
  public int re(int x)
  {
   int a=x;
   int rev=0;
   while(a!=0)
   {
     int i=a%10;
     rev=rev*10+i;
     a=a/10;
   }
  return rev;
 }
 public static void main(String args[])
{
 adam obj=new adam();
 Scanner s=new Scanner(System.in);
 System.out.println("enter n value");
 int n=s.nextInt();
 int u=n*n;
 int f=obj.re(n);
 int h=f*f;
 int t=obj.re(h);
 if(u==t)
 System.out.println("the number is adam");
 else
 System.out.println("the number is not a adam");
}
}
 
