// Polycarp likes squares and cubes of positive integers. Here is the beginning of the sequence of numbers he likes: 1
// , 4
// , 8
// , 9
// , ....

// For a given number n
// , count the number of integers from 1
//  to n
//  that Polycarp likes. In other words, find the number of such x
//  that x
//  is a square of a positive integer number or a cube of a positive integer number (or both a square and a cube simultaneously).

// Input
// The first line contains an integer t
//  (1≤t≤20
// ) — the number of test cases.

// Then t
//  lines contain the test cases, one per line. Each of the lines contains one integer n
//  (1≤n≤109
// ).

// Output
// For each test case, print the answer you are looking for — the number of integers from 1
//  to n
//  that Polycarp likes.

// Example
// InputCopy
// 6
// 10
// 1
// 25
// 1000000000
// 999999999
// 500000000
// OutputCopy
// 4
// 1
// 6
// 32591
// 32590
// 23125

import java.util.Scanner;
 
public class PolycarpLikesNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            long n = scanner.nextLong();
            long squares = (long) Math.sqrt(n);
            long cubes = (long) Math.cbrt(n);
            long sixth = (long) Math.pow(n, 1.0 / 6);
            while (Math.pow(sixth + 1, 6) <= n) {
                sixth++;
            }
            long result = squares + cubes - sixth;
            System.out.println(result);
        }
        scanner.close();
    }
}