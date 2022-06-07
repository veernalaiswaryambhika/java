import java.util.*;
class Solution {
    public int removeElement(int[] nums, int al) {
         
         int i = 0;
    for (int j = 0; j < nums.length; j++) 
	{
            if (nums[j] != al) 
	 {
            nums[i] = nums[j];
            i++;
          }
    }
       return i;
	
   }
       public static void main(String args[])
       {
   	 Solution oj=new Solution();
	 Scanner s=new Scanner(System.in);
         System.out.print("the n values");
          int n=s.nextInt();
	 int a[]=new int[n];
          System.out.print("the elements are:");
	for(int i=0;i<n;i++)
	a[i]=s.nextInt();
         System.out.print("the key values");
         int key=s.nextInt();
         int d= oj.removeElement(a,key);
          System.out.print("number of elements after removing key value");
  	  System.out.println(d);
	       System.out.print("after removing key value");
         
         for(int i=0;i<d;i++)
{
           System.out.print(a[i]+" ");
}
	}
    }
