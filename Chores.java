// Petya and Vasya are brothers. Today is a special day for them as their parents left them home alone and commissioned them to do n chores. Each chore is characterized by a single parameter — its complexity. The complexity of the i-th chore equals hi.

// As Petya is older, he wants to take the chores with complexity larger than some value x (hi > x) to leave to Vasya the chores with complexity less than or equal to x (hi ≤ x). The brothers have already decided that Petya will do exactly a chores and Vasya will do exactly b chores (a + b = n).

// In how many ways can they choose an integer x so that Petya got exactly a chores and Vasya got exactly b chores?

// Input
// The first input line contains three integers n, a and b (2 ≤ n ≤ 2000; a, b ≥ 1; a + b = n) — the total number of chores, the number of Petya's chores and the number of Vasya's chores.

// The next line contains a sequence of integers h1, h2, ..., hn (1 ≤ hi ≤ 109), hi is the complexity of the i-th chore. The numbers in the given sequence are not necessarily different.

// All numbers on the lines are separated by single spaces.

// Output
// Print the required number of ways to choose an integer value of x. If there are no such ways, print 0.

// Examples
// InputCopy
// 5 2 3
// 6 2 3 100 1
// OutputCopy
// 3
// InputCopy
// 7 3 4
// 1 1 9 1 1 1 1
// OutputCopy
// 0
// Note
// In the first sample the possible values of x are 3, 4 or 5.

// In the second sample it is impossible to find such x, that Petya got 3 chores and Vasya got 4.

import java.util.*;
public class Main
{
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a = s.nextInt();
        int b = s.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<arr.length;i++){
            arr[i] = s.nextInt();
        }    
        PriorityQueue<Integer>que = new PriorityQueue<>();
        for(int i:arr)que.offer(i);
        int x = 0;
        for(int i = 0;i<b;i++){
            x = que.poll();
        }
        if(x>que.peek())System.out.println(0);
        else System.out.println(que.peek()-x);
	}
}