import java.util.*;

public class NaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= 4; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}