import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        System.out.println("Before: " + colors);
        Collections.swap(colors, 0, 2);
        System.out.println("After: " + colors);
    }
}