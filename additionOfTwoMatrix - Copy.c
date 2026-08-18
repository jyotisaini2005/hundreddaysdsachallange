// Problem: Write a program to perform addition of two matrices having the same dimensions. The sum of two matrices is obtained by adding corresponding elements of the matrices.


#include <stdio.h>

int main()
{
    int m, n;

    scanf("%d %d", &m, &n);

    int arr1[3][4];
    int arr2[3][4];
    int result[3][4];

    // First matrix
    for(int i = 0; i < m; i++)
    {
        for(int j = 0; j < n; j++)
        {
            scanf("%d", &arr1[i][j]);
        }
    }

    // Second matrix
    for(int i = 0; i < m; i++)
    {
        for(int j = 0; j < n; j++)
        {
            scanf("%d", &arr2[i][j]);
        }
    }

    // Addition and printing
    for(int i = 0; i < m; i++)
    {
        for(int j = 0; j < n; j++)
        {
            result[i][j] = arr1[i][j] + arr2[i][j];

            printf("%d ", result[i][j]);
        }

        printf("\n");
    }

    return 0;
}