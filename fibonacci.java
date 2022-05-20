import java.util.Scanner;
class fibb
{
  public static void main(String args[])
   {   
      int a=0,b=1,t;
      Scanner s=new Scanner(System.in);
        System.out.println("enter number");
        int num=s.nextInt();
         System.out.println(a);
          System.out.println (b);
         for(int i=1;i<num;i++)
       { t=a+b;
         a=b;
        b=t;
         System.out.println(t);
         
         }
   }
}
