package com.ares.promotion.dao.impl;

import java.util.List;
import java.util.Map;

import com.ares.promotion.dao.IPaginationDalClient;
import com.ares.promotion.dao.pagination.Pagination;
import com.ares.promotion.dao.pagination.PaginationResult;

public class PaginationDalClientImpl extends DalClientImpl implements IPaginationDalClient {


	@Override
	public <R> PaginationResult<List<R>> queryForPagination(Class<R> r, Map<String, Object> param, String... sqlIds) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PaginationResult<List<Map<String, Object>>> queryForPagination(Map<String, Object> param, String... sqlIds) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <R> PaginationResult<List<R>> queryForPagination(Class<R> r, Object param, String... sqlIds) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PaginationResult<List<Map<String, Object>>> queryForPagination(Object param, String... sqlIds) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <R> PaginationResult<List<R>> queryForPagination(Class<R> r, Map<String, Object> param,
			Pagination pagination, String... sqlIds) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PaginationResult<List<Map<String, Object>>> queryForPagination(Map<String, Object> param,
			Pagination pagination, String... sqlIds) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <R> PaginationResult<List<R>> queryForPagination(Class<R> r, Object param, Pagination pagination,
			String... sqlIds) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PaginationResult<List<Map<String, Object>>> queryForPagination(Object param, Pagination pagination,
			String... sqlIds) {
		// TODO Auto-generated method stub
		return null;
	}

}
