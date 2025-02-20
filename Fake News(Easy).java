// Fake News (easy)
// time limit per test1 second
// memory limit per test256 megabytes
// As it's the first of April, Heidi is suspecting that the news she reads today are fake, and she does not want to look silly in front of all the contestants. She knows that a newspiece is fake if it contains heidi as a subsequence. Help Heidi assess whether the given piece is true, but please be discreet about it...

// Input
// The first and only line of input contains a single nonempty string s of length at most 1000 composed of lowercase letters (a-z).

// Output
// Output YES if the string s contains heidi as a subsequence and NO otherwise.

// Examples
// InputCopy
// abcheaibcdi
// OutputCopy
// YES
// InputCopy
// hiedi
// OutputCopy
// NO
// Note
// A string s contains another string p as a subsequence if it is possible to delete some characters from s and obtain p.

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        String t = "heidi";
        int i = 0;
        for(char c:str.toCharArray()){
            if(c == t.charAt(i) && i<t.length()){
                i++;
            }
            if(i == t.length()){
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}