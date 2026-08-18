<<<<<<< HEAD
#include <stdlib.h>

int* twoSum(int* nums, int numsSize, int target, int* returnSize)
{
    for(int i = 0; i < numsSize; i++)
    {
        for(int j = i + 1; j < numsSize; j++)
        {
            if(nums[i] + nums[j] == target)
            {
                int *ans = (int *)malloc(2 * sizeof(int));

                ans[0] = i;
                ans[1] = j;

                *returnSize = 2;

                return ans;
            }
        }
    }

    *returnSize = 0;
    return NULL;
=======
#include <stdlib.h>

int* twoSum(int* nums, int numsSize, int target, int* returnSize)
{
    for(int i = 0; i < numsSize; i++)
    {
        for(int j = i + 1; j < numsSize; j++)
        {
            if(nums[i] + nums[j] == target)
            {
                int *ans = (int *)malloc(2 * sizeof(int));

                ans[0] = i;
                ans[1] = j;

                *returnSize = 2;

                return ans;
            }
        }
    }

    *returnSize = 0;
    return NULL;
>>>>>>> 31128666d01b5721a03fe43e899a23a37718a68e
}