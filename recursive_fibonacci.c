<<<<<<< HEAD
#include <stdio.h>

int fib(int n)
{
    // Base cases
    if (n == 0)
    {
        return 0;
    }

    if (n == 1)
    {
        return 1;
    }

    // Recursive case
    return fib(n - 1) + fib(n - 2);
}

int main()
{
    int n;

    scanf("%d", &n);

    printf("%d", fib(n));

    return 0;
=======
#include <stdio.h>

int fib(int n)
{
    // Base cases
    if (n == 0)
    {
        return 0;
    }

    if (n == 1)
    {
        return 1;
    }

    // Recursive case
    return fib(n - 1) + fib(n - 2);
}

int main()
{
    int n;

    scanf("%d", &n);

    printf("%d", fib(n));

    return 0;
>>>>>>> 31128666d01b5721a03fe43e899a23a37718a68e
}