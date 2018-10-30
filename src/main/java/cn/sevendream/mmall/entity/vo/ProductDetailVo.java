package cn.sevendream.mmall.entity.vo;

import lombok.Data;

import java.math.BigDecimal;
/**
 *产品明细
 * @author zhangxue
 * @date 2018年10月30日15:26:00
 */
@Data
public class ProductDetailVo {

    private Integer  id;
    private Integer categoryId;
    private String name;
    private String subtitle;
    private String mainImage;
    private String subImages;
    private String detail;
    private BigDecimal price;
    private Integer stock;
    private Integer status;
    private String createTime;
    private String updateTime;


    private String imageHost;
    private Integer parentCategoryId;


}
