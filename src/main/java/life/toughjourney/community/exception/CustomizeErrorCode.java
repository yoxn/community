package life.toughjourney.community.exception;

/**
 * @author YX
 * @version 1.0.0
 * @Description
 * @create 2020年01月29日 10:01:00
 */
public enum CustomizeErrorCode implements ICustomizeErrorCode{
    QUESTION_NOT_FOUND("你找的问题不在了，要不要换个试试？");
    private String message;

    CustomizeErrorCode(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
