package cn.sevendream.mmall.entity.vo;

import lombok.Data;

import java.math.BigDecimal;

/**
 *  产品列表VO
 * @author zhangxue
 * @date 2018年10月30日15:26:00
 */
@Data
public class ProductListVo {
    private Integer id;
    private Integer categoryId;
    private String name;
    private String subtitle;
    private String mainImage;
    private BigDecimal price;
    private Integer status;
    private String imageHost;

}
