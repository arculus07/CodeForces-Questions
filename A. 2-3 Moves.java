// You are standing at the point 0
//  on a coordinate line. Your goal is to reach the point n
// . In one minute, you can move by 2
//  or by 3
//  to the left or to the right (i. e., if your current coordinate is x
// , it can become x−3
// , x−2
// , x+2
//  or x+3
// ). Note that the new coordinate can become negative.

// Your task is to find the minimum number of minutes required to get from the point 0
//  to the point n
// .

// You have to answer t
//  independent test cases.

// Input
// The first line of the input contains one integer t
//  (1≤t≤104
// ) — the number of test cases. Then t
//  lines describing the test cases follow.

// The i
// -th of these lines contains one integer n
//  (1≤n≤109
// ) — the goal of the i
// -th test case.

// Output
// For each test case, print one integer — the minimum number of minutes required to get from the point 0
//  to the point n
//  for the corresponding test case.

// Example
// InputCopy
// 4
// 1
// 3
// 4
// 12
// OutputCopy
// 2
// 1
// 2
// 4

import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            System.out.println(minMinutes(n));
        }
    }
 
    private static int minMinutes(int n) {
        if (n == 1) {
            return 2;
        }
        int quotient = n / 3;
        int remainder = n % 3;
        if (remainder == 0) {
            return quotient;
        } else {
            return quotient + 1;
        }
    }
}