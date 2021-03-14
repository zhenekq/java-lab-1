package project.eugene.vozny;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, FileNotFoundException {
        //write in file
        System.setOut(new PrintStream(new BufferedOutputStream(new FileOutputStream("stdout.log")), true));
        args = new String[]{
                "Apple/big", "Apple/small", "Apple/small",
                "Milk/1.4", "Cheese", "Cheese",
                "Milk/2.0","-calories", "-sort"
        };
        int amountOfCalories = 0;
        Food[] breakfast = new Food[20];
        int[] positionArray = new int[args.length];
        for(int itemIndex = 0;itemIndex<args.length; itemIndex++){
            positionArray[itemIndex] = 0;
            String[] parts = args[itemIndex].split("/");
            if(parts[0].equals("Cheese")){
                breakfast[itemIndex] = new Cheese();
                amountOfCalories+=breakfast[itemIndex].calculateCalories();
            }
            else if(parts[0].equals("Apple")) {
                breakfast[itemIndex] = new Apple(parts[1]);
                amountOfCalories+=breakfast[itemIndex].calculateCalories();
            }
            else if(parts[0].equals("Milk")) {
                breakfast[itemIndex] = new Milk(parts[1]);
                amountOfCalories+=breakfast[itemIndex].calculateCalories();
            }else if(parts[0].equals("-calories")){
                System.out.println("\nAmount of calories for this breakfast is: " + amountOfCalories + " calories\n");
            }else if(parts[0].equals("-sort")){
                Arrays.sort(breakfast,new FoodComparator());
            }
        }
        int counterOfProduct = 0;
        int index = 0;
        System.out.println("Amount of our products: ");
        for(int i=0;i<args.length;i++) {
            if(breakfast[i]==null)
                break;
            if (positionArray[i] == 0) {
                counterOfProduct = 0;
                for (int j = i; j < args.length; j++) {
                    if (breakfast[i].equals(breakfast[j])) {
                        counterOfProduct++;
                        positionArray[j] = 1;
                    }
                }
                System.out.println(++index+". "+breakfast[i] + " is: " + counterOfProduct);
            }
        }
        System.out.println("\nLet's have breakfast:");
        for(Food item: breakfast){
            if(item == null)
                break;
            item.consume();
        }
    }
}
