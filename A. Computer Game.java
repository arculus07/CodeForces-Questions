// Monocarp is playing a computer game. Now he wants to complete the first level of this game.

// A level is a rectangular grid of 2
//  rows and n
//  columns. Monocarp controls a character, which starts in cell (1,1)
//  — at the intersection of the 1
// -st row and the 1
// -st column.

// Monocarp's character can move from one cell to another in one step if the cells are adjacent by side and/or corner. Formally, it is possible to move from cell (x1,y1)
//  to cell (x2,y2)
//  in one step if |x1−x2|≤1
//  and |y1−y2|≤1
// . Obviously, it is prohibited to go outside the grid.

// There are traps in some cells. If Monocarp's character finds himself in such a cell, he dies, and the game ends.

// To complete a level, Monocarp's character should reach cell (2,n)
//  — at the intersection of row 2
//  and column n
// .

// Help Monocarp determine if it is possible to complete the level.

// Input
// The first line contains a single integer t
//  (1≤t≤100
// ) — the number of test cases. Then the test cases follow. Each test case consists of three lines.

// The first line contains a single integer n
//  (3≤n≤100
// ) — the number of columns.

// The next two lines describe the level. The i
// -th of these lines describes the i
// -th line of the level — the line consists of the characters '0' and '1'. The character '0' corresponds to a safe cell, the character '1' corresponds to a trap cell.

// Additional constraint on the input: cells (1,1)
//  and (2,n)
//  are safe.

// Output
// For each test case, output YES if it is possible to complete the level, and NO otherwise.

// Example
// InputCopy
// 4
// 3
// 000
// 000
// 4
// 0011
// 1100
// 4
// 0111
// 1110
// 6
// 010101
// 101010
// OutputCopy
// YES
// YES
// NO
// YES
// Note
// Consider the example from the statement.

// In the first test case, one of the possible paths is (1,1)→(2,2)→(2,3)
// .

// In the second test case, one of the possible paths is (1,1)→(1,2)→(2,3)→(2,4)
// .

// In the fourth test case, one of the possible paths is (1,1)→(2,2)→(1,3)→(2,4)→(1,5)→(2,6)
// .

import java.util.*;

public class Main {
    static class Cell {
        int row, col;
        
        Cell(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }
    
    public static boolean canCompleteLevel(int n, char[][] grid) {
        Queue<Cell> queue = new LinkedList<>();
        boolean[][] visited = new boolean[2][n];
        
        queue.add(new Cell(0, 0)); // Start at (1,1) which is (0,0) in 0-based index
        visited[0][0] = true;
        
        int[] dr = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dc = {-1, 0, 1, -1, 1, -1, 0, 1};
        
        while (!queue.isEmpty()) {
            Cell current = queue.poll();
            int r = current.row, c = current.col;
            
            if (r == 1 && c == n - 1) return true; // Reached (2,n) which is (1, n-1)
            
            for (int i = 0; i < 8; i++) {
                int nr = r + dr[i];
                int nc = c + dc[i];
                
                if (nr >= 0 && nr < 2 && nc >= 0 && nc < n && !visited[nr][nc] && grid[nr][nc] == '0') {
                    visited[nr][nc] = true;
                    queue.add(new Cell(nr, nc));
                }
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            char[][] grid = new char[2][n];
            
            for (int i = 0; i < 2; i++) {
                grid[i] = sc.next().toCharArray();
            }
            
            System.out.println(canCompleteLevel(n, grid) ? "YES" : "NO");
        }
        
        sc.close();
    }
}