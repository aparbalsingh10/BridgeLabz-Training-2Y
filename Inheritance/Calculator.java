interface Calculator {
    void calculator();
}

class BaseCalculator implements Calculator {
    public void calculate() {
        System.out.println("Base calculation");
    }
}
class DerivedCalculator implements Calculator {
    public void calculate() {
        System.out.println("Derived calculation");
    }
}
