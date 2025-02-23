package enumeration.test.http;

import java.util.Scanner;


public class HttpStatusMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("HTTP CODE: ");
        int httpCodeInput = scanner.nextInt();

        HttpStatus status = HttpStatus.findByCode(httpCodeInput);

        if(status == null){
            System.out.println("정의 되지 않은 코드입니다.");
        }else {
            System.out.println(status.getCode() + " " + status.getMessage());
            System.out.println(status.isSuccess() + " ");
        }
    }
}
