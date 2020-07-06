package com.atguigu.gmall.pms.dao;

import com.atguigu.gmall.pms.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author wangqingze
 * @email wqzcoder@163.com
 * @date 2020-07-05 12:57:00
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
