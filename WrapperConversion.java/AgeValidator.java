public class AgeValidator {

    public static boolean isValid(String age) {
        try {
            int n = Integer.parseInt(age);
            return n >= 18;
        } catch (Exception e) {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isValid("21"));
        System.out.println(isValid("aa"));
    }
}
