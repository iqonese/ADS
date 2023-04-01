import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        System.out.println(fibonacci(x));
    }

    // problem 1
    // You are given a number “n” and an array of “n” elements,
    //write the function that returns minimum of them.
    public static int problem1(int[] array, int size) {

        return 0;
    }
    // problem 2
    //You are given a number “n” and an array of “n” elements,
    //write the function that returns average of them.
    public static double problem2(double[] array, int size) {
        return 0;
    }
    // problem 3
    //You are given a number “n”, write the function for checking
    //whether“n” is prime.
    public static String problem3(int number) {
        return "Prime";
    }

    // problem 4
    //You are given a number “n”, write the program using recursion for finding “n!”
    public static int factorial(int number) {
        if (number == 1) {
            return 1;
        }
        return factorial(number - 1) * number;
    }
    //problem 5
    //You are given a number “n”, write the function for finding n-th elements in Fibonacci sequence using recursion. (Fn = Fn-1+ Fn-2). F0= 0, F1 = 1.
    public static int fibonacci(int number) {
        if (number <= 2)  {
            return 1;
        }
        return fibonacci(number - 1) + fibonacci(number -2);
    }
    //problem 6
    //You are given numbers “a” and “n”, write the function that
    //returns “an”.
    public static int power(int a, int n) {
        return 1;
    }
    //problem 7
    //You are given a number “n” and an array of “n” elements,
    //write the program that returns given array in reverse order
    //without using array data structure.
//    public static


    //Problem 8.
    //You are given a string “s”, write the function for checking
    //whether “s” is all consists of digits.
    public static String problem8(String input) {
        return "Yes";
    }

    //Problem 9.
    //You are given numbers“n” and “k”,write the program that
    //finds Cn k (binomial coefficient) using formulaCn k =Cn−1
    //k−1+Cn−1
    //k where Cn 0 =Cn n =1.

    public static int problem9(int n, int k) {
        return 0;
    }

    //Problem 10.
    //You are given “a” and “b”, write the function for finding
    //GCD(a, b) using recursion. (Hint: Euclidean Algorithm)
    public static int problem10(int a, int b) {
        return 10;
    }

}
