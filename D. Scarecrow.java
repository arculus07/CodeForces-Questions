// A crow is sitting at position 0
//  of the number line. There are n
//  scarecrows positioned at integer coordinates a1,a2,…,an
//  along the number line. These scarecrows have been enchanted, allowing them to move left and right at a speed of 1
//  unit per second.

// The crow is afraid of scarecrows and wants to stay at least a distance of k
//  ahead of the nearest scarecrow positioned at or before it. To do so, the crow uses its teleportation ability as follows:

// Let x
//  be the current position of the crow, and let y
//  be the largest position of a scarecrow such that y≤x
// . If x−y<k
// , meaning the scarecrow is too close, the crow will instantly teleport to position y+k
// .
// This teleportation happens instantly and continuously. The crow will keep checking for scarecrows positioned at or to the left of him and teleport whenever one gets too close (which could happen at non-integral times). Note that besides this teleportation ability, the crow will not move on its own.

// Your task is to determine the minimum time required to make the crow teleport to a position greater than or equal to ℓ
// , assuming the scarecrows move optimally to allow the crow to reach its goal. For convenience, you are asked to output twice the minimum time needed for the crow to reach the target position ℓ
// . It can be proven that this value will always be an integer.

// Note that the scarecrows can start, stop, or change direction at any time (possibly at non-integral times).

// Input
// Each test contains multiple test cases. The first line contains the number of test cases t
//  (1≤t≤104
// ). The description of the test cases follows.

// The first line of each test case contains three integers n,k,ℓ
//  (1≤n≤2⋅105
// , 1≤k≤ℓ≤108
// ) — the number of scarecrows, the teleportation distance, and the target position of the crow, respectively.

// The second line of each test case contains n
//  integers a1,a2,…,an
//  (0≤a1≤a2≤…≤an≤ℓ
// ) — the initial positions of the n
//  scarecrows.

// It is guaranteed that the sum of n
//  over all test cases does not exceed 2⋅105
// .

// Output
// For each test case, output a single integer representing the twice the minimum time required for the crow to teleport to a position greater than or equal to ℓ
// .

// Example
// InputCopy
// 9
// 1 3 5
// 0
// 3 2 5
// 2 5 5
// 1 10 10
// 10
// 10 1 10
// 0 1 2 3 4 5 6 7 8 9
// 2 1 2
// 0 0
// 2 1 2
// 0 2
// 2 1 3
// 0 2
// 2 2 4
// 1 1
// 9 12 54
// 3 3 8 24 25 27 29 34 53
// OutputCopy
// 4
// 5
// 20
// 0
// 2
// 1
// 2
// 2
// 7
// Note
// In the first test case, the crow instantly teleports to position 3
//  due to the scarecrow at position 0
// . This scarecrow may then move to position 2
// , causing the crow to continuously move from position 3
//  to position 5
// , completing the trip in 2
//  seconds. Therefore, the output is 4
// .

// In the second test case, scarecrow 1
//  and scarecrow 2
//  can move to positions 0
//  and 3
// , respectively, in 2
//  seconds, while scarecrow 3
//  remains at position 5
// . The crow teleports to position 2
//  due to scarecrow 1
// . Then, scarecrow 1
//  moves to the right while scarecrow 2
//  and scarecrow 3
//  move to the left for 0.5
//  seconds. This causes the crow to continuously move from position 2
//  to position 2.5
//  due to scarecrow 1
//  moving right from position 0
// . After this half second, the scarecrows will be at positions 0.5,2.5,4.5
// . Scarecrow 2
// , now at position 2.5
// , causes the crow to instantly teleport to position 4.5
// , and scarecrow 3
//  at position 4.5
//  causes it to instantly teleport to position 6.5
// , which exceeds ℓ=5
// . Therefore, the crow finishes the trip in just 2.5
//  seconds, and the output is 5
// .

// It can be shown that these are the minimum possible times for both test cases.

import java.util.*;

public class Main {

    static final long MOD = 1000000007;
    static final long INF = 1000000000000000000L;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 1;
        t = sc.nextInt();

        while (t-- > 0) {
            solve(sc);
        }
        sc.close();
    }

    static void solve(Scanner sc) {
        int n = sc.nextInt();
        long k = sc.nextLong() * 2;
        long l = sc.nextLong() * 2;

        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong() * 2;
        }

        long time = 0;
        long pos = 0;
        int ptr = 0;

        time += a[0];
        a[0] = 0;
        pos = k;
        ptr = 1;

        while (pos < l && ptr < n) {
            if (Math.abs(a[ptr] - pos) <= time) {
                a[ptr] = pos;
            } else if (a[ptr] <= pos) {
                a[ptr] += time;
                pos = a[ptr] + k;
                ptr++;
                continue;
            } else {
                a[ptr] -= time;
            }

            long dist = a[ptr] - pos;

            // Ensure even difference
            if ((dist & 1) != 0) {
                throw new AssertionError("Distance is not even.");
            }

            time += dist / 2;
            a[ptr] -= dist / 2;
            pos = a[ptr] + k;
            ptr++;
        }

        if (pos < l) {
            time += l - pos;
        }

        System.out.println(time);
    }
}