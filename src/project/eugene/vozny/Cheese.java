package project.eugene.vozny;

public class Cheese extends Food {
    public Cheese(){
        super("Cheese");
    }
    public void consume(){
        System.out.println(this + " has been eaten (" + calculateCalories() + " calories)");
    }

    @Override
    public int calculateCalories() {
        return 20;
    }
}
