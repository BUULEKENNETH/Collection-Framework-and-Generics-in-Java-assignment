import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        System.out.println("Intitial list:" + fruits);
        System.out.println("Fruit at index 1: " + fruits.get(1));
        fruits.remove("Banana");
        System.out.println("Fruits after removal: " + fruits);
    }
}