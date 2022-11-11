import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        int res = 0;

        ArrayList<Integer> arrNums = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 6; i++) {
            System.out.print("Num: ");
            int num = sc.nextInt();
            arrNums.add(num);
        }

        for(int i = 0; i < arrNums.size(); i++) {

            if( arrNums.get(i) == 0 ) {

                for( int j = i + 1; j < arrNums.size(); j++) {
                    if( arrNums.get(j) == 0 ) {break;}

                    res = res + arrNums.get(j);
                }
                break;
            }
        }
        System.out.print(res);
    }
}