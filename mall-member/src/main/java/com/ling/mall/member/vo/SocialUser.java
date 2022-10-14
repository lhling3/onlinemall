package com.ling.mall.member.vo;

import lombok.Data;

/**
 * @Description: 社交用户信息
 * @Created: with IntelliJ IDEA.
 * @author Ling
 * @date 2022-04-28
 **/

@Data
public class SocialUser {

    private String access_token;

    private String remind_in;

    private long expires_in;

    private String uid;

    private String isRealName;

}
