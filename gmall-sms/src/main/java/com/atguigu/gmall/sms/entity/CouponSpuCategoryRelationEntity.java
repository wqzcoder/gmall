package com.atguigu.gmall.sms.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 优惠券分类关联
 * 
 * @author wangqingze
 * @email wqzcoder@163.com
 * @date 2020-07-06 11:32:02
 */
@ApiModel
@Data
@TableName("sms_coupon_spu_category_relation")
public class CouponSpuCategoryRelationEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	@ApiModelProperty(name = "id",value = "id")
	private Long id;
	/**
	 * 优惠券id
	 */
	@ApiModelProperty(name = "couponId",value = "优惠券id")
	private Long couponId;
	/**
	 * 产品分类id
	 */
	@ApiModelProperty(name = "categoryId",value = "产品分类id")
	private Long categoryId;
	/**
	 * 产品分类名称
	 */
	@ApiModelProperty(name = "categoryName",value = "产品分类名称")
	private String categoryName;

}
