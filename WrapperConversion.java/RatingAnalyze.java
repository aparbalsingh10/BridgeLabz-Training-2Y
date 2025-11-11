import java.util.*;

public class RatingAnalyze {
    public static void main(String[] args) {

        int[] oldRatings = {4, 5, 3};
        ArrayList<Integer> newRatings = new ArrayList<>(
                Arrays.asList(5, null, 4, 3));

        ArrayList<Integer> all = new ArrayList<>();

        for (int r : oldRatings) all.add(r);
        for (Integer r : newRatings) if (r != null) all.add(r);

        double sum = 0;
        for (Integer r : all) sum += r;

        double avg = sum / all.size();

        System.out.println("Average Rating = " + avg);
    }
}
