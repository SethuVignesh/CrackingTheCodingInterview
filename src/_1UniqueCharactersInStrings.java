//Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures

public class _1UniqueCharactersInStrings {

    public static void main(String[] args) {
        String a = "ORANGE";
        String b = "zapplez";

        System.out.println(b + "isUnique()" + isUniqueChars(a));
    }

    // unicode values from A-Z = 65- 90
    // unicode values for a-z= 97-122


    //O(n) space
    private static boolean isUnique(String str) {
        boolean[] arr = new boolean[58];
        char[] charArray = str.toCharArray();

        for (char ch : charArray) {
            if (arr[ch - 'a'] != true)
                arr[ch - 'a'] = true;
            else
                return false;
        }
        return true;
    }

    // O(1) space
    private static boolean isUniqueChars(String str) {
        int checker = 0;
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i) - 'a'; // find the value by subtracting the the a
            if ((checker & (1 << val)) > 0) {
                return false;
            }
            checker |= (1 << val);
        }
        return true;
    }
}
