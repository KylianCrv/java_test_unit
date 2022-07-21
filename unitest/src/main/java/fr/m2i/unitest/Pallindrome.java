package fr.m2i.unitest;

import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

public class Pallindrome {

    public static boolean isPalindrome(String phrase) {
        boolean flag = true;
        //Converts the given string into lowercase
        phrase = phrase.replaceAll(" ", "").toLowerCase();
        phrase = StringUtils.stripAccents(phrase);

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
