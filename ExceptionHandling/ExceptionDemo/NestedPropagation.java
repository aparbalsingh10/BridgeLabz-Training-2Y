public class NestedPropagation {

    public static void methodB() {
        try {
            Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println("Handled in methodB: " + e.getMessage());
        }
        String s = null;
        s.length();   
    }

    public static void methodA() {
        try {
            methodB();
        } catch (Exception e) {
            System.out.println("Handled in methodA: " + e);
        }
    }
    public static void main(String[] args) {
        methodA();
    }
}
