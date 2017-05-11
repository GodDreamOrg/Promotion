package com.ares.promotion.dao.pagination;

import java.io.Serializable;

public class PaginationResult<R> implements Serializable{
	private static final long serialVersionUID = 1L;
	
	public PaginationResult() {
		super();
	}
	public PaginationResult(Pagination pagination, R r) {
		super();
		this.pagination = pagination;
		this.r = r;
	}
	private Pagination pagination;
	private R r;

	public Pagination getPagination() {
		return pagination;
	}
	public void setPagination(Pagination pagination) {
		this.pagination = pagination;
	}
	public R getR() {
		return r;
	}
	public void setR(R r) {
		this.r = r;
	}
}
