import java.util.*;

public class Debug {
    public static <E> void print(List<E> l) {
        for(E o : l) {
            System.out.println(o);
        }
    }
    public static <E,F> void print(Map<E, List<F>> m) {
        for(E k : m.keySet()) {
            for(F o : m.get(k)) {
                System.out.println(k + " " + o);
            }
        }
    }
}
