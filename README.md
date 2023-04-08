# Laboratory Work 1
## Task 1: Minimum
You are given a number “n” and an array of “n” elements, write the function that returns minimum of them. \
`array` - array to work \
`size ` - size of the array \
**Explanation**: recursively iterate the array with decreasing `size` and compare it with the previous index of `array` till the index is `0` \
**Base case**: when `size` is `0`, `array[0]` is returned.
```
public static int findMin(int[] array, int size) {
        if (size == 0 ) {
            return array[0];
        }
        int current = problem1(array, size - 1);
        return Math.min(current, array[size-1]);
    }
```
## Task 2: Average
You are given a number “n” and an array of “n” elements, write the function that returns average of them.\
`array` - array to work \
`index` - index of the last element of array, `size - 1` \
`currentSum` - current sum of the array at each recursive call \
**Explanation**: even though `array` is of type `int`, as average can be `double`, our function is of type `double`. We add the current index of the array to the previous response of the recursive call and divide to `(index + 1)`. 
```
public static double findAverage(int[] array, int index) {
        if (index == 0) {
            return (double)array[0];
        }
        double currentSum = findAverage(array, index - 1) * index + array[index];
        return currentSum / (index + 1);
    }
```
## Task 3: Prime
`public static boolean checkPrime(int n, int currDivisor)` - a function to check for the wished attribute. Calls recursively until `currDivisor` exceeds `n` squared.\
**Base Cases**: `false` for: numbers below `2`, all other numbers that are divisible by `2` except `2` itself. `return (n == 2);` takes care of that. If somewhere `n * n > currDivisor` happens, we can be assured that the number is prime by **Trial Division Test**.\
**Recursive Call**: `return checkPrime(n, currDivisor + 2);` - increment currDivisor by `2`, because we don't have to deal with even numbers.
## Task 4: Factorial
**Base Case**: call terminates if the number is `0` or `1`.\
**Recursive Call**: Multiplies current number to the Factorial Value of the previous number.
## Task 5: Fibonacci
**Base Case**: if `n` is `0` -> `return 0;`, if `n` is either `2` or `1` -> 'return 1;`.\
**Recursive Call**: Add 2 previous values
## Task 6: Power
`a`- number, `n` - power, degree.\
**Base Case:** if the power is `0`, result is always `1`.\
**Recursive Call:** multiply the number to result of previous call.
## Task 7: Rearrange
Method to swap 2 indexes of `arr`.
```
int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
```
## Task 8: 
**Base Cases:**
```
if (s.isEmpty()) {
            return true;
        }
```
```
char firstChar = s.charAt(0);
```
**Base case:** if `string[0]` is not a digit.
```
return false;
```
## Task 9: Binomial Coefficient
Formula of Binomial Coefficient
```
return binom(n -1 , k - 1) + binom(n-1, k);
```
## Task 10: 
Euclidean Algorithm
```
return problem10(b, remainder);
```
**Base Case:** `(remainder == 0)`
