package template;

public abstract class CaffeineBeverageWithHook {


    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();

        //hook
        if(customerWantsCondiments()){
            addCondiments();
        }
    }

    public abstract void addCondiments();

    public  abstract void brew();

    private void pourInCup() {
        System.out.println("Pour In cup...");
    }

    private void boilWater() {
        System.out.println("Boiling water...");
    }

    boolean customerWantsCondiments(){
        return true;
    }
}
