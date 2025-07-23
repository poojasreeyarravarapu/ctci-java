//integer array freq

public class Main {
    public static boolean isPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        int[] letters = new int[128]; // Assuming ASCII

        for (int i = 0; i < s1.length(); i++) {
            letters[s1.charAt(i)]++;
        }

        for (int i = 0; i < s2.length(); i++) {
            letters[s2.charAt(i)]--;
            if (letters[s2.charAt(i)] < 0) return false;
        }

        return true;
    }
}

//tc: O(n)
//sc: O(1)