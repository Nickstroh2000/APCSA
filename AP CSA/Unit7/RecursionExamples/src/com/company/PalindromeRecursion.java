package com.company;

import javax.swing.JOptionPane;

class PalindromeRecursion
{
    public static void main(String[] args)
    {
        String input = JOptionPane.showInputDialog( "Enter a string to check" );

        if(isPalindrome(input) == true )
        {
            System.out.println(input + " is a palindrome");
        }
        else
        {
            System.out.println(input + " is not a palindrome");
        }
    }

    public static boolean isPalindrome(String s)
    {
        // if length is 0 or 1 then String is palindrome
        // BASE CASE
        if (s.length() == 1 || s.length() == 0){
            return true;
        }

        /* check for first and last char of String using String.charAt(index)
         * if they are same then do the same thing for a substring
         * with first and last char removed. and carry on this
         * until you string completes or condition fails
         */
        // RECURSIVE CASE
        if (s.charAt(0) == s.charAt(s.length() - 1)){
            return isPalindrome(s.substring(1, s.length() - 1));
        }


        /* If program control reaches to this statement it means
         * the String is not palindrome hence return false.
         */
        return false;
    }
}

