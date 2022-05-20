import java.util.*;
class auto
{
  public void val(int x)
  {
    int u=x;
    int p=x;
    int count=0;
    while(u!=0)
    {
      u=u/10;
      count=count+1;
    }
    int temp=p*p;
    double h=temp%(Math.pow(10,count));
    if(p==h)
    System.out.println("the number is automorphic number");
    else
     System.out.println("the number is not automorphic number");
    }
   public static void main(String args[])
    { 
       auto sp=new auto();
        sp.val(5);
     }
 }
