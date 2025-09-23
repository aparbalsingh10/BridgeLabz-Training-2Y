class Base {
    public void calculate() {
        System.out.println("Base calculation");
    }
}
class Derived extends Base {
    @Override
    public void calculate() {
        super.calculate();
        System.out.println("Derived calculation");
    }
}
class Base {
    public void calculate() {
        System.out.println("Base new calculation");
    }
}
