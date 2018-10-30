package cn.sevendream.mmall.entity.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 *  订单产品VO
 * @author zhangxue
 * @date 2018年10月30日15:26:00
 */
@Data
public class OrderProductVo {
    private List<OrderItemVo> orderItemVoList;
    private BigDecimal productTotalPrice;
    private String imageHost;


}
