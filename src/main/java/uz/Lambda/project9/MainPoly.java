package uz.Lambda.project9;

import uz.Lambda.project9.model.Compare;

public class MainPoly {
    public static void main(String[] args) {

        Compare compare = (str1,str2) -> str1.contains(str2);
        System.out.println(compare.Cointer("Hello Java", "ava"));

        Compare com =  String::contains;
        System.out.println(com.Cointer("Salom java", "java"));
    }
}
