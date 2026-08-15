package Recursion_1st_Part;

public class RecursionBasics {
    public static void printDec(int n) {
        if(n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }

    public static int calcSum(int n) {
        if(n == 1) {
            return 1;
        }
        int Snm1 = calcSum(n - 1);
        int Sn = n + Snm1;
        return Sn;
    }
        
    //Calculate nth term in fibonacci
    public static int fib(int n) {
        if(n == 0 || n == 1) {
            return n;
        }
        int fnm1 = fib(n-1); // 1
        int fnm2 = fib(n-2); // 2
        int fn = fnm1 + fnm2;
        return fn;
    }

    public static boolean isSorted(int arr[], int i) {
        if(i == arr.length-1) {
            return true;
        }
       if(arr[i] > arr[i+1]) {
        return false;
       }
       return isSorted(arr, i+1);
    }
    

    public static int firstOccurence(int arr[], int key, int i) {
        if(i == arr.length) {
            return -1;
        }
        if(arr[i] == key) {
            return i;
        }
        return firstOccurence(arr, key, i+1);
    }

    public static int lastOccurence(int arr[], int key, int i) {
        if(i == arr.length) {
            return -1;
        }
        int isFound = lastOccurence(arr, key, i+1);
        if(isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound; 
    }

    public static int power(int x, int n) {
        if(n == 0) {
            return 1;
        }
        return x * power(x, n-1);
    }
    public static void main(String[] args) {
        // int n = 10;
        //  printDec(n); 
        //  System.out.println();

        //  System.out.println(calcSum(n));
        //  System.out.println(fib(n));

        //  int arr[] = {1, 2, 3, 4};
        //  System.out.println(isSorted(arr, 0));

        //  int arr[] = {3,5,2,6,8,1};
        //  System.out.println(firstOccurence(arr, 5, 0));

        // int arr[] = {5, 5, 5, 5};
        // System.out.println(lastOccurence(arr, 5, 0));

        System.out.println(power(2, 10));
    }
}
