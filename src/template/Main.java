package template;

public class Main {
    public static void main(String[] args) {

        CaffeineBeverage coffee = new Coffee();
        coffee.prepareRecipe();
        System.out.println("*************************");
        CaffeineBeverageWithHook coffee2 = new CoffeeWithHook();
        coffee2.prepareRecipe();

    }
}