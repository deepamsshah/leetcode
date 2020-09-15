import java.util.*;

public class raising {
    public static int raisingPower(List<Integer> Arr){
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<Arr.size()-1;i++){
            res.add((int)Math.pow(Arr.get(i),Arr.get(i+1)));
        }
        res.add(Arr.size()-1,  Arr.get(Arr.size()-1));
        return Collections.max(res);
    }
    public static void main(String[] args) {
        List<Integer> Arr = new ArrayList<>();
        Arr.add(3);
        Arr.add(5);
        Arr.add(4);
        Arr.add(2);
        System.out.println(raisingPower(Arr));

    }
}
