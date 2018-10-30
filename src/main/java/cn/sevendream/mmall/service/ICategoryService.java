package cn.sevendream.mmall.service;


import cn.sevendream.mmall.common.ServerResponse;
import cn.sevendream.mmall.entity.pojo.Category;

import java.util.List;

/**
 * 产品分类服务
 * @author zhangxue
 * @date 2018年10月30日
 */
public interface ICategoryService {
    ServerResponse addCategory(String categoryName, Integer parentId);
    ServerResponse updateCategoryName(Integer categoryId, String categoryName);
    ServerResponse<List<Category>> getChildrenParallelCategory(Integer categoryId);
    ServerResponse<List<Integer>> selectCategoryAndChildrenById(Integer categoryId);

}
