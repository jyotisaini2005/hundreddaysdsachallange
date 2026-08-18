#include <stdio.h>

void reverseString(char str[], int n)
{
    for (int i = n - 1; i >= 0; i--)
    {
        printf("%c", str[i]);
    }
}

int main()
{
    char str[100];

    scanf("%s", str);

    int n = 0;

    while (str[n] != '\0')
    {
        n++;
    }

    reverseString(str, n);

    return 0;
}