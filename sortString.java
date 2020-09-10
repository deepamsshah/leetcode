import java.util.*;

public class sortString {
    public static String sortString(String s) {
        int n = s.length();
        List<Integer> ls = new ArrayList<Integer>();

        for(int i=0;i<n;i++){
            ls.add(Integer.valueOf(s.charAt(i)));
        }

        System.out.println(ls);
        return "0";
    }

    public static void main(String[] args) {
        System.out.println(sortString("aaaabbbbcccc"));
    }
}
