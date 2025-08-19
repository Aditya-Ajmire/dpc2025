import java.util.*;

public class dayFive {

    public static List<Integer> findLeaders(int[] arr) {
        if (arr == null || arr.length == 0) {
            return new ArrayList<>();
        }

        List<Integer> leaders = new ArrayList<>();
        int maxRight = arr[arr.length - 1];
        leaders.add(maxRight);

        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] >= maxRight) {
                maxRight = arr[i];
                leaders.add(maxRight);
            }
        }
        
        Collections.reverse(leaders);
        return leaders;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        List<Integer> leaderElements = findLeaders(arr);
        System.out.println("Leaders: " + leaderElements);

        sc.close();
    }
}
