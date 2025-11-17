class Animal { }
class Dog extends Animal { }
class Cat extends Animal { }

class AnimalUtil {
    public static void printAnimals(List<? extends Animal> animals) {
        for (Animal a : animals) System.out.println(a.getClass().getSimpleName());
    }
}

public class TestAnimals {
    public static void main(String[] args) {
        List<Dog> dogs = Arrays.asList(new Dog(), new Dog());
        List<Cat> cats = Arrays.asList(new Cat(), new Cat());

        AnimalUtil.printAnimals(dogs);
        AnimalUtil.printAnimals(cats);
    }
}
