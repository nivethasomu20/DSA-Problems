
package day1;

import java.util.Arrays;

public class ValidAnagram{
    public static boolean validate(String src, String comp){
        if(src.length()!=comp.length()) return false;
        char[] srcArr = src.toCharArray();
        char[] compArr = comp.toCharArray();
        Arrays.sort(srcArr);
        Arrays.sort(compArr);
        return Arrays.equals(
            srcArr, compArr
        );
    }

    public static void main(String[] args) {
        System.out.println(validate("anagram", "nagaram"));
        System.out.println(validate("ant", "tan"));
        System.out.println(validate("madam", "mam"));
    }
}