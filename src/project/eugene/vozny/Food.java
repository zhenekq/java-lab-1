package project.eugene.vozny;

public abstract class Food implements Consumable, Nutritious{
    private String name;
    private String size;

    public Food(String name) {
        this.name = name;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Food)) return false;
        if(name == null ||((Food)obj).name==null) return false;
        return name.equals(((Food)obj).name);
    }

    @Override
    public String toString(){
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
