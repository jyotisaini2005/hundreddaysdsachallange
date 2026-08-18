import java.util.Scanner;
class Main {

    public static void linearSearch(int arr[], int key) {

        int count = 0;
        boolean found = false;

        for(int i = 0; i < arr.length; i++) {

            count++;   // comparison count

            if(arr[i] == key) {
                System.out.println("Found at index " + i);
                found = true;
                break;
            }
        }

        if(found == false) {
            System.out.println("Not Found");
        }

        System.out.println("Comparisons = " + count);
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Array size
        int n = sc.nextInt();

        int arr[] = new int[n];

        // Array elements input
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Key input
        int key = sc.nextInt();

        // Function call
        linearSearch(arr, key);

        sc.close();
    }
}
    

