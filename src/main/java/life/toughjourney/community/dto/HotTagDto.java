package life.toughjourney.community.dto;

import lombok.Data;

/**
 * @author YX
 * @version 1.0.0
 * @Description
 * @create 2020年02月01日 19:37:00
 */
@Data
public class HotTagDto implements Comparable {
    private String name;
    private Integer priority;


    @Override
    public int compareTo(Object o) {
        return this.getPriority() - ((HotTagDto) o).getPriority();
    }
}
