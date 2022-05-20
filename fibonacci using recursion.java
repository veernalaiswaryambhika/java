import java.util.Scanner;
class fibanocci
{ 
  public int fib(int x)
  {
   if(x==0)
   return 0;
   else if(x==1)
   return 1;
   else 
    return fib(x-1)+fib(x-2);
   }
  public static void main(String args[])
  {
    Scanner s= new Scanner(System.in);
    System.out.println("enter number of terms in series");
      int n=s.nextInt();
    fibanocci sob=new fibanocci();
    for(int i=0;i<n;i++)
    System.out.print(sob.fib(i)+" ");

}
}
    
