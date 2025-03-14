// Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of candidates where the chosen numbers sum to target. You may return the combinations in any order.

// The same number may be chosen from candidates an unlimited number of times. Two combinations are unique if the frequency of at least one of the chosen numbers is different.

// The test cases are generated such that the number of unique combinations that sum up to target is less than 150 combinations for the given input.

 

// Example 1:

// Input: candidates = [2,3,6,7], target = 7
// Output: [[2,2,3],[7]]
// Explanation:
// 2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
// 7 is a candidate, and 7 = 7.
// These are the only two combinations.
// Example 2:

// Input: candidates = [2,3,5], target = 8
// Output: [[2,2,2,2],[2,3,3],[3,5]]
// Example 3:

// Input: candidates = [2], target = 1
// Output: []
 

// Constraints:

// 1 <= candidates.length <= 30
// 2 <= candidates[i] <= 40
// All elements of candidates are distinct.
// 1 <= target <= 40

// Beats 83% ✅ with ease , the most approachable solution with easy short explanation💯

// Ayush Ranjan
// 200 Days Badge 2024
// 0
// a few seconds ago
// Java
// This code finds all unique ways to get a given target sum using numbers from an array, where numbers can be chosen multiple times. It uses recursion (backtracking) to explore all possible combinations. The function solve starts with an empty list and tries adding numbers one by one, making sure the sum doesn’t exceed the target. If the sum matches the target, the current combination is stored in the result list. The loop ensures we don't go backward, preventing duplicate sets.

// For example, if candidates = [2,3,6,7] and target = 7, the function explores different paths: first picking 2 multiple times ([2,2,2,2] goes over 7, so backtracks), then trying [2,2,3] (which works). It also tries [7] directly since 7 is in the list. This way, it finds all valid combinations like [2,2,3] and [7] by systematically exploring and backtracking when needed.

// Code
class Solution {
    List<List<Integer>> result = new ArrayList<>();
    int M,N;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        M = candidates.length;
        N = target;
        List<Integer> list = new ArrayList<>();
        solve(candidates,list,0,0);
        return result;
    }
    public void solve(int[] arr,List<Integer>list,int index,int sum){
        if(sum == N){
            result.add(new ArrayList<>(list));
            return;
        }
        if(sum>N || index == M)return;
        for(int i = index;i<M;i++){
            list.add(arr[i]);
            solve(arr,list,i,sum+arr[i]);
            list.remove(list.size()-1);
        }
    }
}