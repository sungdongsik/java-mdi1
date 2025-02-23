package enumeration.test.http;

public enum HttpStatus {
    OK(200, "OK"), BAD_REQUEST(400, "BAD_REQUEST"), NOT_FOUNT(404, "NOT_FOUNT"), INTERNAL_SERVER_ERROR(500, "INTERNAL_SERVER_ERROR")
    ;

    private final int code;

    private final String message;

    HttpStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public boolean isSuccess(){
        return code >= 200 && code <= 299;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public static HttpStatus findByCode(int code){
        HttpStatus[] values = values();

        for (HttpStatus httpStatus : values){
            if(httpStatus.code == code){
                return httpStatus;
            }
        }

        return null;
    }
}
