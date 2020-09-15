import java.util.ArrayList;
import java.util.List;

public class recentAdd {

    static List add (List list,int i){
        if (list.contains(i)){
            int index = list.indexOf(i);
            list.remove(index);
            list.add(i);
        }
        else {
            list.add(i);
        }
        return list;
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        System.out.println(add(list,1));
        System.out.println(add(list,2));
        System.out.println(add(list,3));
        System.out.println(add(list,1));
        System.out.println(add(list,2));

    }
}
