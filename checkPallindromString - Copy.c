//  Problem: Read a string and check if it is a palindrome using two-pointer comparison.
#include <stdio.h>
#include <string.h>

void checkPalindrome(char str[])
{
    int left = 0;
    int right = strlen(str) - 1;

    while (left < right)
    {
        if (str[left] != str[right])
        {
            printf("NO");
            return;
        }

        left++;
        right--;
    }

    printf("YES");
}

int main()
{
    char str[100];

    scanf("%s", str);

    checkPalindrome(str);

    return 0;
}