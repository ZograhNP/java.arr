import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int sum = 0;

        ArrayList<Integer> numers = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);

        for ( int i = 0; i < 10; i++) {
            System.out.print("Num: ");
            int num = sc.nextInt();
            numers.add(num);
        }

        for (int i = 0; i < numers.size(); i++) {
            if (numers.get(i) < 0) {
                sum+= numers.get(i);
            }
        }

        System.out.printf(String.valueOf(sum));
    }
}