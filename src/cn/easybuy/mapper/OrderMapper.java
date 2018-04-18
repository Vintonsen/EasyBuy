package cn.easybuy.mapper;

import java.util.List;
import java.util.Map;

import cn.easybuy.entity.Order;

/**
 * @author Vintonsen_lcx
 * @time 2018年4月17日 上午10:14:47
 * @describe 
 */
public interface OrderMapper {

	/**
	 * 
	 * @param order
	 * @return
	 */
	int add(Order order);
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	int deleteById(Integer id);
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	Order gerOrderById(Integer id);
	
	/**
	 * 
	 * @param map
	 * @return
	 */
	List<Order> getOrderList(Map<String ,Object> map);

	/**
	 * 
	 * @param map
	 * @return
	 */
	int count(Map<String , Integer> map);
}
