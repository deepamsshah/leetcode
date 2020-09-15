import java.util.*;

public class sortString {
    public static String sortString(String s) {
        int n = s.length();
        List<Integer> ls = new ArrayList<Integer>();
        List<Integer> res = new ArrayList<Integer>();

        for(int i=0;i<n;i++){
            ls.add(Integer.valueOf(s.charAt(i)));
        }
        Collections.sort(ls);
        System.out.println(ls);
        int val=96;
        for(int i =0;i<ls.size()-1;i++){
            for(int j=i+1;j<ls.size();j++){
                if()
            }
        }
        return "0";
    }

    public static void main(String[] args) {
        System.out.println(sortString("aaaabbbbcccc"));
    }
}
