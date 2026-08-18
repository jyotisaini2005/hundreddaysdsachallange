#include <stdio.h>

void reverseArray(int arr[], int size)
{
    int left = 0;
    int right = size - 1;

    while(left < right)
    {
        int temp;

        // Swap left and right elements
        temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        // Move pointers
        left++;
        right--;
    }
}

int main()
{
    int n;

    scanf("%d", &n);

    int arr[n];

    // Taking array input
    for(int i = 0; i < n; i++)
    {
        scanf("%d", &arr[i]);
    }

    // Function call
    reverseArray(arr, n);

    // Printing reversed array
    for(int i = 0; i < n; i++)
    {
        printf("%d ", arr[i]);
    }

    return 0;
}