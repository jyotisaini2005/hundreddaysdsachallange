public class missingElementInArray {
    int missingNum(int arr[]) {

        int n = arr.length + 1;   // kyunki array mein n-1 elements hain

        int totalSum = n * (n + 1) / 2;

        int arraySum = 0;

        for(int i = 0; i < arr.length; i++) {
            arraySum += arr[i];
        }

        return totalSum - arraySum;
    }
}
