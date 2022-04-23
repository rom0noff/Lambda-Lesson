package uz.Lambda.project3;

import uz.Lambda.project3.model.LessonInterface;

public class MainPolly {
    public static void main(String[] args) {

        LessonInterface lessonInterface = (nums) -> {
            int max = nums[0];
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > max) {
                    max = nums[i];
                }
            }
            System.out.println(max);
        };
        int [] num = {2, 4, 1, 6, 12};
        lessonInterface.max(num);



    }
}
