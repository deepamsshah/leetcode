import java.util.ArrayList;
import java.util.Arrays;

public class MoviesInFlight {
    public static int[] test(int[] arr,int target){
        int best = 0;
        int[] pair = new int[]{0,0};

        int first,second;

        if(arr.length<2)
            return pair;

        for(int i=0;i<arr.length-1;++i){
            first = arr[i];
            for(int j=i+1;j<arr.length;++j){
                second = arr[j];
                if(first+second>target)
                    continue;
                else if (first+second > best){
                    best = first+second;
                    pair[0]=first;
                    pair[1]=second;
                }
            }
        }

        System.out.println(pair);
        return pair;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int d = 220;
        int [] nums =  new int [] {90, 85, 75, 60, 120, 150, 125};
        System.out.println(MoviesInFlight.test(nums, d));
    }
}