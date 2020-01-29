package life.toughjourney.community.exception;

/**
 * @author YX
 * @version 1.0.0
 * @Description
 * @create 2020年01月29日 09:49:00
 */
public class CustomizeException extends RuntimeException{
    private String message;

    public CustomizeException(ICustomizeErrorCode errorCode) {

        this.message = errorCode.getMessage();
    }

    public CustomizeException(String message) {

        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }


}
