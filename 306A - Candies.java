// Candies
// time limit per test1 second
// memory limit per test256 megabytes
// Polycarpus has got n candies and m friends (n ≥ m). He wants to make a New Year present with candies to each friend. Polycarpus is planning to present all candies and he wants to do this in the fairest (that is, most equal) manner. He wants to choose such ai, where ai is the number of candies in the i-th friend's present, that the maximum ai differs from the least ai as little as possible.

// For example, if n is divisible by m, then he is going to present the same number of candies to all his friends, that is, the maximum ai won't differ from the minimum one.

// Input
// The single line of the input contains a pair of space-separated positive integers n, m (1 ≤ n, m ≤ 100;n ≥ m) — the number of candies and the number of Polycarpus's friends.

// Output
// Print the required sequence a1, a2, ..., am, where ai is the number of candies in the i-th friend's present. All numbers ai must be positive integers, total up to n, the maximum one should differ from the minimum one by the smallest possible value.

// Examples
// InputCopy
// 12 3
// OutputCopy
// 4 4 4 
// InputCopy
// 15 4
// OutputCopy
// 3 4 4 4 
// InputCopy
// 18 7
// OutputCopy
// 2 2 2 3 3 3 3 
// Note
// Print ai in any order, separate the numbers by spaces.




import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        while(a>0){
            int x = a/b;
            System.out.print(x+" ");
            a = a-x;
            b--;
        }
    }
}