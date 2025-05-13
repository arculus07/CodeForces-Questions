// Trippi Troppi resides in a strange world. The ancient name of each country consists of three strings. The first letter of each string is concatenated to form the country's modern name.

// Given the country's ancient name, please output the modern name.

// Input
// The first line contains an integer t
//  – the number of independent test cases (1≤t≤100
// ).

// The following t
//  lines each contain three space-separated strings. Each string has a length of no more than 10
// , and contains only lowercase Latin characters.

// Output
// For each test case, output the string formed by concatenating the first letter of each word.

// Example
// InputCopy
// 7
// united states america
// oh my god
// i cant lie
// binary indexed tree
// believe in yourself
// skibidi slay sigma
// god bless america
// OutputCopy
// usa
// omg
// icl
// bit
// biy
// sss
// gba


import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine(); // Consume the newline after reading t
        for (int i = 0; i < t; i++) {
            String[] parts = scanner.nextLine().split(" ");
            StringBuilder modernName = new StringBuilder();
            for (String part : parts) {
                modernName.append(part.charAt(0));
            }
            System.out.println(modernName.toString());
        }
        scanner.close();
    }
}