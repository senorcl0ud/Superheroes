package demolist;

import java.util.ArrayList;
import java.util.Iterator;

public class DemoArrayList {
    public static void main(String[] args) {
//        ArrayList<String> fruits = new ArrayList<>();
//        fruits.add("oranges");
//        fruits.add("apples");
//        fruits.add("bananas");
//
//
//        System.out.println(fruits.isEmpty());
//        System.out.println(fruits.lastIndexOf("oranges"));
//        System.out.println(fruits.contains("apples"));
//        fruits.remove("bananas");
//        System.out.println(fruits);
//        ArrayList<Integer> myNumbers = new ArrayList<>();
////        System.out.println(myNumbers.isEmpty());
//        myNumbers.add(10);
//        myNumbers.add(1);
//        myNumbers.add(100);
//        myNumbers.add(9);
//
//        Iterator<Integer> myNums = myNumbers.iterator();
//        while(myNums.hasNext()){
//            Integer result = myNums.next();
//            System.out.println(result);
//        }



        Person claude = new Person("claude");
        Person dwayne = new Person("dwayne");
        Person jermaine = new Person("jermaine");
        Person zamir = new Person("zamir");
        Person jojo = new Person("jojo");
        Person isaiah = new Person("isaiah");
        Person manny = new Person("ammanuel");

        ArrayList<Person> classmates = new ArrayList<>();
        classmates.add(claude);
        classmates.add(dwayne);
        classmates.add(jermaine);
        classmates.add(zamir);
        classmates.add(jojo);
        classmates.add(isaiah);
        classmates.add(manny);

//        for (Person student : classmates){
////            System.out.println(student);
////        }
 
        Iterator<Person> students = classmates.iterator();
        while(students.hasNext()){
            Person result = students.next();
            System.out.println(result);
        }





    }
}
