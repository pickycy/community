package life.majiang.community.model;

import lombok.Data;

/**
 * Created by ACER on 2019/12/26.
 */
@Data
public class Question {
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

}
