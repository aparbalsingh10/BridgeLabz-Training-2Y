import java.util.*;
class Animals {
    public static void main(String args[]){
    void eat() { System.out.println("Eating..."); }
}
class Mammal extends Animal {
    void walk() { System.out.println("Walking..."); }
}

class Dog extends Mammal {
    void bark() { System.out.println("Barking..."); }
}

class Puppy extends Dog {
    void weep() { System.out.println("Weeping..."); }
}
}
