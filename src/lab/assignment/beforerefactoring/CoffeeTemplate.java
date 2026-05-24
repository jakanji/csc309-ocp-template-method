package lab.assignment.beforerefactoring;

public abstract class CoffeeTemplate {

    public final void boilWater() {
        System.out.println("Boiling water");
    }

    public final void brewEspresso() {
        System.out.println("Brewing espresso");
    }

    protected abstract void finalTouch();
    protected abstract void addIngredients();
}
