import java.util.*;
class Solution {
    public boolean isPalindrome(int x) {
         int n=x;
        int a=x;
        int p=0;
        while(n!=0)
          {
            int re=n%10;
            p=p*10+re;
            n=n/10;
        }
        if(p==a&&a>=0)
            return true;
        else
             return false;
    }
    public static void main(String args[])
    {
        Solution sc=new Solution();
        Scanner s=new Scanner(System.in);
        int b=s.nextInt();
        sc.isPalindrome(b);
    }
        
    }
