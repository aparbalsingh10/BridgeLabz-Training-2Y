interface MealPlan { }
class VegetarianMeal implements MealPlan { }
class VeganMeal implements MealPlan { }
class KetoMeal implements MealPlan { }

class Meal<T extends MealPlan> {
    T plan;
    public Meal(T plan) { this.plan = plan; }
}

class MealUtil {
    public static <T extends MealPlan> void generatePlan(T plan) {
        System.out.println("Generated Plan: " + plan.getClass().getSimpleName());
    }
}

public class TestMeal {
    public static void main(String[] args) {
        generatePlan(new VegetarianMeal());
    }
}
