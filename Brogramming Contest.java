// One day after waking up, your friend challenged you to a brogramming contest. In a brogramming contest, you are given a binary string∗
//  s
//  of length n
//  and an initially empty binary string t
// . During a brogramming contest, you can make either of the following moves any number of times:

// remove Ssome suffix†
//  from s
//  and pSlace it at the end of t
// , or
// remove some suffix from t
//  and place it at the end of s
// .
// To win the brogramming contest, you must make the minimum number of moves required to make s
//  contain only the character 0
//  and t
//  contain only the character 1
// . Find the minimum number of moves required.
// ∗
// A binary string is a string consisting of characters 0
//  and 1
// .

// †
// A string a
//  is a suffix of a string b
//  if a
//  can be obtained from deletion of several (possibly, zero or all) elements from the beginning of b
// .

// Input
// The first line contains an integer t
//  (1≤t≤100
// ) — the number of test cases.

// The first line of each test case is an integer n
//  (1≤n≤1000
// ) — the length of the string s
// .

// The second line of each test case contains the binary string s
// .

// The sum of n
//  across all test cases does not exceed 1000
// .

// Output
// For each testcase, output the minimum number of moves required.

// Example
// InputCopy
// 5
// 5
// 00110
// 4
// 1111
// 3
// 001
// 5
// 00000
// 3
// 101
// OutputCopy
// 2
// 1
// 1
// 0
// 3
// Note
// An optimal solution to the first test case is as follows:

// s=00110
// , t=
//  empty string.
// s=00
// , t=110
// .
// s=000
// , t=11
// .
// It can be proven that there is no solution using less than 2
//  moves.

// In the second test case, you have to move the whole string from s
//  to t
//  in one move.

// In the fourth test case, you don't have to do any moves.



import java.util.*;
public class Main{
    public static void main(String[] arhs){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i =0;i<n;i++){
            int a = s.nextInt();
            String str = s.next();
            int x = solve(str);
            System.out.println(x);
        }
    }
    public static int solve(String str){
        int count = 0;
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)!=str.charAt(i+1))count++;
        }
        return str.charAt(0)=='1'?count+1:count;
    }
}