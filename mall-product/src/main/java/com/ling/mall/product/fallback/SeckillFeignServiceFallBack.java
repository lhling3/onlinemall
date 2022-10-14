package com.ling.mall.product.fallback;

import com.ling.common.exception.BizCodeEnum;
import com.ling.common.utils.R;
import com.ling.mall.product.feign.SeckillFeignService;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Created: with IntelliJ IDEA.
 * @author Ling
 * @date 2022-04-25
 **/

@Component
public class SeckillFeignServiceFallBack implements SeckillFeignService {
    @Override
    public R getSkuSeckilInfo(Long skuId) {
        return R.error(BizCodeEnum.TO_MANY_REQUEST.getCode(),BizCodeEnum.TO_MANY_REQUEST.getMessage());
    }
}
