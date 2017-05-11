package com.ares.promotion.dao;

import java.util.List;
import java.util.Map;

public interface IDalClient {
	int save(Object o);
	int Delete(Object o);
	int update(Object o);
	
	int save(String sqlId, Object param);
	int Delete(String sqlId, Object param);
	int update(String sqlId, Object param);
	
	int save(String sqlId, Map<String, Object> param);
	int Delete(String sqlId, Map<String, Object> param);
	int update(String sqlId, Map<String, Object> param);
	
	<T> T queryForObject(Class<T> c, Object param);
	<T> T queryForObject(Class<T> c, Map<String, Object> param);
	
	<T> T queryForObject(String sqlId, Class<T> c, Object param);
	Map<String, Object> queryForObject(String sqlId, Object param);
	<T> T queryForObject(String sqlId, Class<T> c, Map<String, Object> param);
	Map<String, Object> queryForObject(String sqlId, Map<String, Object> param);

	<T> List<T> queryForList(Class<T> c, Object param);
	<T> List<T> queryForList(Class<T> c, Map<String, Object> param);
	
	<T> List<T> queryForList(String sqlId, Class<T> c, Object param);
	List<Map<String, Object>> queryForList(String sqlId, Object param);
	<T> List<T> queryForList(String sqlId, Class<T> c, Map<String, Object> param);
	List<Map<String, Object>> queryForList(String sqlId, Map<String, Object> param);
}
