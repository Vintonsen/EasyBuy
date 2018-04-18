package cn.easybuy.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.easybuy.entity.OrderDetail;

/**
 * @author Vintonsen_lcx
 * @time 2018年4月17日 上午9:37:33
 * @describe 
 */
public interface OrderDetailMapper {

	/**
	 * 添加订单明细
	 * @param orderDetail
	 * @return
	 */
	int add(OrderDetail orderDetail);
	
	/**
	 * 通过id删除订单明细
	 * @param id
	 * @return
	 */
	int deleteById(Integer id);
	
	/**
	 * 通过id获取订单明细
	 * @param id
	 * @return
	 */
	OrderDetail getOrderDetailById(Integer id);
	
	/**
	 * 通过订单id查询订单明细
	 * @param orderId
	 * @return
	 */
	List<OrderDetail> getOrderDetailList(@Param("orderId")Integer orderId);

	/**
	 * 查询所有订单明细
	 * @return
	 */
	int queryOrderDetailCount();
}
