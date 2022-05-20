import jaa.util.Scanner
class fact
{
  public int factorial(int n)
  {
    if(n==0||n==1)
    return 1;
    else
     return n*factorial(n-1);
    }
  public static  void main(Static args[])
   {
    Scanner s=new Scanner(System.in)
    System.out.println("enter value");
    int x=s.nextInt();
   fact sc=new fact();
   System.out.println(sc.factorial(x));
}
}
