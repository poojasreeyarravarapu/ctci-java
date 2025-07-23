


//frequency
import java.util.*;
class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp1 = sc.nextLine();
        String inp2 = sc.nextLine();
        if (inp1.length() != inp2.length()){
            System.out.println(false);
            return;
        }
        Map<Character, Integer> hmap = new HashMap();
        for (int i=0; i<inp1.length(); i++){
            char ch = inp1.charAt(i);
            hmap.put(ch, hmap.getOrDefault(ch, 0)+1);
        }
        for (int i=0; i<inp2.length(); i++){
            if (!hmap.containsKey(inp2.charAt(i))){
                System.out.println(false);
                return;
            }
            hmap.put(inp2.charAt(i),hmap.get(inp2.charAt(i))-1);
            if (hmap.get(inp2.charAt(i))<0){
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
        
        return;
    }
}

//time complexity = O(n)
//space complexity = O(1) (ASCII) / O(n) (Unicode)
/**Scenario	Space Complexity
Only lowercase/uppercase/ASCII → bounded set  --->	O(1)
Arbitrary or Unicode characters   --->	O(k) where k is unique chars
Worst case (all chars unique)   --->	O(n) */
