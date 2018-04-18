package cn.easybuy.mapper;

import java.util.List;
import java.util.Map;

import cn.easybuy.entity.News;

/**
 * @author Vintonsen_lcx
 * @time 2018年4月17日 上午9:18:07
 * @describe 
 */
public interface NewsMapper {

	/**
	 * 添加公告
	 * @param news
	 * @return
	 */
	int add(News news);
	
	/**
	 * 更新公告
	 * @param news
	 * @return
	 */
	int update(News news);
	
	/**
	 * 通过id删除公告
	 * @param id
	 * @return
	 */
	int deleteById(Integer id);

	/**
	 * 通过id获取公告
	 * @param id
	 * @return
	 */
	News getNameById(Integer id);
	
	/**
	 * 按条件查询公告并分页
	 * @param map
	 * @return
	 */
	List<News> queryNewsList(Map<String, Object> map);

	/**
	 * 按添加查询公告数量
	 * @param map
	 * @return
	 */
	int queryNewsCount(Map<String, Object> map);
}
