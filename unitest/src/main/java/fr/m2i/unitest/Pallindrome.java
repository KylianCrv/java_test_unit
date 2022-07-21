package fr.m2i.unitest;

import java.util.Scanner;

public class Pallindrome {

    public static void main(String[] args) {
        String string = "kayak";
        System.out.println(isPalindrome(string));
    }

    public static boolean isPalindrome(String phrase) {
        boolean flag = true;
        //Converts the given string into lowercase
        phrase = phrase.toLowerCase();

        //Iterate the string forward and backward, compare one character at a time
        //till middle of the string is reached
        for (int i = 0; i < phrase.length() / 2; i++) {
            if (phrase.charAt(i) != phrase.charAt(phrase.length() - i - 1)) {
                flag = false;
                break;
            }
        }
        if (flag) {
            return true;
        } else {
            return false;
        }
    }
}
