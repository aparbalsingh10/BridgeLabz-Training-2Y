class Printer {
    void print(String msg) {
        System.out.println("Printer: " + msg);
    }
}
class ColorPrinter extends Printer {
    @Override
    void print(String msg) {
        System.out.println("Color Printer: " + msg);
    }
    void print(Object obj) {
        System.out.println("Object Printer: " + obj);
    }
}
