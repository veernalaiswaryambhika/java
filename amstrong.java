import java.util.*;
class amstrong
{
  public static void main(String args[])
  {
   Scanner s=new Scanner(System.in);
   System.out.println("enter n value");
   int n=s.nextInt();
   int temp=n;
   int p=n;
   int len=0;
   while(n!=0)
   {
     n=n/10;
     len=len+1;
   }
   System.out.println("the length of the number is:"+len);
   double x=0;
   while(temp!=0)
   {
     int j=temp%10;
     x=(x+Math.pow(j,len));
     temp=temp/10;
    }
  if(x==p)
  System.out.println("amstrong");
  else
  System.out.println("not amstrong");
  }
}
    
