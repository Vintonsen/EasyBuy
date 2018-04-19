package cn.easybuy.service.news;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.easybuy.entity.News;
import cn.easybuy.mapper.NewsMapper;
import cn.easybuy.param.NewsParams;
import cn.easybuy.service.mybatis.MyBatisService;

/**
 * @author Vintonsen_lcx
 * @time 2018年4月19日 上午8:16:07
 * @describe 
 */
public class MBNewServiceImpl extends MyBatisService<NewsMapper> implements NewsService{

	@Override
	public void addNews(News news) {
		before();
		try {
			t.add(news);
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		}finally {
			after();
		}
	}

	@Override
	public News findNewsById(String parameter) {
		// TODO Auto-generated method stub
		News news = null;
		before();
		try {
			news = t.getNameById(Integer.parseInt(parameter));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			session.rollback();
		}finally {
			after();
		}
		return news;
	}

	@Override
	public void deleteNews(String parameter) {
		// TODO Auto-generated method stub
		before();
		try {
			t.deleteById(Integer.parseInt(parameter));
		}catch(Exception e){
			e.printStackTrace();
			session.rollback();
		}finally {
			after();
		}
	}

	@Override
	public List<News> queryNewsList(NewsParams param) {
		// TODO Auto-generated method stub
		List<News> newsList = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("title", param.getTitle());
		map.put("sort", param.getSort());
		map.put("init", param.getStartIndex());
		map.put("pageSeze", param.getPageSize());
		
		before();
		try {
			newsList = t.queryNewsList(map);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			session.rollback();
		}finally {
			after();
		}
		
		return newsList;
	}

	@Override
	public Integer queryNewsCount(NewsParams param) {
		// TODO Auto-generated method stub
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("title", param.getTitle());
		int count = 0;
		before();
		
		try {
			count = t.queryNewsCount(map);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			session.rollback();
		}
			after();
		return count;
	}
}
