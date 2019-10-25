import java.util.HashMap;

class RomanToDecimal {
    public static int romanToInt(String s) {
        int decimalInt = 0;
        HashMap<String,Integer> newMap = new HashMap<String,Integer>();
        newMap.put("IV",4);
        newMap.put("IX",9);
        newMap.put("XL",40);
        newMap.put("XC",90);
        newMap.put("CD",400);
        newMap.put("CM",900);

        int length = s.length();
        for(int i = 0;i<length;i++){
            System.out.println(s.charAt(i));
        }

        return decimalInt;
    }
    public static void main(String[] args){
        romanToInt("IVI");
    }
}