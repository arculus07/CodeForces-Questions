// One of the SWERC judges has a dog named Boy. Besides being a good competitive programmer, Boy loves fresh air, so she wants to be walked at least twice a day. Walking Boy requires 120
//  consecutive minutes. Two walks cannot overlap, but one can start as soon as the previous one has finished.


// Boy before and after getting ACCEPTED on this problem.

// Today, the judge sent n
//  messages to the SWERC Discord server. The i
// -th message was sent ai
//  minutes after midnight. You know that, when walking Boy, the judge does not send any messages, but he can send a message right before or right after a walk. Is it possible that the judge walked Boy at least twice today?

// Note that a day has 1440
//  minutes, and a walk is considered to happen today if it starts at a minute s≥0
//  and ends right before a minute e≤1440
// . In that case, it must hold that e−s=120
//  and, for every i=1,2…,n
// , either ai≤s
//  or ai≥e
// .

// Input
// Each test contains multiple test cases. The first line contains an integer t
//  (1≤t≤100
// ) — the number of test cases. The descriptions of the t
//  test cases follow.

// The first line of each test case contains an integer n
//  (1≤n≤100
// ) — the number of messages sent by the judge.

// The second line of each test case contains n
//  integers a1,a2,…,an
//  (0≤a1<a2<⋯<an<1440
// ) — the times at which the messages have been sent (in minutes elapsed from midnight).

// Output
// For each test case, output one line containing YES
//  if it is possible that Boy has been walked at least twice, and NO
//  otherwise.

// Example
// InputCopy
// 6
// 14
// 100 200 300 400 500 600 700 800 900 1000 1100 1200 1300 1400
// 12
// 100 200 300 400 600 700 800 900 1100 1200 1300 1400
// 13
// 100 200 300 400 500 600 700 800 900 1100 1200 1300 1400
// 13
// 101 189 272 356 463 563 659 739 979 1071 1170 1274 1358
// 1
// 42
// 5
// 0 1 2 3 4
// OutputCopy
// NO
// YES
// NO
// YES
// YES
// YES
// Note
// In the first test case, the judge has sent a message at each time multiple of 100
//  (excluding 0
// ). It is impossible that he has walked Boy even once.

// In the second test case, the times are the same as above, but 500
//  and 1000
//  are missing. The judge could have walked Boy, for instance, during the time intervals [440,560]
//  and [980,1100]
// . The situation is illustrated in the picture below, where the walks are represented by green intervals.



// In the third test case, the times are the same as in the first test case, but 1000
//  is missing. The judge could have walked Boy at most once.

// In the fourth test case, Boy could have been walked during the time intervals [739,859]
//  and [859,979]
// .
import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int i = 0; i < t; i++) {
            int n = s.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = s.nextInt();
            }
            if (canWalkTwice(arr, n)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
 
    public static boolean canWalkTwice(int[] arr, int n) {
        int count = 0;
 
        if (arr[0] >= 120) {
            int m = arr[0]/120;
            count+=m;
        }
        for (int i = 1; i < n; i++) {
            int gap = arr[i] - arr[i - 1];
            count += gap / 120;
            if (count >= 2) return true;
        }
 
        if (arr[n - 1] <= 1320) {
            count+=(1440-arr[n-1])/120;
        }
 
        return count >= 2;
}
}