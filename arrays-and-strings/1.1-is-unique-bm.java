/**
 * Intuition behing this bit manipulation is
 * We all know that int has 32 bits but our alphabets has 25
 * only so we consider a bit for 1 alphabet
 * Step-1:
 * We iterate through every single character and get that index
 * i.e, a->0, b->1 and so on but how
 * a-a=0 for a it is 0 and b-a=1 for b it is 1 
 * ch - 'a' is that index
 * and we do bit masking
 * Step-2:
 * Check if that index bit is set or not i.e, bit is 1 or not
 * if it is set bit that means we already visited that so false
 * if not we make that bit = 1 => checker = checker | (1<<val);
 */
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        int checker = 0;
        for (int i=0; i<inp.length(); i++){
            int val = inp.charAt(i)-'a';
            if ((checker & (1<<val)) > 0){
                System.out.println(false);
                return;
            }
            checker = checker | (1<<val);
        }
        System.out.println(true);
        
        return;
    }
}

//time complexity = O(n)
//space complexity = O(1)