class Solution {
    public boolean isValid(String s) {
        Stack<Character> sk = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'){
                sk.push('a');
            }
            else if(s.charAt(i)=='b'){
                if(sk.size()<1||sk.peek()=='b')
                    return false;
                else
                    sk.push('b');
            }
            else if(s.charAt(i)=='c'){
                if(sk.size()<2||sk.peek()=='a'){
                    return false;
                }
                sk.pop();
                sk.pop();
            }
        }
        if(sk.size()==0)
            return true;
        else 
            return false;
    }
}