import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Character> a = new ArrayList<Character>();

        a.add(new Warrior("delli", 10, 4));
        a.add(new Warrior("islem", 9, 999999));
        a.add(new Warrior("dhya", 9, 5));
        a.add(new Warrior("gaston", 99999999, 9999999));
        System.out.println(a);
        System.out.println("--------------------------------");
        NameCreteira nc = new NameCreteira();
        Collections.sort(a, new AgeCreteira());
        System.out.println(a);
        System.out.println("--------------------------------");
        System.out.println(a);

    }

}
