package life.toughjourney.community.model;

import lombok.Data;

/**
 * @author YX
 * @version 1.0.0
 * @Description
 * @create 2020年01月26日 14:23:00
 */
@Data
public class User {
    private Integer id;
    private String name;
    private String accountId;
    private String token;
    private Long gmtCreate;
    private Long gmtModified;
    private String avatarUrl;


}
