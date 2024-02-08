public class P4 {
    public static void main(String[] args) {
        int [][]arr={{1,2,4,0},{2,5,7,-1},{4,2,6,9}};
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(max<arr[i][j]){
                    max = arr[i][j];
                }
            }
        }
        System.out.println(max);
    }
}
