class EvenIndicesSum{
    public static int evenIndicesSum(int[]arr){
        int sum =0 ;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
               sum+=arr[i];
            }
        }
        return sum;
    }
    public static void main(String args[]){
        int []arr={3,20,4,6,9};
        System.out.println(evenIndicesSum(arr));
    }
}