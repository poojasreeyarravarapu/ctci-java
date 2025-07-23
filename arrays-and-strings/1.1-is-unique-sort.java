//Used Array ds extra

/**Intuition  Sorting: Using sorting based on ASCII values of characters checking adjacent characters!
 */

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp1 = sc.nextLine();
        char[] ch = inp1.toCharArray();
        Arrays.sort(ch);
        for (int i=0; i<ch.length-1; i++){
            if (ch[i] == ch[i+1]){
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
        return;
    }
}

//time complexity: O(nlogn)
//space complecity: O(n).... If you ignore input/output handling and focus on algorithmic
//  space (since string already exists), then you might consider it O(1) extra space, but
//  technically, since you're creating a copy of the input as a char array, it’s O(n).