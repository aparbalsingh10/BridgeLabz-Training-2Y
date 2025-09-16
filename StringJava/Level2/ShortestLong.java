import java.util.*;
public class ShortestLong{
    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }
    public static String[] splitWords(String text) {
        int length = getLength(text);
        int spaceCount = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceCount++;
            }
        }
        String[] words = new String[spaceCount + 1];
        int wordIndex = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < length; i++) {
            char c = text.charAt(i);
            if (c == ' ') {
                words[wordIndex++] = sb.toString();
                sb.setLength(0);
            } else {
                sb.append(c);
            }
        }
        words[wordIndex] = sb.toString();
        return words;
    }
    public static String[][] getWordsWithLength(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getLength(words[i]));
        }
        return result;
    }
    public static int[] findShortestLongest(String[][] wordData) {
        int shortestIndex = 0, longestIndex = 0;

        for (int i = 1; i < wordData.length; i++) {
            int currentLen = Integer.parseInt(wordData[i][1]);
            if (currentLen < Integer.parseInt(wordData[shortestIndex][1])) {
                shortestIndex = i;
            }
            if (currentLen > Integer.parseInt(wordData[longestIndex][1])) {
                longestIndex = i;
            }
        }
        return new int[] {shortestIndex, longestIndex};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a text ");
        String text = sc.nextLine();

        String[] words = splitWords(text);
        String[][] wordData = getWordsWithLength(words);
        int[] result = findShortestLongest(wordData);

        System.out.println("\nWord\tLength");
        for (String[] row : wordData) {
            System.out.println(row[0] + "\t" + row[1]);
        }

        System.out.println("\nShortest word: " + wordData[result[0]][0] + " (Length " + wordData[result[0]][1] + ")");
        System.out.println("Longest word: " + wordData[result[1]][0] + " (Length " + wordData[result[1]][1] + ")");
    }
}
