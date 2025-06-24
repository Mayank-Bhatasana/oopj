#include <stdio.h>

void fibo(int n)
{
    printf("0\n");
    int a = 0, b = 1, c = 1, i;
    for (i = 0; i < n - 1; i++)
    {
        printf("%d\n", c);
        c = a + b;
        a = b;
        b = c;
    }
}
void main()
{
    int n;
    printf("Enter a number: ");
    scanf("%d", &n);
    fibo(n);
}
