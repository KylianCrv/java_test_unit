package fr.m2i.unitest;

import org.apache.commons.lang3.StringUtils;

public class Pallindrome {

    public static boolean isPalindrome(String phrase) {

        phrase = phrase.toLowerCase();
        phrase = phrase.replaceAll(" ", "");
        phrase = StringUtils.stripAccents(phrase);

        int start = 0;
        int end = phrase.length() - 1;

        while (start < end) {
            if (phrase.charAt(start) != phrase.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}
