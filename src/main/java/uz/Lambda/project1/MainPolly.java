package uz.Lambda.project1;

import uz.Lambda.project1.model.LessonInterface;

public class MainPolly {
    public static void main(String[] args) {
        LessonInterface lessonInterface = (a) -> a > 0 ? "Musbat" : "Manfiy";
        testMetod(0,lessonInterface);

        System.out.println("=================================");

        LessonInterface hisob = num -> {
            if(num > 0){
                System.out.println("Musbat");
            } else if (num < 0) {
                System.out.println("Manfiy");
            }else System.out.println("Musbat ham Manfiy ham emas.");
            return "";
        };
        testMetod(0,hisob);

    }
    public static void testMetod(int a, LessonInterface hisobla){
        System.out.println(hisobla.sign(a));
    }
}
