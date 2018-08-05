import java.util.Arrays;
import java.util.*;
import java.util.stream.*;

class Solution {
    protected static List<Character> prepareInput(String s) {
        List<Character> filtered = s.chars()
                                    .mapToObj(e->(char)e)
                                    .map(Character::toLowerCase)
                                    .filter(item-> item != ' ' && item != ':' && item != ',' && item != '.' && item != ';')
                                    .collect(Collectors.toList());
        return filtered;
    }
    
    public static boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return false;
        }
        List<Character> filtered = prepareInput(s);
        int size = filtered.size();
        for (int i = 0; i < (size/2); ++i) {
            if (filtered.get(i) != filtered.get(size - i - 1)) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        String testString = "Mr. Owl Ate My Metal Worm";
        System.out.println(isPalindrome(testString));
    }
}