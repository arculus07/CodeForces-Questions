// A robber has attempted to rob a bank but failed to complete his task. However, he had managed to open all the safes.

// Oleg the bank client loves money (who doesn't), and decides to take advantage of this failed robbery and steal some money from the safes. There are many safes arranged in a line, where the i-th safe from the left is called safe i. There are n banknotes left in all the safes in total. The i-th banknote is in safe xi. Oleg is now at safe a. There are two security guards, one of which guards the safe b such that b < a, i.e. the first guard is to the left of Oleg. The other guard guards the safe c so that c > a, i.e. he is to the right of Oleg.

// The two guards are very lazy, so they do not move. In every second, Oleg can either take all the banknotes from the current safe or move to any of the neighboring safes. However, he cannot visit any safe that is guarded by security guards at any time, becaues he might be charged for stealing. Determine the maximum amount of banknotes Oleg can gather.

// Input
// The first line of input contains three space-separated integers, a, b and c (1 ≤ b < a < c ≤ 109), denoting the positions of Oleg, the first security guard and the second security guard, respectively.

// The next line of input contains a single integer n (1 ≤ n ≤ 105), denoting the number of banknotes.

// The next line of input contains n space-separated integers x1, x2, ..., xn (1 ≤ xi ≤ 109), denoting that the i-th banknote is located in the xi-th safe. Note that xi are not guaranteed to be distinct.

// Output
// Output a single integer: the maximum number of banknotes Oleg can take.

// Examples
// InputCopy
// 5 3 7
// 8
// 4 7 5 5 3 6 2 8
// OutputCopy
// 4
// InputCopy
// 6 5 7
// 5
// 1 5 7 92 3
// OutputCopy
// 0
// Note
// In the first example Oleg can take the banknotes in positions 4, 5, 6 (note that there are 2 banknotes at position 5). Oleg can't take the banknotes in safes 7 and 8 because he can't run into the second security guard. Similarly, Oleg cannot take the banknotes at positions 3 and 2 because he can't run into the first security guard. Thus, he can take a maximum of 4 banknotes.

// For the second sample, Oleg can't take any banknotes without bumping into any of the security guards.

// <!-Brute Force Approach>
// import java.util.*;
// public class Main
// {
// 	public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         int a = s.nextInt();
//         int b = s.nextInt();
//         int c = s.nextInt();
//         int n = s.nextInt();
//         HashMap<Integer,Integer>map = new HashMap<>();
//         for(int i = 0;i<n;i++){
//             int x = s.nextInt();
//             map.put(x,map.getOrDefault(x,0)+1);
//         }
//         int count = 0;
//         for(int i = b+1;i<c;i++){
//             if(map.containsKey(i)){
//                 count+=map.get(i);
//             }
//         }
//         System.out.println(count);
// 	}
// }

import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int n = s.nextInt();
 
        int count = 0;
        for (int i = 0; i < n; i++) {
            int x = s.nextInt();
            if (x > b && x < c) {
                count++;
            }
        }
        
        System.out.println(count);
    }
}
