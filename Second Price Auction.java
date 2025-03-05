//  Second-Price Auction
// time limit per test1 second
// memory limit per test256 megabytes
// In this problem we consider a special type of an auction, which is called the second-price auction. As in regular auction n bidders place a bid which is price a bidder ready to pay. The auction is closed, that is, each bidder secretly informs the organizer of the auction price he is willing to pay. After that, the auction winner is the participant who offered the highest price. However, he pay not the price he offers, but the highest price among the offers of other participants (hence the name: the second-price auction).

// Write a program that reads prices offered by bidders and finds the winner and the price he will pay. Consider that all of the offered prices are different.

// Input
// The first line of the input contains n (2 ≤ n ≤ 1000) — number of bidders. The second line contains n distinct integer numbers p1, p2, ... pn, separated by single spaces (1 ≤ pi ≤ 10000), where pi stands for the price offered by the i-th bidder.

// Output
// The single output line should contain two integers: index of the winner and the price he will pay. Indices are 1-based.

// Examples
// InputCopy
// 2
// 5 7
// OutputCopy
// 2 5
// InputCopy
// 3
// 10 2 8
// OutputCopy
// 1 8
// InputCopy
// 6
// 3 8 2 9 4 14
// OutputCopy
// 6 9
import java.util.*;
public class Main
{
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        PriorityQueue<Integer>que = new PriorityQueue<>((a,b)->b-a);
        for(int i = 0;i<n;i++){
            arr[i] = s.nextInt();
            que.offer(arr[i]);
        }
        int max = que.poll();
        int x = que.poll();
        int idx = 0;
        for(int i = 0;i<n;i++){
            if(max == arr[i]){
                idx = i;
            }
        }
        System.out.println(idx+1+" "+x);
	}
}