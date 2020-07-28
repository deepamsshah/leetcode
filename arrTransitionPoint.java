public class arrTransitionPoint
{
    static int transitionPoint(int arr[],int n)
    {
        int length = arr.length;
        int result = 0;
        for(int j=0;j<n;j++){
        for(int i=0;i<length-1;i++){
            if(arr[i]==0&arr[i+1]==1){
                result=i+1;
            }
        }
        }return result;
    }

    public static void main(String[] args) {
        int [] array = {0,0,0,0,1,1};
        System.out.println(transitionPoint(array,2));
    }
}
