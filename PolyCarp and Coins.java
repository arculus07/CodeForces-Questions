// A. Polycarp and Coins
// time limit per test1 second
// memory limit per test256 megabytes
// Polycarp must pay exactly n
//  burles at the checkout. He has coins of two nominal values: 1
//  burle and 2
//  burles. Polycarp likes both kinds of coins equally. So he doesn't want to pay with more coins of one type than with the other.

// Thus, Polycarp wants to minimize the difference between the count of coins of 1
//  burle and 2
//  burles being used. Help him by determining two non-negative integer values c1
//  and c2
//  which are the number of coins of 1
//  burle and 2
//  burles, respectively, so that the total value of that number of coins is exactly n
//  (i. e. c1+2⋅c2=n
// ), and the absolute value of the difference between c1
//  and c2
//  is as little as possible (i. e. you must minimize |c1−c2|
// ).

// Input
// The first line contains one integer t
//  (1≤t≤104
// ) — the number of test cases. Then t
//  test cases follow.

// Each test case consists of one line. This line contains one integer n
//  (1≤n≤109
// ) — the number of burles to be paid by Polycarp.

// Output
// For each test case, output a separate line containing two integers c1
//  and c2
//  (c1,c2≥0
// ) separated by a space where c1
//  is the number of coins of 1
//  burle and c2
//  is the number of coins of 2
//  burles. If there are multiple optimal solutions, print any one.

// Example
// InputCopy
// 6
// 1000
// 30
// 1
// 32
// 1000000000
// 5
// OutputCopy
// 334 333
// 10 10
// 1 0
// 10 11
// 333333334 333333333
// 1 2
// Note
// The answer for the first test case is "334 333". The sum of the nominal values of all coins is 334⋅1+333⋅2=1000
// , whereas |334−333|=1
// . One can't get the better value because if |c1−c2|=0
// , then c1=c2
//  and c1⋅1+c1⋅2=1000
// , but then the value of c1
//  isn't an integer.

// The answer for the second test case is "10 10". The sum of the nominal values is 10⋅1+10⋅2=30
//  and |10−10|=0
// , whereas there's no number having an absolute value less than 0
// .

import java.util.*;
public class Main
{
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i = 0;i<n;i++){
            int a = s.nextInt();
            int x = solve(a);
            System.out.println((a-(x*2))+" "+x);
        }
	}
	public static int solve(int n){
        int x = n%3;
        return (x/2 + n/3);
	}
}
