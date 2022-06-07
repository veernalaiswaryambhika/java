import java.util.Scanner;
class Sample
{
  public static void main(String args[])
  {
  
   Scanner s=new Scanner(System.in);
  
   String a[]=new String[5];
    System.out.println("the names are");
    for(int i=0;i<5;i++)
    a[i]=s.nextLine();
   System.out.println("the names are");
    int count=0;
   
   for(int i=0;i<5;i++)
   {  
     count=count+1;
    System.out.println(count+a[i]);
    
        }
     }
}
