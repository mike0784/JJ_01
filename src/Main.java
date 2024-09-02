import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Integer maximum = 100;
        Integer minimum = 0;
        Integer range = 20;
        List<Integer> collection = new ArrayList<>();
        Random rn = new Random();
        for (int i =0; i < range; i++)
        {
            collection.add(rn.nextInt(maximum - minimum + 1) + minimum);
        }

        for (int i = 0; i < collection.size(); i++)
        {
            System.out.print(collection.get(i) + " ");
        }
        System.out.println();

        double sum = collection.stream()
                .mapToInt(n -> n)
                .filter(n->n%2 == 0)
                .average().orElse(0);
        System.out.println("Result=" + sum);

        
    }
}