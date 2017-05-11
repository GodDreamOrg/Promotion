package com.ares.promotion.dao;

import java.util.List;
import java.util.Map;

import com.ares.promotion.dao.pagination.Pagination;
import com.ares.promotion.dao.pagination.PaginationResult;

public interface IPaginationDalClient extends IDalClient{
	<R> PaginationResult<List<R>> queryForPagination(Class<R> r ,Map<String, Object> param , String...sqlIds);
	
	PaginationResult<List<Map<String,Object>>> queryForPagination(Map<String, Object> param, String...sqlIds);
	
	<R> PaginationResult<List<R>> queryForPagination(Class<R> r ,Object param, String...sqlIds);
	
	PaginationResult<List<Map<String,Object>>> queryForPagination(Object param, String...sqlIds);
	
	<R> PaginationResult<List<R>> queryForPagination(Class<R> r ,Map<String, Object> param ,Pagination pagination, String...sqlIds);
	
	PaginationResult<List<Map<String,Object>>> queryForPagination(Map<String, Object> param ,Pagination pagination, String...sqlIds);
	
	<R> PaginationResult<List<R>> queryForPagination(Class<R> r ,Object param ,Pagination pagination, String...sqlIds);
	
	PaginationResult<List<Map<String,Object>>> queryForPagination(Object param ,Pagination pagination, String...sqlIds);
	
}
