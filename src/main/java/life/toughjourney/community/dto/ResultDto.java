package life.toughjourney.community.dto;

import life.toughjourney.community.exception.CustomizeErrorCode;
import life.toughjourney.community.exception.CustomizeException;
import lombok.Data;

/**
 * @author YX
 * @version 1.0.0
 * @Description
 * @create 2020年01月29日 12:54:00
 */
@Data
public class ResultDto<T> {
    private Integer code;
    private String message;
    private T data;

    public static ResultDto errorOf(Integer code, String message) {
        ResultDto resultDto = new ResultDto();
        resultDto.setCode(code);
        resultDto.setMessage(message);
        return resultDto;
    }

    public static ResultDto errorOf(CustomizeErrorCode errorCode) {
        return errorOf(errorCode.getCode(),errorCode.getMessage());
    }

    public static ResultDto errorOf(CustomizeException e){
        return errorOf(e.getCode(),e.getMessage());
    }

    public static ResultDto okOf() {
        ResultDto resultDto = new ResultDto();
        resultDto.setCode(200);
        resultDto.setMessage("请求成功");
        return resultDto;
    }

    public static <T> ResultDto okOf(T t) {
        ResultDto resultDto = new ResultDto();
        resultDto.setCode(200);
        resultDto.setMessage("请求成功");
        resultDto.setData(t);
        return resultDto;
    }

}
