package Function_Methods;
import java.util.*;
public class PS19 {
    public static void printHelloWorld() {
        System.out.println("Hello World");
        System.out.println("Hello World");
        
    }
public static void calculateSum() {
      Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("sum is : " + sum);
}

        public static void swap(int a, int b){
            int temp = a;
            a = b;
            b = temp;      
        }


public static  int multiply(int a, int b){
int product = a*b;
return product;
}

        public static int factorial(int n ) {
            int f = 1;
            for(int i = 1; i<=n; i++) {
                f = f * i;
            }
            return f;
        }
        

        // public static boolean isPrime(int n ){
        //     boolean isPrime = true;
        //     for(int i=2; i<=n-1; i++) {
        //         if(n % i == 0){
        //             isPrime = false;
        //             break;
        //         }
        //     }
        //     return isPrime;
        // }


        public static boolean isPrime(int n) {
            if(n == 2) {
                return true;
            }

            for(int i=2; i<=Math.sqrt(n); i++) {
                if(n % i == 0){
                    return false;
                }
            }
            return true;
        }
         

        public static void binToDec(int binNum){
            int myNum = binNum;
            int pow = 0;
            int decNum = 0;

            while(binNum > 0){
                int lastDigit = binNum % 10;
                decNum = decNum + (lastDigit * (int)Math.pow(2, pow));
                pow++;
                binNum = binNum/10;
            }
            System.out.println("decimal of " + myNum +" = " + decNum);
        }


        public static void decToBin(int n){
            int myNum = n;
            int pow = 0;
            int binNum = 0;

            while(n > 0){
                int rem = n % 2;
                binNum = binNum + (rem * (int)Math.pow(10, pow));
                pow++;
                n = n/2;
            }
            System.out.println("binary form of " + myNum + " = "+ binNum);
        }
        public static void main(String[] args) {
        decToBin(7);
}}
