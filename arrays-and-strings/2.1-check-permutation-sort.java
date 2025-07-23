/**Method 1 (Use Sorting) 
1) Sort both strings 
2) Compare the sorted strings  */

//frequency
import java.util.*;
class Main {
    public static String sort(String s){
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp1 = sc.nextLine();
        String inp2 = sc.nextLine();

        if (inp1.length() != inp2.length()){
            System.out.println(false);
            return;
        }
        System.out.println(sort(inp1).equals(sort(inp2)));
        
        return;
    }
}

//time complexity = O(nlogn)
//space complexity = O(n)