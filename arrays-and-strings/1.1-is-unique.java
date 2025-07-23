import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        if (inp.length()<=1){
            System.out.println(true);
            return;
        }
        char c = inp.charAt(0);
        for(int i=1; i<inp.length(); i++){
            if (inp.charAt(i)==c){
                System.out.println(false);
                return;
            }
            c=inp.charAt(i);
        }
        System.out.println(true);
        return;
    }
}

//time complexity = O(n)
//space complexity = O(1)