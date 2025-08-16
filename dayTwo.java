public class dayTwo {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5};
        int n = arr.length+1;
        int total = (n * (n + 1 ))/2;
        int newSum = 0;
        for(int element : arr){
            newSum += element;
        }
        int result = total - newSum;

        System.out.println(result);
    }
}
