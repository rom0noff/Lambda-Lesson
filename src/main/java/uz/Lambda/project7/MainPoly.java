package uz.Lambda.project7;

import uz.Lambda.project7.model.EventSum;

public class MainPoly {
    public static int sum = 0;
    public static void main(String[] args) {

        EventSum eventSum = nums -> {
            for (int i = 0; i < nums.length; i++) {
                if(nums[i] % 2 != 0){
                    sum += nums[i];
                }
            }
            System.out.println("EventSum: "+ sum);
        };
        int [] num = {1,2,3,4,5,6,7};
        eventSum.eventSum(num);
    }
}
