#include <stdio.h>
void main()
{
    int p, t, r;
    printf("Give the value of p t r");
    scanf("%d%d%d", &p, &t, &r);
    printf("The simple interest is %d", (p * t * r) / 100);
}
