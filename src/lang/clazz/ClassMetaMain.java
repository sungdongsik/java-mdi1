package lang.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassMetaMain {
    public static void main(String[] args) throws Exception {
        // Class 조회
        //Class clazz = String.class;
        Class clazz = new String().getClass();
        /*Class clazz1 = new String().getClass(); // 인스턴스에서 조회
        Class clazz2 = Class.forName("java.lang.String"); // 문자열 조회*/

        // 모든 필드 출력 가능하다
        Field[] declaredFields = clazz.getDeclaredFields();

        for(Field a : declaredFields){
            System.out.println("field: " + a.getType() + "name: " + a.getName());
        }

        //모든 메서드 출력
        Method[] declaredMethods = clazz.getDeclaredMethods();

        for(Method a : declaredMethods){
            System.out.println("a: " + a);
        }

        System.out.println("Supper: " + clazz.getSuperclass().getName());

        // 인터페이스 정보 출력
        Class[] interfaces = clazz.getInterfaces();

        for(Class i : interfaces){
            System.out.println("i: " + i);
        }
    }
}
