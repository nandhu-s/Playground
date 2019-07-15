#include <stdio.h>
int main()
{
    double a, b, c, d, root1, root2, r, i;
    scanf("%lf\n%lf\n%lf",&a, &b, &c);
    d = b*b-4*a*c;
    if (d>=0)
    {
        root1 = (-b+sqrt(d))/(2*a);
        root2 = (-b-sqrt(d))/(2*a);
        printf("root1 = %.2lf  root2 = %.2lf",root1 , root2);
    }
    else
    {
        r = -b/(2*a);
        i = sqrt(-d)/(2*a);
        printf("root1 = %.2lf + %.2lfi  root2 = %.2f - %.2fi", r, i, r, i);
    }
    return 0;
}   