import java.util.*;

public class employeeStructure {


    public static HashMap set_manager(String A, String B, HashMap<String, String> employeeData, HashMap<String, List<String>> hierarchy){
        List check = hierarchy.get(A);

        if(check.contains(B)) {
        }else{
            check.add(B);
        }
        if(employeeData.containsKey(B)) {
        }else{
            employeeData.put(B,A);
        }
        return employeeData;
    }
    public void query_manager(String A, String B, HashMap<String, String> employeeData, HashMap<String, List<String>> hierarchy){

    }
    public boolean set_peer(String A, String B, HashMap<String, String> employeeData, HashMap<String, List<String>> hierarchy){
        return true;
    }

    public static void main(String[] args) {
        String A ="A";
        String B ="B";
        String C ="C";
        String D ="D";
        String E ="E";
        String F ="F";
        String G ="G";
        HashMap<String, String> employeeData = new HashMap<>();
        HashMap<String, List<String>> hierarchy = new HashMap<>();
        set_manager( C,  D, employeeData, hierarchy);
        System.out.println(employeeData);

    }
}
