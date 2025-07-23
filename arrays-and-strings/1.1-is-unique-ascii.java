/**Intuition
 * The maximum number of characters in the ASCII character set is 128.
 * 0-31 control chars (\n,\t like that)
 * 32-126 printable ones
 * 127 DEL
 * So the input string cant exceed with length 128 so initialize boolean char_set 
 * which initializes everything to false and then traversing to the string and 
 * making it true if it is already true then return false
 */

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        if (inp.length()>128){
            System.out.println(false);
            return;
        }
        boolean ch[] = new boolean[128];
        for(int i=0; i<inp.length(); i++){
            int val = inp.charAt(i);
            if (ch[val]){
            
                System.out.println(false);
                return;
            }
            ch[val]=true;
            
        }
        System.out.println(true);
        return;
    }
}

//time complexity = O(n)
//space complexity = O(1) as 128 constant space only