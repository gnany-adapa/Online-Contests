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
            int a [][] = new int [n][n];
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    a[i][j] = sc.nextInt();
                }
            }
            
            int k = 2*n -1;
            int [] sum = new int [k];
            int p  = 1-n;
            for(int d =0;d<k;d++)
            {
                int c =0;
                for(int i=0;i<n;i++)
                {
                    for(int j=0;j<n;j++)
                    {
                        if(i-j==p){
                            c=c+a[i][j];
                        }
                        sum[d] =c;
                    }
                }
                p++;
            }
            for(int d=0;d<k;d++)
                System.out.print(sum[d]+" ");
            System.out.println();
        }
    }
}