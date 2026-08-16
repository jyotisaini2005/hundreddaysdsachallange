#include <stdio.h>

// Function to delete element at given position
void DeleteElementAtGivenPosition(int arr[], int size, int pos)
{
    // Convert 1-based position to 0-based index
    pos = pos - 1;

    // Shift elements to the left
    for (int i = pos; i < size - 1; i++)
    {
        arr[i] = arr[i + 1];
    }
}

int main()
{
    int n, pos;

    // Input size of array
    scanf("%d", &n);

    int arr[n];

    // Input array elements
    for (int i = 0; i < n; i++)
    {
        scanf("%d", &arr[i]);
    }

    // Input position to delete
    scanf("%d", &pos);

    printf("Before deleting the element:\n");
    for (int i = 0; i < n; i++)
    {
        printf("%d ", arr[i]);
    }

    // Function call
    DeleteElementAtGivenPosition(arr, n, pos);

    printf("\nAfter deleting the element:\n");
    for (int i = 0; i < n - 1; i++)
    {
        printf("%d ", arr[i]);
    }

    return 0;
}