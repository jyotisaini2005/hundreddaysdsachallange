<<<<<<< HEAD
class RemoveElementInArray {
    public int removeElement(int[] nums, int val) {

        int k = 0;   // valid elements ko rakhne ke liye pointer

        for(int i = 0; i < nums.length; i++) {

            if(nums[i] != val) {

                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}
=======
class RemoveElementInArray {
    public int removeElement(int[] nums, int val) {

        int k = 0;   // valid elements ko rakhne ke liye pointer

        for(int i = 0; i < nums.length; i++) {

            if(nums[i] != val) {

                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}
>>>>>>> 31128666d01b5721a03fe43e899a23a37718a68e
