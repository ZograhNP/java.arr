import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int maxRes = 0;

        ArrayList<Integer> arrNums = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 6; i++) {
            System.out.print("Num: ");
            int num = sc.nextInt();
            arrNums.add(num);
        }

        for(int i = 0; i < arrNums.size(); i++) {

            if(maxRes < arrNums.get(i)) {maxRes = arrNums.get(i);}
        }
        System.out.print(maxRes);
    }
}