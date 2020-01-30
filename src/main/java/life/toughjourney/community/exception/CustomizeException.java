package life.toughjourney.community.exception;

/**
 * @author YX
 * @version 1.0.0
 * @Description
 * @create 2020年01月29日 09:49:00
 */
public class CustomizeException extends RuntimeException{
    private String message;
    private Integer code;

    public CustomizeException(ICustomizeErrorCode errorCode) {
        this.code = errorCode.getCode();
        this.message = errorCode.getMessage();
    }

    @Override
    public String getMessage() {
        return message;
    }

    public Integer getCode() {
        return code;
    }
}
