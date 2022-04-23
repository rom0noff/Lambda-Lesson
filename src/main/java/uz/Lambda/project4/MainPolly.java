package uz.Lambda.project4;

import uz.Lambda.project4.modle.LessonInterface;

public class MainPolly {
    public static void main(String[] args) {

        LessonInterface lessonInterface = (nums, number) -> {
            for (int i = 0; i < nums.length; i++) {
                if(nums[i] == number){
                    return "Ha bor";
                } else return "Yoq";
            }


            return "";
        };


        int [] num = {23,1,4,22,543};
        System.out.println(lessonInterface.signYes(num, 2));
    }
}
