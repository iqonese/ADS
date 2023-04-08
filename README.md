# Laboratory Work 1
## Task 1: 
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
## Task 2: 
You are given a number “n” and an array of “n” elements, write the function that returns average of them.\
`array` - array to work \
`index` - size of array \
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
## Task 3: 
## Task 4: 
## Task 5: 
## Task 6: 
## Task 7: 
## Task 8: 
## Task 9: 
## Task 10: 
