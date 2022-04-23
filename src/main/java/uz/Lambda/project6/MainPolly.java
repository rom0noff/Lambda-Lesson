package uz.Lambda.project6;

import uz.Lambda.project6.model.SumOdd;

public class MainPolly {
    public static  int sum = 0;
    public static void main(String[] args) {

        SumOdd sumOdd = nums -> {
            for (int i = 0; i < nums.length; i++) {
                if(nums[i] > 0){
                    sum += nums[i];
                }
            }
            System.out.println(sum );
        };
        int [] num = {-1,-2,3,4,-5,6,-7};
        sumOdd.sumOdd(num);
    }

}
