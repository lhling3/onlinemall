package com.ling.mall.search.service;

import com.ling.mall.search.vo.SearchParam;
import com.ling.mall.search.vo.SearchResult;

/**
 * @Description:
 * @Created: with IntelliJ IDEA.
 * @author Ling
 * @date 2022-05-09
 **/
public interface MallSearchService {

    /**
     * @param param 检索的所有参数
     * @return  返回检索的结果，里面包含页面需要的所有信息
     */
    SearchResult search(SearchParam param);
}
