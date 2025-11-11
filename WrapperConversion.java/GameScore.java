public class GameScore {
    public static void main(String[] args) {

        Integer[] scores = {10, null, 20, 30, null};

        int nullCount = 0;
        int total = 0;

        for (Integer s : scores) {
            if (s == null) nullCount++;
            else total += s; 
        }

        System.out.println("Not Played = " + nullCount);
        System.out.println("Total Score = " + total);
    }
}
