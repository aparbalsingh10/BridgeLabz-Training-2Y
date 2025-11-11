public class MarksReports {
    public static void main(String[] args) {
        String[] marks = {"85", "95", "88", "null", "abc"};
        int sum = 0, count = 0;
        for (String m : marks) {
            try {
                int x = Integer.parseInt(m);
                sum += x;
                count++;
            } catch (Exception e) {
            }
        }
        double avg = (count == 0) ? 0 : sum / (double) count;

        System.out.println("Average Marks = " + avg);
    }
}
