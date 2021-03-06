package com.imooc.mall.dao;

import com.imooc.mall.pojo.Product;

import java.util.List;
import java.util.Set;

public interface ProductMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);

    List<Product> selectByCategoryList(List<Integer> categoryIdList);

    List<Product> selectByProductIdSet(Set<Integer> productIdSet);
}
