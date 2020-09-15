import java.util.*;
public class prime {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String number1 = s.nextLine();
        System.out.println(number1);
        String list = s.nextLine();
        String[] arrOfStr = list.split(" ");
        int number = Integer.parseInt(number1);
        int[] numList = new int[number];
        for(int i = 0;i < arrOfStr.length;i++)
        {
            numList[i] = Integer.parseInt(arrOfStr[i]);
        }
        for(int j=0;j<numList.length;j++){
        boolean flag = false;
            for(int k = 2; k <= numList[j]/2; ++k){
                if(numList[j] % k == 0){
                    flag = true;
                    break;
                }
            }
            if (!flag)
                System.out.print("Prime ");
            else
                System.out.print("Composite ");
        }
    }

}
