package project.eugene.vozny;

import java.util.Comparator;

public class FoodComparator implements Comparator<Food> {

    public int compare(Food arg0, Food arg1){
        if(arg0 == null) return 1;
        if(arg1 == null) return -1;
        if(arg0.getName().length() < arg0.getName().length())
            return 1;
        else if(arg0.getName().length() > arg1.getName().length())
            return -1;
        else
            return 0;
    }
}
