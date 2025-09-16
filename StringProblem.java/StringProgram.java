import java.util.*;
class StringProgram {
    public static void countVowelsConsonants(String str) {
        str = str.toLowerCase();
        int vowels = 0, consonants = 0;
        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                if ("aeiou".indexOf(ch) != -1) vowels++;
                else consonants++;
            }
        }
        System.out.println("Vowels " + vowels + ", Consonants " + consonants);
    }
}
