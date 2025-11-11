public class WrapperToPreemitive {
    public static void main(String[] args) {

        Double d = 45.67;

        double primitiveDouble = d;
        int primitiveInt = d.intValue();

        System.out.println("Double object: " + d);
        System.out.println("double primitive: " + primitiveDouble);
        System.out.println("int primitive: " + primitiveInt);
    }
}
