#include <stdio.h>

int max(int arr[], int size)
{
    int max = arr[0];
    int i = 0;
    for (i = 0; i < size; i++)
    {
        if (arr[i] > max)
            max = arr[i];
    }
    int max2 = 0;
    for (i = 0; i < size; i++)
    {
        if (arr[i] == max)
            continue;
        if (arr[i] > max2)
            max2 = arr[i];
    }
    return max2;
}

void main()
{
    // printf("What is the size of array");
    // int n;
    // scanf("%d", &n);

    // printf("Give %d elements", n);
    // int arr[100], i, even = 0, odd = 0;
    // for (i = 0; i < n; i++)
    // {
    //     scanf("%d", &arr[i]);
    // }

    int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, n = 10;
    printf("max is %d", max(arr, n));
}