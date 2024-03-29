package LeetCode;

import java.util.Scanner;

public class ValidPalindrome {

    public static boolean isPalindrome(String s) {

        String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String s = sc.nextLine();

        System.out.println(isPalindrome(s));
        

        sc.close();
    }
}
