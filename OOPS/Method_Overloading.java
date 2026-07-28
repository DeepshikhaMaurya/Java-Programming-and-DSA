package OOPS;

public class Method_Overloading {
    public static void main(String[] args) {
        Calculator cals = new Calculator();
        System.out.println(cals.sum(1, 2));
        System.out.println(cals.sum((float)1.5, (float)2.5));
        System.out.println(cals.sum(1, 2, 3));
    }
}

class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}
