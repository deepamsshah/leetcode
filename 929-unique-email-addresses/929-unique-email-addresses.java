class Solution {
         public int numUniqueEmails(String[] emails) {
      Set<String> uniqueEmail=new HashSet<String>();
      for(String email:emails){
          char tempEmail[]=email.toCharArray();
          StringBuffer newEmail=new StringBuffer();
          int i;
          for(i=0;tempEmail[i]!='@';i++){
              if(tempEmail[i]=='+'){
                  break;
              }else if(tempEmail[i]!='.'){
                  newEmail.append(tempEmail[i]);
              }
          }
          while(tempEmail[i]!='@'){
              i++;
          }
          while(i<email.length()) {
              newEmail.append(tempEmail[i]);
              i++;
          }
          uniqueEmail.add(newEmail.toString());
      }
      return uniqueEmail.size();
    }
}