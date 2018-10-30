package cn.sevendream.mmall.entity.vo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * 订单明细
 *
 * @author zhangxue
 * @date 2018年10月30日15:25:09
 */
@Data
public class OrderItemVo {

    private Long orderNo;

    private Integer productId;

    private String productName;
    private String productImage;

    private BigDecimal currentUnitPrice;

    private Integer quantity;

    private BigDecimal totalPrice;

    private String createTime;


}
