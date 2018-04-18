package cn.easybuy.mapper;

import java.util.List;
import java.util.Map;

import cn.easybuy.entity.User;

/**
 * @author Vintonsen_lcx
 * @time 2018年4月17日 上午11:23:17
 * @describe 
 */
public interface UserMapper {
	
	/**
	 * 添加用户
	 * @param user
	 * @return
	 */
	public int add(User user);
	
	/**
	 * 根据id删除用户
	 * @param id
	 * @return
	 */
	public int delete(Integer id);
	
	/**
	 * 更新用户
	 * @param user
	 * @return
	 */
	public int update(User user);
	
	/**
	 * 分页查询
	 * @param map
	 * @return
	 */
	public List<User> queryByLimit(Map<String, Integer> map);
	
	/**
	 * 查询用户记录数
	 * @return
	 */
	public int count();
	
	/**
	 * 通过loginName或id查询用户
	 * @param user
	 * @return
	 */
	public User getUser(User user);
}
