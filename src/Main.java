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
    public static boolean checkPrime(int n) {
        // Trial Division Test
        return checkPrime(n, 3);
    }

    public static boolean checkPrime(int n, int currDivisor) {

        // base case for 0 and 1
        if (n < 2) {
            return false;
        }
        // base case to check whether the number is even
        if (n % 2 == 0) {
            // if it is 2 -> true, else -> false
            return (n == 2);
        }

        // base case to terminate the program
        if (currDivisor * currDivisor > n) {
            return true;
        }
        // base case to check for division
        if (n % currDivisor == 0) {
            return false;
        }
        // Check for next odd number
        return checkPrime(n, currDivisor + 2);
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
    public static int power(int a, int n) {
        // base case: if the power is 0, we know the result is 1
        if (n == 0) {
            return 1;
        }
        return power(a, n -1) * a;
    }

    //problem 7
    public static void reverseArray(int[] arr, int start, int end) {
        // two-pointer method, when two pointers meet, we terminate the call
        if (start >= end) {
            return;
        }
        // method to swap two instances
        // temporary variable to hold the starting index of the array
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseArray(arr, start + 1, end - 1);
    }


    //Problem 8.
    public static boolean isDigits(String s) {
        // Base case: if the string is empty, it's valid
        if (s.isEmpty()) {
            return true;
        }
        // Recursive case: check if the first character is a digit
        else {
            char firstChar = s.charAt(0);
            if (Character.isDigit(firstChar)) {
                // If the first character is a digit, check the rest of the string
                String restOfTheString = s.substring(1);
                return isDigits(restOfTheString);
            }
        }
        // If the first character is not a digit, the string is invalid
        return false;
    }

    //Problem 9.
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
