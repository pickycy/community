package life.majiang.community.dto;

import lombok.Data;

/**
 * Created by ACER on 2019/12/24.
 */
@Data
public class AccessTokenDTO {
    private String client_id;
    private String client_secret;
    private String code;
    private String redirect_url;
    private String state;
}
