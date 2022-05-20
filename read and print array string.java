import java.util.Scanner;
class Sample
{
  public static void main(String args[])
  {
   int i,n;
   String a[];
   Scanner s=new Scanner(System.in);
   System.out.println("enter n value");
   n=s.nextInt();
   a=new String[n];
    System.out.println("the enter names are");
    for(i=0;i<n;i++)
    a[i]=s.next();
   System.out.println("the names are");
   for(i=0;i<n;i++)
   System.out.println(a[i]);
    
   }
}
