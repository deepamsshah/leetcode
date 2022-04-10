class Solution {
    public int maximum69Number (int num) {
        StringBuilder sb = new StringBuilder();
        String n = Integer.toString(num);
        int f=0;
        boolean flag = false;
        for(int i =0;i<n.length();i++){
            if(n.charAt(i)=='6'){
                sb.append("9");
                f=i;
                flag=true;
                break;
            }else{
                sb.append(n.charAt(i));
            }
        }
        if(flag){
        for(int j=f+1;j<n.length();j++){
            sb.append(n.charAt(j));
        }}
        return Integer.parseInt(sb.toString());
    }
}