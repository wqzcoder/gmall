package com.atguigu.gmall.ums.dao;

import com.atguigu.gmall.ums.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author wangqingze
 * @email wqzcoder@163.com
 * @date 2020-07-06 11:56:45
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
