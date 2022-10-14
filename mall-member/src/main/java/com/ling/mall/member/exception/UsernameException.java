package com.ling.mall.member.exception;

/**
 * @Description:
 * @Created: with IntelliJ IDEA.
 * @author Ling
 * @date 2022-05-21
 **/
public class UsernameException extends RuntimeException {


    public UsernameException() {
        super("存在相同的用户名");
    }
}
