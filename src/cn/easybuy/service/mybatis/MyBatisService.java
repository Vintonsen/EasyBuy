package cn.easybuy.service.mybatis;

import java.lang.reflect.ParameterizedType;
import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import cn.easybuy.utils.MyBatisUtil;

/**
 * @author Vintonsen_lcx
 * @time 2018年4月19日 上午8:40:23
 * @describe 
 */
public class MyBatisService<T> {
	
	public T t;
	public SqlSession session;
	
	public Class<T> entityClass = (Class<T>) ((ParameterizedType) this
			.getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	
	public void setEntityClass(Class<T> entityClass){
		this.entityClass = entityClass;
	}
	
	public Class<T> getEntityClass(){
		return entityClass;
	}
	
	public void before() {
		session = MyBatisUtil.getSession();
		t = session.getMapper(entityClass);
	}
	
	public Map<String, Integer> getPage(Integer init,Integer pageSize){
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("init",(init-1) * pageSize);
		map.put("pageSize", pageSize);
		return map;
	}
	
	public void after() {
		session.commit();
		session.close();
	}
}
