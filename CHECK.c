//Take an three input from kewboard and find out maximum number among them and print them
#include<stdio.h>
#include<math.h>
int main()
{  
    // array |0 |1 |2 |3 |4 |5 |6 |7 |8 |9  |10|11 |12|
    int n;
    scanf("%d",&n);
    int x[n];
    printf("Enter the value of x[i]:");
    for(int i=0;i<n;i++)
    {
        scanf("%d",&x[i]);
    }

    for(int i=0;i<n;i++)
    printf("%d\t",x[i]);
    
    return 0;
}