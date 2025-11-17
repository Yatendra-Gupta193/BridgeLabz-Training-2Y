import java.util.*;
interface MealPlan {
    String getMeal();
}
class VegetarianMeal implements MealPlan {
    public String getMeal() {
        return "Vegetarian Meal";
    }
}
class VeganMeal implements MealPlan {
    public String getMeal() {
        return "Vegan Meal";
    }
}
class KetoMeal implements MealPlan {
    public String getMeal() {
        return "Keto Meal";
    }
}
class HighProteinMeal implements MealPlan {
    public String getMeal() {
        return "High Protein Meal";
    }
}
class Meal<T extends MealPlan> {
    T meal;
    Meal(T meal) {
        this.meal = meal;
    }
    void showMeal() {
        System.out.println(meal.getMeal());
    }
}
class MealPlanGenerator {
    static <T extends MealPlan> Meal<T> generatePlan(T type) {
        return new Meal<>(type);
    }
    public static void main(String[] args) {

        Meal<VegetarianMeal> veg = generatePlan(new VegetarianMeal());
        Meal<VeganMeal> vegan = generatePlan(new VeganMeal());
        Meal<KetoMeal> keto = generatePlan(new KetoMeal());
        Meal<HighProteinMeal> hp = generatePlan(new HighProteinMeal());

        veg.showMeal();
        vegan.showMeal();
        keto.showMeal();
        hp.showMeal();
    }
}
