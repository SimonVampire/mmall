package cn.sevendream.mmall.service;

import cn.sevendream.mmall.common.ServerResponse;
import cn.sevendream.mmall.entity.vo.CartVo;

/**
 * 购物车服务类
 * @author zhangxue
 * @date 2018年10月30日15:26:00
 */
public interface ICartService {
    ServerResponse<CartVo> add(Integer userId, Integer productId, Integer count);
    ServerResponse<CartVo> update(Integer userId, Integer productId, Integer count);
    ServerResponse<CartVo> deleteProduct(Integer userId, String productIds);

    ServerResponse<CartVo> list(Integer userId);
    ServerResponse<CartVo> selectOrUnSelect(Integer userId, Integer productId, Integer checked);
    ServerResponse<Integer> getCartProductCount(Integer userId);
}
