import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class phone {
    public static void main(String[] args) {
        String find = "(223)4567890";
        String find1 = "(223)456-7890";
        String find3 = "2234567890";
        String find4 = "223-456-7890";
        Pattern pattern = Pattern.compile("^\\([2-9]{1}[0-9]{2}\\)[0-9]{3}-[0-9]{4}$");
        Pattern pattern1 = Pattern.compile("\\d{10}|(?:\\d{3}-){2}\\d{4}|\\(\\d{3}\\)\\d{3}-?\\d{4}");
        Matcher matcher = pattern1.matcher(find);
        if (matcher.matches()){
            System.out.println("VALID");
            if(find.charAt(0)=='+'){
                char first = find.charAt(3);
                char second = find.charAt(4);
                char third = find.charAt(5);
                String areaCode = ""+first+second+third;
                System.out.println(areaCode);
            }else if(find.charAt(0)=='('){
                char first = find.charAt(1);
                char second = find.charAt(2);
                char third = find.charAt(3);
                String areaCode = ""+first+second+third;
                System.out.println(areaCode);
            }
        }else
        {
            System.out.println("INVALID");
            if(find.charAt(0)=='+'){
                char first = find.charAt(3);
                char second = find.charAt(4);
                char third = find.charAt(5);
                String areaCode = ""+first+second+third;
                System.out.println(areaCode);}
        }
    }
}
