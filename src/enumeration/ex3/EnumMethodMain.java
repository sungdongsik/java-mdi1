package enumeration.ex3;

import java.util.Arrays;

public class EnumMethodMain {
    public static void main(String[] args) {

        // 모든 Enum 반환

        Gradle[] values = Gradle.values();
        System.out.println("Arrays.toString(values) = " + Arrays.toString(values));


        for(Gradle gradle : values){
            System.out.println("gradle = " + gradle.name() + "Option ->" + gradle.ordinal());
        }

        // String -> ENUM 변환
        String input = "GOLD";
        Gradle gold = Gradle.valueOf(input);
        System.out.println("gold:" + gold);
    }
}
