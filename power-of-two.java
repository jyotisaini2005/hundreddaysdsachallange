<<<<<<< HEAD
class Solution {
    public boolean isPowerOfTwo(int n) {

        if (n <= 0) {
            return false;
        }

        while (n > 1) {
            if (n % 2 != 0) {
                return false;
            }

            n = n / 2;
        }

        return true;
    }
=======
class Solution {
    public boolean isPowerOfTwo(int n) {

        if (n <= 0) {
            return false;
        }

        while (n > 1) {
            if (n % 2 != 0) {
                return false;
            }

            n = n / 2;
        }

        return true;
    }
>>>>>>> 31128666d01b5721a03fe43e899a23a37718a68e
}