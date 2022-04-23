package uz.Lambda.project5;

import uz.Lambda.project5.model.LessonInterface;

import java.util.concurrent.atomic.AtomicInteger;

public class MainPolly {
    public static int sum;
    public static void main(String[] args) {

        LessonInterface lessonInterface = nums ->{
            for (int i = 0; i < nums.length; i++) {
                sum += nums[i];
            }
            System.out.println(sum);
        };
        int [] num = { 2,3,4,5};
        lessonInterface.sum(num);
    }
}
