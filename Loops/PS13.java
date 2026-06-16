package Loops;

import java.util.Scanner;

public abstract class PS13 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        do{
            System.out.print("enter your number : ");
            int n = sc.nextInt();

            if(n % 10 == 0) {
                continue;
            }
            System.out.println("number was : " + n);
        }while(true);
    }
}
