// A. Phone Code
// time limit per test2 seconds
// memory limit per test256 megabytes
// Polycarpus has n friends in Tarasov city. Polycarpus knows phone numbers of all his friends: they are strings s1, s2, ..., sn. All these strings consist only of digits and have the same length.

// Once Polycarpus needed to figure out Tarasov city phone code. He assumed that the phone code of the city is the longest common prefix of all phone numbers of his friends. In other words, it is the longest string c which is a prefix (the beginning) of each si for all i (1 ≤ i ≤ n). Help Polycarpus determine the length of the city phone code.

// Input
// The first line of the input contains an integer n (2 ≤ n ≤ 3·104) — the number of Polycarpus's friends. The following n lines contain strings s1, s2, ..., sn — the phone numbers of Polycarpus's friends. It is guaranteed that all strings consist only of digits and have the same length from 1 to 20, inclusive. It is also guaranteed that all strings are different.

// Output
// Print the number of digits in the city phone code.

// Examples
// InputCopy
// 4
// 00209
// 00219
// 00999
// 00909
// OutputCopy
// 2
// InputCopy
// 2
// 1
// 2
// OutputCopy
// 0
// InputCopy
// 3
// 77012345678999999999
// 77012345678901234567
// 77012345678998765432
// OutputCopy
// 12
// Note
// A prefix of string t is a string that is obtained by deleting zero or more digits from the end of string t. For example, string "00209" has 6 prefixes: "" (an empty prefix), "0", "00", "002", "0020", "00209".

// In the first sample the city phone code is string "00".

// In the second sample the city phone code is an empty string.

// In the third sample the city phone code is string "770123456789".

import java.util.*;
public class Main
{
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String str = s.next();
        for(int i = 1;i<n;i++){
            String str1 = s.next();
            str = solve(str,str1);
        }
        System.out.println(str.length());
	}
	public static String solve(String str1,String str2){
	    StringBuilder str = new StringBuilder();
	    for(int i = 0;i<str1.length();i++){
	        if(str1.charAt(i)==str2.charAt(i))str.append(str1.charAt(i)+"");
	        else break;
	        
	    }
	    return str.toString();
	}
}