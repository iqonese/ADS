# Task 1: 
You are given a number “n” and an array of “n” elements, write the function that returns minimum of them.
`int`
```
public static int problem1(int[] array, int size) {
        if (size == 0 ) {
            return array[0];
        }
        int current = problem1(array, size - 1);
        return Math.min(current, array[size-1]);
    }
```


# 
