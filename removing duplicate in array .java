import java.util.Scanner;
   class Sample
	{
             public static void main(String args[]) 
               {
                Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
                 System.out.println("enter values are");
		for(int i=0;i<n;i++)
		{
		   a[i]=s.nextInt();
		}
		int count=0;
                   for(int i=0;i<n;i++)
                   {
                      if(a[i]==0)
                       count++;
                    }
                   
		for(int i=0;i<n;i++)
		{
		   for(int j=i+1;j<n;j++)
		    {
			if(a[i]==a[j])
			{
			   a[j]=0;

			}
                       }
                     }
			System.out.println("the elements are");
			if(count>=1)
                          System.out.println(0);
			   for(int i=0;i<n;i++)
			    {
				if(a[i]==0)
				continue;
				else 
			        System.out.println(a[i]+" ");
                             }
                         }
                  }
            
		
		
