#include <stdio.h>
void main()
{
    int fact;
    printf("Give the fact number");
    scanf("%d",&fact);
    int sum = 1;
    int i;
    for (i = 1; i <= fact; i++)
    {
        sum *= i;
    }
    printf("%d", sum);
}
