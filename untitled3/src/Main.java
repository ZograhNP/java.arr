import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();

        nums.add(1); nums.add(6); nums.add(8); nums.add(2); nums.add(1); nums.add(9); nums.add(8);

        for(int i = 0; i < nums.size(); ++i) {

            for(int j = i+1; j < nums.size(); j++){

                if (nums.get(i) == nums.get(j)){
                    nums.remove(j);

                }
            }
        }
        System.out.println(nums);
    }
}