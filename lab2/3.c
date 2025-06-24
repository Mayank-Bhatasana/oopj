#include <stdio.h>

void main()
{
    printf("What is the size of array");
    int n;
    scanf("%d", &n);

    printf("Give %d elements", n);
    int arr[100], i, even=0, odd=0;
    for (i = 0; i < n; i++)
    {
        scanf("%d", &arr[i]);
        if (arr[i] % 2 == 0)
        {
            even++;
        }
        else
        {
            odd++;
        }
    }
    printf("The number of even are %d\n the number odds are %d", even, odd);
}
