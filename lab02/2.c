#include <stdio.h>

float circle(float r)
{
    return 3.14 * r * r;
}

float triangle(float b, float h)
{
    return 0.5 * b * h;
}

float square(float l)
{
    return l * l;
}

void main()
{
    int n, b, h, l;
    printf("Enter the number of shapes: ");
    scanf("%d", &n);
    printf("Circle area: %f\n", circle(n));

    printf("Give b and h");
    scanf("%d%d", &b, &h);
    printf("Triangle area: %f\n", triangle(b, h));

    printf("Give l");
    scanf("%d", &l);
    printf("Square area: %f\n", square(l));
}