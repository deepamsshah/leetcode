import java.util.*;
class chess {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Boolean s1 = true;
        int i,j;
        int num = s.nextInt();
        for( i=0;i<num;i++){
            for( j=0;j<num;j++){
                if(i%2==0){
                    if(s1){
                        System.out.print("W ");
                        s1=false;
                        if(j==num-1){
                            System.out.println();
                        }
                    }else{
                        System.out.print("B ");
                        s1=true;
                        if(j==num-1){
                            System.out.println();
                        }
                    }}else{
                    if(s1){
                        System.out.print("B ");
                        s1=false;
                        if(j==num-1){
                            System.out.println();
                        }
                    }else{
                        System.out.print("W ");
                        s1=true;
                        if(j==num-1){
                            System.out.println();
                        }
                    }
                }
            }
        }
    }
}