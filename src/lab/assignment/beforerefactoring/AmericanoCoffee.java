package lab.assignment.beforerefactoring;

public class AmericanoCoffee extends CoffeeTemplate{
    public void prepareAmericano(){
        boilWater();
        brewEspresso();
        addIngredients();
        finalTouch();
        System.out.println(">>Serving coffee");
    }

    @Override
    protected void finalTouch(){
        System.out.println("Add sugar and cream");
    }
    @Override
    protected void addIngredients(){
        System.out.println("Add more hot water");
    }
}
