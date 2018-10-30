package cn.sevendream.mmall.entity.vo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * 购物车产品信息
 * @author zhangxue
 * @date 2018年10月30日15:23:08
 */
@Data
public class CartProductVo {

//结合了产品和购物车的一个抽象对象

    private Integer id;
    private Integer userId;
    private Integer productId;
    private Integer quantity;//购物车中此商品的数量
    private String productName;
    private String productSubtitle;
    private String productMainImage;
    private BigDecimal productPrice;
    private Integer productStatus;
    private BigDecimal productTotalPrice;
    private Integer productStock;
    private Integer productChecked;//此商品是否勾选

    private String limitQuantity;//限制数量的一个返回结果


}
