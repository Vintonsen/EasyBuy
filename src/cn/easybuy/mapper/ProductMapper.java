package cn.easybuy.mapper;

import java.util.List;
import java.util.Map;

import cn.easybuy.entity.Product;

/**
 * @author Vintonsen_lcx
 * @time 2018年4月17日 上午11:03:09
 * @describe 
 */
public interface ProductMapper {

	/**
	 * 通过id更新库存
	 * @param product
	 * @return
	 */
	int updateStock(Product product);
	
	
	/**
	 * 添加商品
	 * @param product
	 * @return
	 */
	int add(Product product);
	
	/**
	 * 更新商品
	 * @param product
	 * @return
	 */
	int update(Product product);
	
	/**
	 * 通过id删除商品
	 * @param id
	 * @return
	 */
	int deleteProductByid(Integer id);

	/**
	 * 通过id查找商品
	 * @param id
	 * @return
	 */
	Product getProductById(Integer id);

	/**
	 * 按条件查询分页
	 * @param map
	 * @return
	 */
	List<Product> getProductList(Map<String, Object>map);
	
	/**
	 * 按条件查询总商品数量
	 * @param map
	 * @return
	 */
	int queryProductCount(Map<String, Object>map);
}


