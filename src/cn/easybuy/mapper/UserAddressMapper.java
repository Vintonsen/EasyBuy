package cn.easybuy.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import cn.easybuy.entity.UserAddress;

/**
 * @author Vintonsen_lcx
 * @time 2018年4月17日 上午11:15:40
 * @describe 
 */
public interface UserAddressMapper {

	/**
	 * 按条件查询并分页
	 * @param map
	 * @return
	 */
	List<UserAddress> queryUserAddressList(Map<String, Object>map);

	/**
	 * 添加用户地址
	 * @param userAddress
	 * @param isDefault
	 * @return
	 */
	int add(UserAddress userAddress,@Param("isDefault") Integer isDefault);
	
	/**
	 * 通过id查询用户地址
	 * @param id
	 * @return
	 */
	UserAddress getUserAddressByid(Integer id);
}
