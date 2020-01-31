package life.toughjourney.community.dto;

import lombok.Data;

import java.util.List;

/**
 * @author YX
 * @version 1.0.0
 * @Description
 * @create 2020年01月31日 11:35:00
 */
@Data
public class TagDto {
    private String categoryName;
    private List<String> tags;
}
