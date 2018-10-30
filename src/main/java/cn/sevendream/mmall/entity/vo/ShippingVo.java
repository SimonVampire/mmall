package cn.sevendream.mmall.entity.vo;

import lombok.Data;

/**
 * 收货信息vo
 * @author zhangxue
 * @date 2016/10/31
 */
@Data
public class ShippingVo {
    private String receiverName;

    private String receiverPhone;

    private String receiverMobile;

    private String receiverProvince;

    private String receiverCity;

    private String receiverDistrict;

    private String receiverAddress;

    private String receiverZip;

}
