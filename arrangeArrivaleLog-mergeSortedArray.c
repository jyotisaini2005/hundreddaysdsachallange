<<<<<<< HEAD
#include <stdio.h>

void SortedArray(int arr1[], int p, int arr2[], int q)
{
    int merged[p + q];

    int i = 0;
    int j = 0;
    int k = 0;

    // Compare both arrays and store smaller element
    while(i < p && j < q)
    {
        if(arr1[i] < arr2[j])
        {
            merged[k] = arr1[i];
            i++;
            k++;
        }
        else
        {
            merged[k] = arr2[j];
            j++;
            k++;
        }
    }

    // Copy remaining elements of arr1
    while(i < p)
    {
        merged[k] = arr1[i];
        i++;
        k++;
    }

    // Copy remaining elements of arr2
    while(j < q)
    {
        merged[k] = arr2[j];
        j++;
        k++;
    }

    // Print merged array
    printf("Merged Array: ");
    for(i = 0; i < p + q; i++)
    {
        printf("%d ", merged[i]);
    }
}

int main()
{
    int p, q;

    printf("Enter size of first array: ");
    scanf("%d", &p);

    int arr1[p];

    printf("Enter first sorted array: ");
    for(int i = 0; i < p; i++)
    {
        scanf("%d", &arr1[i]);
    }

    printf("Enter size of second array: ");
    scanf("%d", &q);

    int arr2[q];

    printf("Enter second sorted array: ");
    for(int i = 0; i < q; i++)
    {
        scanf("%d", &arr2[i]);
    }

    SortedArray(arr1, p, arr2, q);

    return 0;
=======
#include <stdio.h>

void SortedArray(int arr1[], int p, int arr2[], int q)
{
    int merged[p + q];

    int i = 0;
    int j = 0;
    int k = 0;

    // Compare both arrays and store smaller element
    while(i < p && j < q)
    {
        if(arr1[i] < arr2[j])
        {
            merged[k] = arr1[i];
            i++;
            k++;
        }
        else
        {
            merged[k] = arr2[j];
            j++;
            k++;
        }
    }

    // Copy remaining elements of arr1
    while(i < p)
    {
        merged[k] = arr1[i];
        i++;
        k++;
    }

    // Copy remaining elements of arr2
    while(j < q)
    {
        merged[k] = arr2[j];
        j++;
        k++;
    }

    // Print merged array
    printf("Merged Array: ");
    for(i = 0; i < p + q; i++)
    {
        printf("%d ", merged[i]);
    }
}

int main()
{
    int p, q;

    printf("Enter size of first array: ");
    scanf("%d", &p);

    int arr1[p];

    printf("Enter first sorted array: ");
    for(int i = 0; i < p; i++)
    {
        scanf("%d", &arr1[i]);
    }

    printf("Enter size of second array: ");
    scanf("%d", &q);

    int arr2[q];

    printf("Enter second sorted array: ");
    for(int i = 0; i < q; i++)
    {
        scanf("%d", &arr2[i]);
    }

    SortedArray(arr1, p, arr2, q);

    return 0;
>>>>>>> 31128666d01b5721a03fe43e899a23a37718a68e
}