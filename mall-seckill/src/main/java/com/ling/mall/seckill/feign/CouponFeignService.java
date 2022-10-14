package com.ling.mall.seckill.feign;

import com.ling.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Description:
 * @Created: with IntelliJ IDEA.
 * @author Ling
 * @date 2022-06-16
 **/

@FeignClient("gulimall-coupon")
public interface CouponFeignService {

    /**
     * 查询最近三天需要参加秒杀商品的信息
     * @return
     */
    @GetMapping(value = "/coupon/seckillsession/Lates3DaySession")
    R getLates3DaySession();

}
