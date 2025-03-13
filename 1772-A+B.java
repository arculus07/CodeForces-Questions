// A. A+B?
// time limit per test2 seconds
// memory limit per test512 megabytes
// You are given an expression of the form a+b
// , where a
//  and b
//  are integers from 0
//  to 9
// . You have to evaluate it and print the result.

// Input
// The first line contains one integer t
//  (1≤t≤100
// ) — the number of test cases.

// Each test case consists of one line containing an expression of the form a+b
//  (0≤a,b≤9
// , both a
//  and b
//  are integers). The integers are not separated from the +
//  sign.

// Output
// For each test case, print one integer — the result of the expression.

// Example
// InputCopy
// 4
// 4+2
// 0+0
// 3+7
// 8+9
// OutputCopy
// 6
// 0
// 10
// 17

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            String expr = s.next();
            System.out.println((expr.charAt(0) - '0') + (expr.charAt(2) - '0'));
        }
        s.close();
    }
}
