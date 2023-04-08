import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(fibonacci(0));
    }

    // problem 1
    public static int findMin(int[] array, int size) {
        if (size == 0 ) {
            return array[0];
        }
        int current = findMin(array, size - 1);
        return Math.min(current, array[size-1]);
    }
    // problem 2
    // return type is double, because average might be not int.
    public static double findAverage(int[] array, int index) {
        if (index == 0) {
            return (double)array[0];  // base case: the function reaches the start of the array
        }
        // currentSum holds the value of the current sum of each recursive call
        double currentSum = findAverage(array, index - 1) * index + array[index];
        // index is the index of last element, not size
        return currentSum / (index + 1);
    }
    // problem 3
    //You are given a number “n”, write the function for checking
    //whether“n” is prime.
    public static String problem3(int number) {
        return "Prime";
    }

    // problem 4
    public static int factorial(int number) {
        if (number == 1) {
            return 1; // base case
        }
        // previous member * current member
        return factorial(number - 1) * number;
    }
    //problem 5
    public static int fibonacci(int number) {
        // f(0) = 0
        if (number == 0) {
            return 0;
        }
        // f(1) and f(2) = 1
        else if (number <= 2)  {
            return 1;
        }
        // 2 previous members make up the current member
        return fibonacci(number - 1) + fibonacci(number -2);
    }
    //problem 6
    //You are given numbers “a” and “n”, write the function that
    //returns “an”.
    public static int power(int a, int n) {
        // base case: if the power is 0, we know the result is 1
        if (n == 0) {
            return 1;
        }
        return power(a, n -1) * a;
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
    public static int binom(int n, int k) {
        // base case
        if (k == 0 || k == n) {
            return 1;
        }
        // formula for binomial coefficient
        return binom(n -1 , k - 1) + binom(n-1, k);
    }
    public static int problem9(int n, int k) {
        return 0;
    }

    //Problem 10.
    // I used Euclidean algorithm
    public static int problem10(int a, int b) {
        int remainder = a % b;
        // We run the code until the remainder is 0, which is a base case
        if (remainder == 0) {
            return b;
        }
        // Formula of Euclidean algorithm
        return problem10(b, remainder);
    }

}
