package life.toughjourney.community.dto;

import lombok.Data;

/**
 * @author YX
 * @version 1.0.0
 * @Description
 * @create 2020年01月29日 12:26:00
 */
@Data
public class CommentCreateDto {
    private Long parentId;
    private String content;
    private Integer type;

}
