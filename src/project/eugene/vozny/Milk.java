package project.eugene.vozny;

public class Milk extends Food{

    private String fat;

    public String getFat() {
        return fat;
    }

    public void setFat(String fat) {
        this.fat = fat;
    }

    public Milk(String fat) {
        super("Milk");
        this.fat = fat;
    }

    @Override
    public void consume() {
        System.out.println(this + "has been drunk (" + calculateCalories() + " calories)");
    }

    @Override
    public String toString(){
        return super.toString() + " with '" + fat + "%' fat content ";
    }

    @Override
    public boolean equals(Object obj) {
        if(!super.equals(obj)) return false;
        if(!(obj instanceof Milk))return false;
        return fat.equals(((Milk)obj).fat);
    }

    @Override
    public int calculateCalories() {
        return 6;
    }
}
