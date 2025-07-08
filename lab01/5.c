#include <stdio.h>
void main()
{
    int flag = 0, num, num2;
    printf("Give a number");
    scanf("%d%d", &num, &num2);

    int i, j;
    for (i = num; i < num2; i++)
    {
        for (j = 2; j < i; j++)
        {
            if (i % j == 0)
            {
                flag = 1;
            }
        }
        if (!flag)
        {
            printf("%d\n", i);
        }
        flag = 0;
    }
}
