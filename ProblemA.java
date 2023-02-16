import java.util.Scanner;

class Solution{


    static int gcd(int a, int b)
    {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }

    static int findGCD(int arr[], int n)
    {
        int result = arr[0];
        for (int element: arr){
            result = gcd(result, element);
 
            if(result == 1)
            {
               return 1;
            }
        }
 
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();
        for(int l=0;l<t;l++)
        {
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
            int min=a[0];
            for(int i=0;i<n;i++)
            {
                if(a[i]<min)
                min=a[i];
            } 
            int c=findGCD(a,n);
            
            
        }
    }
}