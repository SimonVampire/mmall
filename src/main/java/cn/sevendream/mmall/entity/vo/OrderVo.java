package cn.sevendream.mmall.entity.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * 订单VO
 * @author zhangxue
 * @date 2018年10月30日15:26:00
 */
@Data
public class OrderVo {

    private Long orderNo;

    private BigDecimal payment;

    private Integer paymentType;

    private String paymentTypeDesc;
    private Integer postage;

    private Integer status;


    private String statusDesc;

    private String paymentTime;

    private String sendTime;

    private String endTime;

    private String closeTime;

    private String createTime;

    //订单的明细
    private List<OrderItemVo> orderItemVoList;

    private String imageHost;
    private Integer shippingId;
    private String receiverName;

    private ShippingVo shippingVo;


}
