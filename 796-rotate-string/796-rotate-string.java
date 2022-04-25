class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        if(s.length()==0)
            return true;
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append(s);
        String so = sb.toString();
        if(so.contains(goal)){
            return true;
        }
        return false;
    }
}