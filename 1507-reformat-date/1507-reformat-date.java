class Solution {
    public String reformatDate(String date) {
    HashMap<String,Integer> hm = new HashMap<>();
        hm.put("Jan",1);
        hm.put("Feb",2);
        hm.put("Mar",3);
        hm.put("Apr",4);
        hm.put("May",5);
        hm.put("Jun",6);
        hm.put("Jul",7);
        hm.put("Aug",8);
        hm.put("Sep",9);
        hm.put("Oct",10);
        hm.put("Nov",11);
        hm.put("Dec",12);
        String[] str = date.split(" ");
        StringBuilder sb = new StringBuilder();
        sb.append(str[2]).append("-");
        if(hm.get(str[1])<10){
            sb.append("0"+hm.get(str[1])).append("-");
        }else{
            sb.append(hm.get(str[1])).append("-");
        }
        String yo;
        if(Character.isDigit(str[0].charAt(1))){
            yo = str[0].substring(0,2);
        }else{
            yo = "0"+str[0].substring(0,1);
        }
        sb.append(yo);

        return sb.toString();
    }
}