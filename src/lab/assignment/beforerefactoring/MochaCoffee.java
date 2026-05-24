package lab.assignment.beforerefactoring;

public class MochaCoffee extends CoffeeTemplate{
    public void prepareMochaCoffee(){
        boilWater();
        brewEspresso();
        addIngredients();
        finalTouch();
        System.out.println(">>Serving coffee");
    }

    @Override
    protected void addIngredients(){
        System.out.println("Adding cocoa powder");
        System.out.println("Adding hot milk");
    }

    @Override
    protected void finalTouch(){
        System.out.println("Adding sugar");
    }
}
