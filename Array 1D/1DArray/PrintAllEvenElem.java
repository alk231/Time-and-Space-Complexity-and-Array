class PrintAllEvenElem{
    public static void main(String[] args) {
        int []arr={34,21,54,65,43};
        for(int elem:arr){
            if(elem % 2==0){
                System.out.print(elem + " ");
            }
        }
    }
}