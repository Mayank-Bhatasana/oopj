#include <stdio.h>

void main()
{
    printf("Give a number");
    int n;
    scanf("%d", &n);

    int i, j, k;
    //    for (i = 1; i <= n; i++)
    //    {
    //        for (j = n; j >= i; j--)
    //        {
    //            printf("%d", j);
    //        }
    //        printf("\n");
    //    }

    for (i = 0; i < n; i++)
    {
        for (j = n - i; j > 0; j--)
        {
            printf(" ");
        }
        for (j = i; j >= 0; j--)
        {
            printf("* ");
        }
        printf("\n");
    }

    for (i = n - 1; i > 0; i--)
    {
        for (j = n - i; j >= 0; j--)
        {
            printf(" ");
        }
        for (j = i; j >= 1; j--)
        {
            printf("* ");
        }
        printf("\n");
    }
}
