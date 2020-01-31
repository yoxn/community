package life.toughjourney.community.dto;

import life.toughjourney.community.model.User;
import lombok.Data;

/**
 * @author YX
 * @version 1.0.0
 * @Description
 * @create 2020年01月30日 10:00:00
 */
@Data
public class CommentDto {
    private Long id;
    private Long parentId;
    private Integer type;
    private Long commentator;
    private Long gmtCreate;
    private Long gmtModified;
    private Long likeCount;
    private Integer commentCount;
    private String content;
    private User user;
}
