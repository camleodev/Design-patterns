package template;

/**
 * The Template Method Pattern defines the skeleton of an algorithm in a method, deferring some steps to subclasses.
 * TemplateMethod lets subclasses redefine certain steps of an algorithm without changing the algorithm's strycture
 */
public abstract class CaffeineBeverage {

    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    public abstract void addCondiments();

    public  abstract void brew();

    private void pourInCup() {
        System.out.println("Pour In cup...");
    }

    private void boilWater() {
        System.out.println("Boiling water...");
    }


}

