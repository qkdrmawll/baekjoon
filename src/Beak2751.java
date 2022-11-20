import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Beak2751 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = sc.nextInt();
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i=0;i<N;i++){
            nums.add(sc.nextInt());
        }

        Collections.sort(nums);

        for(int n : nums){
            sb.append(n).append("\n");
        }
        System.out.println(sb);
    }


}
