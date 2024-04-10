import java.io.*;
import java.util.*;

public class Solution {

    public static long power(long a, long b)
    {
        long answer =1;
        while(b!=0)
        {
            if((b&1)==1)
                answer = (answer*a)% 1000000007; //dont forget the modulo here
            a = (a*a)%1000000007;  // modulo here is important
            b=b>>1;
                
        }
        return answer% 1000000007; // modulo here is also soo important
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-->0)
        {
            long a= sc.nextLong();
            long b = sc.nextLong();
            if(a==0 && b==0)
                System.out.println(1);
            else if(b==0)
                System.out.println(1);
            else if (a==0)
            {
                System.out.println(0);
            }
            else
            {
                long ans = power(a,b);
                System.out.println(ans);
            }
            
            
        }
    }
}