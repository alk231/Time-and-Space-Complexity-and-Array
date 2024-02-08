public class SecondLargest {
    public static int secondLargest(int[]arr){
        if(arr.length<2){
            return 0;
        }
    
        int first = Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            first =Math.max(first,arr[i]);
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=first){
                second=Math.max(second,arr[i]);
            }
        }
        return second;
    }
    public static void main(String[] args) {
        int[]arr={34,21,54,65,43};
        
        System.out.println(secondLargest(arr));
    }
}

