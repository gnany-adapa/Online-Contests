import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) 
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int t;
        
        Scanner sc= new Scanner(System.in);
        t= sc.nextInt();
        while(t>0)
        {
            
            int n=sc.nextInt();
            int [] ar= new int [n];
            for(int i=0;i<n;i++)
            {
                ar[i]= sc.nextInt();
            }
            
            int [] count = new int [n];
            for(int i=0;i<n;i++)
            {
                count[ar[i]]++;
            }
            for(int i=0;i<n;i++)
            {
                if(count[i]==2)
                    System.out.printf("%d ",i);
            }
            System.out.printf("\n");
            t--;
        }
    }
}