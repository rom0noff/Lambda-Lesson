package uz.Lambda.project2;

import uz.Lambda.project2.model.LessonInterface;

public class MainPolly {
    public static void main(String[] args) {
        LessonInterface lessonInterface = (a,b) -> (a>=b) ? a : b;
        testMetod(3,4,lessonInterface);
    }
    public static void testMetod(int num1, int num2, LessonInterface hisobla){
        System.out.println(hisobla.MaxValue(num1,num2));
    }
}
