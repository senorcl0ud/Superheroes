package demolist;

import java.util.ArrayList;

public class DemoArrayList {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("oranges");
        fruits.add("apples");
        fruits.add("bananas");


        System.out.println(fruits.isEmpty());
        System.out.println(fruits.lastIndexOf("oranges"));
        System.out.println(fruits.contains("apples"));
        fruits.remove("bananas");
        System.out.println(fruits);
    }
}
