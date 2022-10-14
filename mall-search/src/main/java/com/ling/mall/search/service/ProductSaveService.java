package com.ling.mall.search.service;

import com.ling.common.es.SkuEsModel;

import java.io.IOException;
import java.util.List;

/**
 * @Description:
 * @Created: with IntelliJ IDEA.
 * @author Ling
 * @date 2022-05-09
 **/
public interface ProductSaveService {

    boolean productStatusUp(List<SkuEsModel> skuEsModels) throws IOException;
}
