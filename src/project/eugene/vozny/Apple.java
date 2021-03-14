package project.eugene.vozny;

public class Apple extends Food {

    private String size;

    @Override
    public String getSize() {
        return size;
    }

    @Override
    public void setSize(String size) {
        this.size = size;
    }

    public Apple(String size) {
        super("Apple");
        this.size = size;
    }

    @Override
    public void consume(){
        System.out.println(this + " has been eaten (" + calculateCalories() + " calories)");
    }

    public String toString(){
        return super.toString() + " '" + size.toUpperCase() + "'";
    }

    @Override
    public boolean equals(Object obj) {
        if(!super.equals(obj)) return false;
        if(!(obj instanceof Apple))return false;
        return size.equals(((Apple)obj).size);
    }

    @Override
    public int calculateCalories() {
        return 15;
    }
}
