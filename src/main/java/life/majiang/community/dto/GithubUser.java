package life.majiang.community.dto;

import lombok.Data;

/**
 * Created by ACER on 2019/12/24.
 */
@Data
public class GithubUser {
    private String name;
    private Long id;
    private String bio;
    private String avatar_url;
}
