import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases
        scanner.nextLine(); // Consume newline
        
        while (t-- > 0) {
            int n = scanner.nextInt(); // Width of the grid
            scanner.nextLine(); // Consume newline
            String s = scanner.nextLine(); // Given row of the grid
            
            StringBuilder result = new StringBuilder();
            
            for (char c : s.toCharArray()) {
                if (c == 'U') {
                    result.append('D');
                } else if (c == 'D') {
                    result.append('U');
                } else if (c == 'L') {
                    result.append('L');
                } else if (c == 'R') {
                    result.append('R');
                }
            }
            
            System.out.println(result.toString());
        }
        scanner.close();
    }
}
