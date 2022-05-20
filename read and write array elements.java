import java.util.Scanner;
class Sample
{
  public static void main(String args[])
  {
   int i,n,a[];
   Scanner s=new Scanner(System.in);
   System.out.println("enter n value");
   n=s.nextInt();
   a=new int[n];
    System.out.println("the elements are");
    for(i=0;i<n;i++)
    a[i]=s.nextInt();
    int sum=0;
    for(i=0;i<n;i++)
    sum=sum+a[i];
    System.out.println("the sum of elements are"+sum);
    int avg=sum/n;
     System.out.println("the average of elements are"+avg);
   }
}
