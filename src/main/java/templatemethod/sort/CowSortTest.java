import java.util.Arrays;

/**
 * Created by Professional on 2018-01-17.
 */
public class CowSortTest {
    public static void main(String[] args) {
        Cow[] cows = {
                new Cow("Pepe", 8),
                new Cow("Dowy", 2),
                new Cow("Hory", 7),
                new Cow("Loui", 2),
                new Cow("Deny", 10),
                new Cow("Deby", 2)
        };

        System.out.println("Before sorting:");
        display(cows);

        Arrays.sort(cows);

        System.out.println("\nAfter sorting:");
        display(cows);
    }

    public static void display(Cow[] cows) {
        for (int i = 0; i < cows.length; i++) {
            System.out.println(cows[i]);
        }
    }
}
