package cn.sevendream.mmall.service;

import cn.sevendream.mmall.common.ServerResponse;
import cn.sevendream.mmall.entity.pojo.Product;
import cn.sevendream.mmall.entity.vo.ProductDetailVo;
import com.github.pagehelper.PageInfo;
/**
 * 产品服务
 * @author zhangxue
 * @date 2018年10月30日
 */
public interface IProductService {

    ServerResponse saveOrUpdateProduct(Product product);

    ServerResponse<String> setSaleStatus(Integer productId, Integer status);

    ServerResponse<ProductDetailVo> manageProductDetail(Integer productId);

    ServerResponse<PageInfo> getProductList(int pageNum, int pageSize);

    ServerResponse<PageInfo> searchProduct(String productName, Integer productId, int pageNum, int pageSize);

    ServerResponse<ProductDetailVo> getProductDetail(Integer productId);

    ServerResponse<PageInfo> getProductByKeywordCategory(String keyword, Integer categoryId, int pageNum, int pageSize, String orderBy);



}
