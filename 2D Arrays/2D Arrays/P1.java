import java.util.*;
class P1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int arr[][]= new int[m][n];
        System.out.println("Enter the elements");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int posNum = 0;
        int negNum = 0;
        int oddNum = 0;
        int evenNum = 0;
        int numOfZero = 0;

        for(int i =0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j] % 2==0){
                    evenNum++;
                }
                if(arr[i][j] > 0){
                    posNum++;
                }
                if(arr[i][j]<0){
                    negNum++;
                }
                if(arr[i][j]%2 != 0){
                    oddNum++;
                }
                if(arr[i][j] == 0){
                    numOfZero++;
                }
            }
        }
        System.out.println("number of positive numbers = "+posNum);
        System.out.println("number of negative numbers = "+negNum);
        System.out.println("number of odd numbers = "+oddNum);
        System.out.println("number of even numbers = "+evenNum);
        System.out.println("number of 0 = "+numOfZero);
    }
}