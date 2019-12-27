package life.majiang.community.dto;

import life.majiang.community.model.User;
import lombok.Data;

/**
 * Created by ACER on 2019/12/27.
 */
@Data
public class QuestionDto {
    private Integer id;
    private String title;
    private String description;
    private String tag;
    private Long gmtCreate;
    private Long gmtModified;
    private Integer Creator;
    private Integer viewCount;
    private Integer commentCount;
    private Integer likeCount;
    private User user;
}
