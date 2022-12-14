package com.ling.mall.product;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.ling.mall.product.dao.AttrGroupDao;
import com.ling.mall.product.dao.SkuSaleAttrValueDao;
import com.ling.mall.product.vo.SkuItemSaleAttrVo;
import com.ling.mall.product.vo.SpuItemAttrGroupVo;
import com.ling.mall.product.service.BrandService;
import com.ling.mall.product.service.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class MallProductApplicationTests {

    @Resource
    private BrandService brandService;

    @Resource
    private CategoryService categoryService;

    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedissonClient redissonClient;

    @Resource
    private AttrGroupDao attrGroupDao;

    @Resource
    private SkuSaleAttrValueDao skuSaleAttrValueDao;

    @Test
    public void test1() {
        List<SkuItemSaleAttrVo> saleAttrBySpuId = skuSaleAttrValueDao.getSaleAttrBySpuId(13L);
        saleAttrBySpuId.forEach(System.out::println);
    }

    @Test
    public void test() {
        List<SpuItemAttrGroupVo> attrGroupWithAttrsBySpuId = attrGroupDao.getAttrGroupWithAttrsBySpuId(130L, 225L);
        attrGroupWithAttrsBySpuId.forEach(System.out::println);
    }

    @Test
    public void testRedisson() {
        System.out.println(redissonClient);
    }

    @Test
    public void testStringRedis() {
        ValueOperations<String, String> ops = stringRedisTemplate.opsForValue();

        //??????
        ops.set("hello","world_" + UUID.randomUUID().toString());

        //??????
        String hello = ops.get("hello");
        System.out.println("?????????????????????:"+hello);
    }

    @Test
    public void testFindPath() {
        Long[] catelogPath = categoryService.findCatelogPath(225l);

        log.info("????????????catelogPath={}", Arrays.asList(catelogPath));
    }

    @Test
    public void testUpload() throws FileNotFoundException {
        // Endpoint????????????????????????Region???????????????????????????
        String endpoint = "oss-cn-beijing.aliyuncs.com";
        // ?????????AccessKey?????????API????????????????????????????????????????????????????????????????????????RAM???????????????API????????????????????????????????? https://ram.console.aliyun.com ?????????
        String accessKeyId = "LTAI4G66cCNM2t7LKE79RaY3";
        String accessKeySecret = "wd0KVDLCO1vVXq4q9aIPTXY7AP7rdW";

        // ??????OSSClient?????????
        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);

        // ??????????????????
        InputStream inputStream = new FileInputStream("C:\\Users\\Jerry\\Desktop\\1.png");

        ossClient.putObject("gulimall-clouds", "1.png", inputStream);

        // ??????OSSClient???
        ossClient.shutdown();

        System.out.println("????????????...");
    }


    @Test
    public void contextLoads() {
        System.out.println(Integer.MAX_VALUE);

    }

}
