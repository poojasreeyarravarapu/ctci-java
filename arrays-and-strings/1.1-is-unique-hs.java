//Used hashset ds extra

/**Intuition is we tranverse to array of characters and add 
 * that to hashset if not present in the hashset else add it!
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        Set<Character> seen = new HashSet<>();

        for (char ch : inp.toCharArray()) {
            if (seen.contains(ch)) {
                System.out.println(false);
                return;
            }
            seen.add(ch);
        }

        System.out.println(true);
    }
}

//time complexity = O(n)
//space complexity = O(n)