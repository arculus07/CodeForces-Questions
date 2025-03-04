// Arkady's morning seemed to be straight of his nightmare. He overslept through the whole morning and, still half-asleep, got into the tram that arrived the first. Some time after, leaving the tram, he realized that he was not sure about the line number of the tram he was in.

// During his ride, Arkady woke up several times and each time he saw the tram stopping at some stop. For each stop he knows which lines of tram stop there. Given this information, can you help Arkady determine what are the possible lines of the tram he was in?

// Input
// The first line contains a single integer n
//  (2≤n≤100
// ) — the number of stops Arkady saw.

// The next n
//  lines describe the stops. Each of them starts with a single integer r
//  (1≤r≤100
// ) — the number of tram lines that stop there. r
//  distinct integers follow, each one between 1
//  and 100
// , inclusive, — the line numbers. They can be in arbitrary order.

// It is guaranteed that Arkady's information is consistent, i.e. there is at least one tram line that Arkady could take.

// Output
// Print all tram lines that Arkady could be in, in arbitrary order.

// Examples
// InputCopy
// 3
// 3 1 4 6
// 2 1 4
// 5 10 5 6 4 1
// OutputCopy
// 1 4 
// InputCopy
// 5
// 1 1
// 10 10 9 8 7 100 5 4 3 99 1
// 5 1 2 3 4 5
// 5 4 1 3 2 5
// 4 10 1 5 3
// OutputCopy
// 1 
// Note
// Consider the first example. Arkady woke up three times. The first time he saw a stop with lines 1
// , 4
// , 6
// . The second time he saw a stop with lines 1
// , 4
// . The third time he saw a stop with lines 10
// , 5
// , 6
// , 4
//  and 1
// . He can be in a tram of one of two lines: 1
//  or 4
// .

import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        Set<Integer> possibleLines = new HashSet<>();
        int r = scanner.nextInt();
        for (int i = 0; i < r; i++) {
            possibleLines.add(scanner.nextInt());
        }
        
        for (int i = 1; i < n; i++) {
            Set<Integer> currentStopLines = new HashSet<>();
            r = scanner.nextInt();
            for (int j = 0; j < r; j++) {
                currentStopLines.add(scanner.nextInt());
            }
            possibleLines.retainAll(currentStopLines);
        }
        
        List<Integer> result = new ArrayList<>(possibleLines);
        Collections.sort(result);
        
        for (int line : result) {
            System.out.print(line + " ");
        }
        
        scanner.close();
    }
}
