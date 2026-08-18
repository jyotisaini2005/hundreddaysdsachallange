<<<<<<< HEAD
//Base case → b == 0
//Recursive → a * power(a, b-1)
#include <stdio.h>

int power(int a, int b)
{
    // Base case
    if (b == 0)
    {
        return 1;
    }

    // Recursive case
    return a * power(a, b - 1);
}

int main()
{
    int a, b;

    scanf("%d %d", &a, &b);

    printf("%d", power(a, b));

    return 0;
=======
//Base case → b == 0
//Recursive → a * power(a, b-1)
#include <stdio.h>

int power(int a, int b)
{
    // Base case
    if (b == 0)
    {
        return 1;
    }

    // Recursive case
    return a * power(a, b - 1);
}

int main()
{
    int a, b;

    scanf("%d %d", &a, &b);

    printf("%d", power(a, b));

    return 0;
>>>>>>> 31128666d01b5721a03fe43e899a23a37718a68e
}