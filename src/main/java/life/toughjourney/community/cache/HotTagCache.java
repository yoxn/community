package life.toughjourney.community.cache;

import life.toughjourney.community.dto.HotTagDto;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * @author YX
 * @version 1.0.0
 * @Description
 * @create 2020年02月01日 19:32:00
 */
@Component
@Data
public class HotTagCache {
    private List<String> hots = new ArrayList<>();

    public void updateTags(Map<String, Integer> tags) {
        int max = 10;
        PriorityQueue<HotTagDto> priorityQueue = new PriorityQueue<>(max);

        tags.forEach((name, priority) -> {
            HotTagDto hotTagDto = new HotTagDto();
            hotTagDto.setName(name);
            hotTagDto.setPriority(priority);
            if (priorityQueue.size() < max) {
                priorityQueue.add(hotTagDto);
            } else {
                HotTagDto minHot = priorityQueue.peek();
                if (hotTagDto.compareTo(minHot) > 0) {
                    priorityQueue.poll();
                    priorityQueue.add(hotTagDto);
                }
            }
        });

        List<String> sortedTags = new ArrayList<>();

        HotTagDto poll = priorityQueue.poll();
        while (poll != null) {
            sortedTags.add(0, poll.getName());
            poll = priorityQueue.poll();
        }
        hots = sortedTags;
    }
}
