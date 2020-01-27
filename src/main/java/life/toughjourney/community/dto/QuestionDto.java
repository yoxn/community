package life.toughjourney.community.dto;

import life.toughjourney.community.model.User;
import lombok.Data;

/**
 * @author YX
 * @version 1.0.0
 * @Description
 * @create 2020年01月27日 17:04:00
 */
@Data
public class QuestionDto {
        private Integer id;
        private String title;
        private String description;
        private String tag;
        private Long gmtCreate;
        private Long gmtModified;
        private Integer creator;
        private Integer viewCount;
        private Integer commentCount;
        private Integer likeCount;
        private User user;
}
