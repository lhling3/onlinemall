package com.ling.mall.auth.feign;

import com.ling.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Description:
 * @Created: with IntelliJ IDEA.
 * @author: Ling
 * @createTime: 2022-04-24 10:37
 **/

@FeignClient("gulimall-third-party")
public interface ThirdPartFeignService {

    @GetMapping(value = "/sms/sendCode")
    R sendCode(@RequestParam("phone") String phone, @RequestParam("code") String code);

}
