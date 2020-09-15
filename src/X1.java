import java.util.*;

public class X1 {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.remove(0);
        System.out.println(a.lastIndexOf(2));
    }
}
