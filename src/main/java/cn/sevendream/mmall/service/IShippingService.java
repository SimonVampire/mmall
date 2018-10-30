package cn.sevendream.mmall.service;

import cn.sevendream.mmall.common.ServerResponse;
import cn.sevendream.mmall.entity.pojo.Shipping;
import com.github.pagehelper.PageInfo;

/**
 * 收货服务
 * @author zhangxue
 * @date 2018年10月30日
 */
public interface IShippingService {

    ServerResponse add(Integer userId, Shipping shipping);
    ServerResponse<String> del(Integer userId, Integer shippingId);
    ServerResponse update(Integer userId, Shipping shipping);
    ServerResponse<Shipping> select(Integer userId, Integer shippingId);
    ServerResponse<PageInfo> list(Integer userId, int pageNum, int pageSize);

}
