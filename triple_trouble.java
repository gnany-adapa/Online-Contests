import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            int ar [] = new int [n];
            long arsum=0,sum=0;
            HashSet<Integer> hs = new HashSet<>();
            for(int i=0;i<n;i++)
            {
                ar[i] = sc.nextInt();
                if(hs.contains(ar[i])==false)
                {
                    sum+=ar[i];
                    hs.add(ar[i]);
                }

                    
                arsum+=ar[i];
            }
            //sum of set elements multiply by 3 gives sum of 3 occurences of all elements but we know one element is 
            //only repeated once i.e two occurences is extra when we subtract from arsum.
            //so we dividing that difference to get the actual number that is repeating only once instead of thrice.
            System.out.println((sum*3-arsum)/2);
            
            
        }
    }
}