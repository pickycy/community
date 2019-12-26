package life.majiang.community.model;

import lombok.Data;

/**
 * Created by ACER on 2019/12/24.
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
