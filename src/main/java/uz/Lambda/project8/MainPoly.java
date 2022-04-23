package uz.Lambda.project8;

import uz.Lambda.project8.model.TubSon;

public class MainPoly {

    public static void main(String[] args) {

        int [] num = {1,2,3,4,5,6,7};

    }

    public static void Prime(int[] num){
        TubSon tubSon = nums -> {
            int sum = 0;
            for (int i = 0; i < nums.length; i++) {
                if(isPrime(nums[i])){
                    sum += nums[i];
                }

            }
            return sum;
        };
        System.out.println(tubSon.primer(num));

    }

    public static boolean isPrime(int number){
        if(number == 1) return false;
        for (int i = 2; i <= number/2; i++) {
            if(number % i == 0){
                return false;
            }

        }
        return true;
    }
}
