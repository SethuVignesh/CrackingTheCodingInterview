package ArraysAndStrings;

//Implement an algorythm to determine if a string has all unique characters. what if you cannot use additional ds

public class UniqueCharacters {

    public static void main(String[] args) {
        String str="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String str2="Aa";

        System.out.println(Integer.toBinaryString(-32));//
        System.out.println(Integer.toBinaryString(0));
//        printIntValue();
        isUnique(str2);
    }

    private static void printIntValue(String str) {
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i) - 'a';
            System.out.println((int)str.charAt(i) + " = " + val);

        }
    }

    private static boolean isUnique(String str) {
        int checker = 0;
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i) - 'a';
            System.out.println(val);
//            System.out.println(val);
//            if ((checker & (1 << val)) > 0) {
//                return false;
//            }
            checker |= (1 << val);
            System.out.println(str.charAt(i)+" = "+ (int)str.charAt(i)+" = "+Integer.toBinaryString(checker));
        }
        return true;
    }

}
