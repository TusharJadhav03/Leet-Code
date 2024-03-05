package LeetCode;

import java.util.Scanner;

public class PalindromeNumber {
    
    public boolean isPalindrome(int num){

        if(num < 0)
            return false;

        int rev = 0;
        int x = num;

        while(num > 0){
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return rev == x;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int num = sc.nextInt();

        PalindromeNumber pn = new PalindromeNumber();
        System.out.println(pn.isPalindrome(num));
        sc.close();
    }
}
