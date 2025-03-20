// Cube is given an integer n
// . She wants to know how many ordered pairs of positive integers (a,b)
//  there are such that a=n−b
// . Since Cube is not very good at math, please help her!

// Input
// The first line contains an integer t
//  (1≤t≤99
// ) — the number of test cases.

// The only line of each test case contains an integer n
//  (2≤n≤100
// ).

// Output
// For each test case, output the number of ordered pairs (a,b)
//  on a new line.

// Example
// InputCopy
// 3
// 2
// 4
// 6
// OutputCopy
// 1
// 3
// 5
// Note
// In the first test case, the only ordered pair that works is (a,b)=(1,1)
// .

// In the second test case, the three ordered pairs of (a,b)
//  that work are (3,1),(2,2),(1,3)
// .


import java.util.Scanner;
 
public class OrderedPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases
 
        while (t-- > 0) {
            int n = scanner.nextInt(); // Input value of n
            System.out.println(n - 1); // Number of valid (a, b) pairs
        }
        scanner.close();
    }
}